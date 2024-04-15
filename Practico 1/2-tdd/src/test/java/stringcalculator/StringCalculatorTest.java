package stringcalculator;

import org.junit.jupiter.api.Test;

import Logger.Log;
import Logger.MockLogger;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.Arguments;
// import org.junit.jupiter.params.provider.MethodSource;
// import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;

// import java.util.List;
// import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
// import static org.junit.jupiter.params.provider.Arguments.arguments;


public class StringCalculatorTest {
  @Test
  public void testStringEmpty() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("");
    assertThat(res).isEqualTo(0);
  }

  @Test
  public void testString1Number() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("5");
    assertThat(res).isEqualTo(5);
  }

  @Test
  public void testString2Numbers() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("5,6");
    assertThat(res).isEqualTo(11);
  }

  @Test
  public void testString5Numbers() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("5,5,5,5,5");
    assertThat(res).isEqualTo(25);
  }

  @Test
  public void testStringNewDelimiter() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("5\n5\n5\n5\n5");
    assertThat(res).isEqualTo(25);
  }

  @Test
  public void testStringDelimiterCustom() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//;\n1;2;3");
    assertThat(res).isEqualTo(6);
  }

  @Test
  public void testNegativeNumber() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//;\n-1000;2;1000;5");
    assertThat(res).isEqualTo(7);
  }

  @Test
  public void testIgnoreBigger1000() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//;\n1000;2;1000;5");
    assertThat(res).isEqualTo(2007);
  }

  @Test
  public void testDelimiterAnyLong() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//[***]\n1000***2***1000***5");
    assertThat(res).isEqualTo(2007);
  }

  @Test
  public void test2Delimiters() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//[*][+]\n1000*6+1000+5");
    assertThat(res).isEqualTo(2011);
  }

  @Test
  public void testMultiDelimiters() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//[*][+][|]\n1000*6+1000|5+3*1|2");
    assertThat(res).isEqualTo(2017);
  }

  @Test
  public void testDelimitersAny() throws Exception {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//[yzk][///][###]\n1000yzk6///1000yzk5###3###1///2");
    assertThat(res).isEqualTo(2017);
  }


  @Test
  public void testDelimiters() {
    Log log = new Log();
    StringCalculator str = new StringCalculator(log);
    int res = str.add("//]yzk[[///][###]\n1000yzk6yzk1000yzk5###3###1///2");
    assertThat(res).isEqualTo(2017);
  }

  @Test
  public void testGetNumber() {
    String res = StringCalculator.getNumber("1000yzk6yzk1000yzk5###3###1///2");
    assertThat(res).isEqualTo("1000");
  }

  @Test
  public void testTakeNumber() {
    String res = StringCalculator.takeNumber("1000yzk6yzk1000yzk5###3###1///2", "1000");
    assertThat(res).isEqualTo("yzk6yzk1000yzk5###3###1///2");
  }

  @Test
  public void testGetDelimiter() {
    String res = StringCalculator.getDelimiter("yzk6yzk1000yzk5###3###1///2");
    assertThat(res).isEqualTo("yzk");
  }

  @Test
  public void testTakeDelimiter() {
    String res = StringCalculator.takeDelimiter("yzk6yzk1000yzk5###3###1///2", "yzk");
    assertThat(res).isEqualTo("6yzk1000yzk5###3###1///2");
  }


  @Test
  public void testCallAddLogger() {
    MockLogger mockLog = new MockLogger();
    StringCalculator str = new StringCalculator(mockLog);
    str.add("");

    assertEquals("Sum result: 0", mockLog.getMensaggeLog(0));
    assertEquals(true, mockLog.invoked());
  }

  @Test
  public void testAddStringNumberLogger() {
    MockLogger mockLog = new MockLogger();
    StringCalculator str = new StringCalculator(mockLog);
    str.add("//[yzk][///][###]\n1000yzk6///1000yzk5###3###1///2");


    assertEquals("Sum result: 2017", mockLog.getMensaggeLog(0));
    assertEquals(true, mockLog.invoked());
  }

}
