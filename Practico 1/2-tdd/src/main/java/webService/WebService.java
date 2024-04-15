package webService;

// import java.util.List;

public class WebService implements IWebService {

   @Override
   public void Notify(String msg) {
    System.err.println("Ha fallado la suma por: " + msg);
   }

}
