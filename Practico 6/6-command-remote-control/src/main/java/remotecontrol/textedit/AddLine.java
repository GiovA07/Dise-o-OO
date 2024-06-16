package remotecontrol.textedit;
import java.util.List;
public class AddLine {
  List<String> buffer;

  public AddLine (List<String> buffer){
    this.buffer = buffer;
  }

  public void addLine(int index, String line) {
    buffer.add(index, line);
  }


}
