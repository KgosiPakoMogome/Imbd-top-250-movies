import java.util.Random;
public class movieWatch {
    public static void main(String[] args) {
        Random random = new Random();
        int movieNo = random.nextInt(1,250);
        System.out.println(movieNo);
    }
}
