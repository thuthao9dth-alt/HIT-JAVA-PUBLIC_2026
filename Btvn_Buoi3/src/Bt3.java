import java.util.Scanner;
import java.util.Random;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a= random.nextInt(101);
        int b= random.nextInt(101);
        int c = random.nextInt(201);
        System.out.println(a + " +" + b + " =" + c);
        String answer = scanner.next();
        if ((a + b != c || !answer.equalsIgnoreCase("đúng")) && (a + b == c || !answer.equalsIgnoreCase("sai"))) {
            System.out.println("Bạn trả lời sai");
        } else {
            System.out.println("Bạn đã trả lời đúng");
        }
    }
}
