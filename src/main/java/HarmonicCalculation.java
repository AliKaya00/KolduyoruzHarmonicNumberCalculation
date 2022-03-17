import java.util.Scanner;

public class HarmonicCalculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a ;
        System.out.println("Insert a number");
        a=scanner.nextInt();
        double result= 0d;
        for (double i = 1; i <= a; i++) {
            result += (1/i);

            
        }
        System.out.println(result);


    }
}
