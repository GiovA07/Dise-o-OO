package stringcalculator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class DelimiterTest {

  private Delimiter delimiter;

  @BeforeEach
  void setUp() {
    this.delimiter = new Delimiter();
  }

  @Test
  public void getDelimiterTest() {
    List<String> delimitersList = delimiter.getDelimiter();
        // Verifica si delimitersList contiene los delimitadores esperados
    assertEquals(2, delimitersList.size());
    assertEquals(",", delimitersList.get(0));
    assertEquals("\n", delimitersList.get(1));
  }

}
