Task4_loops

package Eshita;
import java.util.Scanner;
public class loop {
    public static void main(String [] args){
        Scanner s =  new Scanner(System.in);

        int n = s.nextInt();
        while (n<1 || n> 10){
            System.out.println(" is not between 1 & 10.Try again:" + n );
            n=s.nextInt();

        }
        System.out.println(n+" is between 1 and 10");
    }
}
// while: 1st check condition then execute;do while opposite