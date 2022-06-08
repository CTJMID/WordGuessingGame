package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class gameTest {
  @Test public void testGetsWordToGuess() {
    game game = new game();
    assertEquals(game.getWordToGuess(), "B_____");
  }
}
