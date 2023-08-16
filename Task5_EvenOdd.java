Task3_EvenOdd

package Eshita;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args){
        System.out.print("Enter a number:");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2 == 0)
            System.out.println("Even");
        if(n%2==1);
        System.out.println("Odd");


    }
}
