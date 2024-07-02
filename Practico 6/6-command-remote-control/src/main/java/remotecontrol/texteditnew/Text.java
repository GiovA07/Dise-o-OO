package remotecontrol.texteditnew;

import java.util.ArrayList;
import java.util.List;


public class Text {
  private List<String> buffer;

  public Text() {
    buffer = new ArrayList<>();
  }

  public List<String> getLines() {
    return buffer;
  }
}
