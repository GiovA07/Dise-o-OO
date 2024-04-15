package stringcalculator;

import org.junit.jupiter.api.Test;
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
  public void testStringEmpty() {
      int res = StringCalculator.add("");
      assertThat(res).isEqualTo(0);
  }

  @Test
  public void testString1Number() {
      int res = StringCalculator.add("5");
      assertThat(res).isEqualTo(5);
  }

  @Test
  public void testString2Numbers() {
      int res = StringCalculator.add("5,6");
      assertThat(res).isEqualTo(11);
  }

  @Test
  public void testString5Numbers() {
      int res = StringCalculator.add("5,5,5,5,5");
      assertThat(res).isEqualTo(25);
  }

  @Test
  public void testStringNewDelimiter() {
      int res = StringCalculator.add("5\n5\n5\n5\n5");
      assertThat(res).isEqualTo(25);
  }

  @Test
  public void testStringDelimiterCustom() {
    int res = StringCalculator.add("//;\n1;2;3");
    assertThat(res).isEqualTo(6);
  }

  @Test
  public void testStringNumberNegative() {
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
          StringCalculator.add("//;\n-1;2;3");
      });
  }


  @Test
  public void testIgnoreBigger1000() {
    int res = StringCalculator.add("//;\n1000;2;1000;5");
    assertThat(res).isEqualTo(7);
  }


}
