package stringcalculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class DelimiterTest {

  @Test
  public void TestHasDelimiter() {
    boolean res = Delimiter.stringHasDelimiter("//;\n1;2");
    assertThat(res).isEqualTo(true);
  }

  @Test
  public void TestExtractDelimiter() {
    String res = Delimiter.extractDelimiter("//;\n1;2");
    assertThat(res).isEqualTo(";");
  }

}
