package Logger;

import java.util.List;
import java.util.ArrayList;

public class Log implements ILogger {

  private List<String> logger;

  public Log() {
    this.logger = new ArrayList<>();
  }

  @Override
  public void write(String toWrite) {
    logger.add(toWrite);
  }
}

// public class Log implements ILogger {

//   public String logger;

//   public Log() {
//     this.logger = "";
//   }



//   @Override
//   public void write(String toWrite) {
//     logger = (toWrite);
//   }
// }
