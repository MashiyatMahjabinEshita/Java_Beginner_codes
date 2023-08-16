Task12_Array

// fills an array with n int by the user
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements?(max 20): ");
        int n = input.nextInt();

        while (n>20 || n<=0){
            System.out.print("Invalid,try again");
            n = input.nextInt();
        }

        int[] numbers = new int[n];
        fillArrayOfIntegers(numbers);
        printArrayofIntegers(numbers);
    }

    private static void printArrayofIntegers(int[] numbers) {
        System.out.print("The elements are:");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for(int i =0; i<numbers.length;i++)
            numbers[i] = input.nextInt();
        
    }

}
