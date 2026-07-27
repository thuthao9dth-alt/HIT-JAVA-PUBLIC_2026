import java.util.Scanner;

public class bt2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String cHuoi = scanner.nextLine();
        boolean palindrome = true;
        for (int i= 0; i< cHuoi.length() / 2; ++i) {
            if (cHuoi.charAt(i) != cHuoi.charAt(cHuoi.length()-1-i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println(cHuoi.toUpperCase());
            System.out.println("chuoi nay doi xung");
        } else {
            System.out.println(cHuoi.toLowerCase());
            System.out.println("chuoi nay khong doi xung");
        }
    }
}

