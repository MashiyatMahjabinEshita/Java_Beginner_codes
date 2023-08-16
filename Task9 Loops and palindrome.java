Task9 Loops and palindrome

package Eshita;
import java.util.Scanner;
public class nestedloop {
    public static void main(String[] args) {
        // for(int i=0; i<3; i++) {
        //    int j;
        //  for (j = 0; j < 2; j++) ;
        //  System.out.println(i + "" + j);
        // }
        //for(int i =1; i<=5; i++) {
        //for (int j = 1; j <= i; j++)
        //  System.out.println(("*"));
        // System.out.println();
        //} // multiplication table by loop
        // for(int i =1; i<=100; i+=3)
        // if(i%2==0) // i%2!=0 for odd,decrease i=100,i>=1,i--,i-=2,even i=-2,i<=100,i+=2
        //System.out.print(i+" ");
        // int i =100;
        // while(i>=1){
        //if(i%2==0)
        //System.out.print(i+" ");
        // i--;
        // }
        //New exercise 7
        //Scanner s = new Scanner(System.in);

        //System.out.print("Enter a positive int number:");
        //int n = s.nextInt();
        //int result = 0;
        //int result = 0;
        //int v1 = 1;
        //int v2 = 1;
        //for(int i = 1; i<= n-2; i++){
        //result = v1+v2;
        //v1 = v2;
        //v2 = result;


        // }

        //System.out.println("Result = " + (result == 0 ? 1: result) );
        //String str = "ab cd"; //new iteration over string

        //for (int i = 0; i <= str.length() - 1; i++)
            //System.out.print(str.charAt(i) + "");
        //loop exercise9 displays the reverse of a string
       // String str = "some text";
       // for(int i = str.length()-1;i>=0;i--)
            //System.out.print(str.charAt(i));
        //reverse the string in a new reverse then display reverse
        //String reverse = "";

        //for(int i = str.length()-1;i>=0;i--)
            //reverse += str.charAt(i);// re = re + str.charAt(i)
        //System.out.println(reverse);
        //Palindromic string increment i, decrement j
        //String str = "noon";
       // boolean isPalindrome = true;
        //int j = str.length()-1;
        //for(int i =0,j = str.length()-1; i<j;i++,j--){
            //if(str.charAt(i) == str.charAt(j))
               // continue;
            //isPalindrome = false;
            //break; //j--;

        //}
        //System.out.println(isPalindrome?"Palindrome": "Not Palindrome");
        //Ex11 reads integer from user and do triangle
        //Scanner s = new Scanner(System.in);
        //int n = s.nextInt();

        //for(int i = 1; i<= n; i++){
            //for(int j = 1; j<=i; j++)
                //System.out.println(i);

            //System.out.println();
        //} //new exercise
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n-i; j++)
                System.out.println(" ");
            for(int j=1;j<=i;j++)
                System.out.println("*");

            System.out.println();
        }

    }
}
