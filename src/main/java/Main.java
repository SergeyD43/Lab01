import java.io.File;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <args.length ; i++) {
            new SearchWords(new File(args[i])).start();
        }
    }
}
