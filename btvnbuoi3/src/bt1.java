import java.util.Scanner;

public class bt1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double r= scanner.nextDouble();
        double PI= 3.14;
        double chuVi= 2*PI*r;
        double dienTich= PI*r*r;
        System.out.printf("%.3f %.3f", chuVi, dienTich);
    }
}
