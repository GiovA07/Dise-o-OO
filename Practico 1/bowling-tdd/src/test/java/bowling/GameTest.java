package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.Arguments;
// import org.junit.jupiter.params.provider.MethodSource;
// import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

// import java.util.List;
// import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
// import static org.junit.jupiter.params.provider.Arguments.arguments;



public class GameTest {
  private Game game;

  @BeforeEach
  void setUp() {
    this.game = new Game();
  }

  @Test
  public void testGameIncialiced() {
    assertNotNull(game);
  }

  @Test
  public void testRollBall() {
    game.Roll(0);
    game.Roll(0);
    assertEquals(game.score(), 0);
  }

  @Test
  public void testPunt1() {
    int rolls = 20;
    for (int i = 0; i < rolls; i++) {
        game.Roll(1);
    }
    int puntaje = game.score();
    assertEquals(20, puntaje);
  }

  @Test
  public void testScore() {
    int rolls = 20;
    for (int i = 0; i < rolls; i++) {
      game.Roll(0);
    }
    assertEquals(game.score(), 0);
  }

  @Test
  public void testPinsInvalid() {
      Assertions.assertThrows(IllegalArgumentException.class, () -> {
        game.Roll(11);
      });
  }

  @Test
  public void testPerfectGame() {
    int rolls = 12;
    for (int i = 0; i < rolls; i++) {
        game.Roll(10);
    }
    int puntaje = game.score();
    assertEquals(300, puntaje);
  }

  @Test
  public void testSpare() {
    int rolls = 22;
    for (int i = 0; i < rolls; i++) {
        game.Roll(5);
    }
    int puntaje = game.score();
    assertEquals(150, puntaje);
  }

}
