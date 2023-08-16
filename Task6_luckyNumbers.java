Task6_luckyNumbers
package Eshita;
import java.util.Scanner;
public class lucky {
    public static void main(String[] args){
        System.out.print("Enter the 4 digit number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (!(n>999 && n<10000)){
            System.out.println("Not a Lucky Number");
        }
        int fourthDigit = n%10; //D
        ///ABCD
        int thirdDigit = (n/10) % 10; // ABC%10=C
        int secondDigit = (n/100) % 10; //AB%10=B
        int firstDigit = (n/1000) % 10; //A%10 = A

        if(firstDigit+secondDigit == thirdDigit+fourthDigit)
            System.out.println("Lucky Number");
        else
            System.out.println("Not a lucky Number");
    }
}
