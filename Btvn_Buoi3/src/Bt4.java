import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int trungVi= ((a>b && a< c) ||(a<b && a>c)) ? a:((b> a && b< c) || (b< a && b> c)) ?b: c;
        System.out.println("số trung vị là: " + trungVi);
    }
}
