package Logger;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

import stringcalculator.StringCalculator;

public class LogTest {
  @Test
  public void add_callLogger() {
    Log log = new Log();
    StringCalculator strCalc = new StringCalculator(log);
    strCalc.add("");
    assertThat(strCalc).isEqualTo(strCalc);
  }
}
