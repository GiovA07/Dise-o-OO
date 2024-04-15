package Logger;

import java.util.ArrayList;
import java.util.List;

public class MockLogger implements ILogger{
    private List<String> mensaggeLog = new ArrayList<>();
    private boolean invoked = false;

    @Override
    public void write(String toWrite) {
      invoked = true;
      mensaggeLog.add(toWrite);
    }

    public String getMensaggeLog(int i) {
      return mensaggeLog.get(i);
    }


    public boolean invoked() {
      return invoked;
    }
}
