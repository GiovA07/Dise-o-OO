package bowling;
import java.util.List;
import java.util.ArrayList;

public class Game {
  private Frame[] frames = new Frame[11];

  private int totalFrames = 0;
  private boolean extraRoll = false;
  List<Frame> rolls = new ArrayList<>();


  public Game() {
    for (int i = 0; i < frames.length; i++) {
      frames[i] = new Frame();
    }
  }

  public void Roll(int numPines) {
    Frame frame = frames[totalFrames];
    if (numPines <= 10) {
      frame.addRoll(numPines);
      
      if(numPines == 10 && !extraRoll) {
        frame.addRoll(0);
      }

      if(frame.isCompleted()){
        totalFrames++;
      }

      if(totalFrames-1 == 9 && (frame.isStrike() || frame.isParce()))
        extraRoll = true;

    } else {
      throw new IllegalArgumentException("Number of pins invalid: " + numPines);
    }
  }

  public int score() {
    int score = 0;

    if(extraRoll)
      totalFrames--;

    for (int indexFrame = 0; indexFrame < totalFrames; indexFrame++) {
      Frame frame = frames[indexFrame];
      score += frame.getScoreFrame();

      if(frame.isStrike()) {

        score += strikeBonus(indexFrame);

      } else if(frame.isParce()) {

        score += parceBonus(indexFrame);
      }

    }
    return score;
  }


  public int strikeBonus(int indexFrame) {
    Frame sigFrame = frames[indexFrame+1];
    if (indexFrame == 9 && extraRoll)
      return sigFrame.getScoreFrame();

    if(sigFrame.isStrike())
      return sigFrame.getScoreFrame() + frames[indexFrame+2].getRoll1();

    return sigFrame.getScoreFrame();
  }

  public int parceBonus(int indexFrame) {
    return frames[indexFrame+1].getRoll1();
  }

}
















// package bowling;

// public class Game {
//   private static final int totalFrames = 10;
//   private int totalRolls = 0;
//   int[] rolls = new int[21];

//   public void rollBall(int numPines) {
//     rolls[totalRolls] = numPines;
//     totalRolls++;
//   }

//   public int score() {
//     int score = 0;
//     int indexRoll = 0;
//     for (int frame = 0; frame < totalFrames; frame++) {
//       if (isStrike(indexRoll)) {
//         score += rolls[indexRoll] + rolls[indexRoll+1] + rolls[indexRoll+2];
//         indexRoll++;
//       } else {
//         if (isParce(indexRoll)) {
//           score += rolls[indexRoll] + rolls[indexRoll+1] + rolls[indexRoll+2];
//           indexRoll += 2;
//         } else {
//           score += rolls[indexRoll] + rolls[indexRoll+1];
//           indexRoll += 2;
//         }
//       }
//     }
//     return score;
//   }


//   private boolean isStrike(int index) {
//     boolean res = false;
//     if (rolls[index] == 10) {
//       res = true;
//     }
//     return res;
//   }

//   private boolean isParce(int index) {
//     boolean res = false;
//     if (rolls[index] + rolls[index+1] == 10) {
//       res = true;
//     }
//     return res;
//   }
// }
