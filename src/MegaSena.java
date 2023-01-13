import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        int x;
        Random generate = new Random();
        int i = 0;
        while (i < 6) {
            int number = generate.nextInt(68);
            System.out.println(number);
            i++;
        }
    }
}
