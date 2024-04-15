package output;

public class Terminal implements Output {
    @Override
    public void print(int toPrint) {
        System.out.println(toPrint);
    }
}
