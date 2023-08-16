Array of Points

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

// fills an array with n int by the user
public class arrayofpoints {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements?(max 20): ");
        int n = input.nextInt();

        while (n>20 || n<=0){
            System.out.print("Invalid,try again");
            n = input.nextInt();
        }

        Point[] numbers = new Point[n];
        fillArrayOfPoints(numbers);
        printArrayOfPoints(numbers);
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.println("The elements are:");
        //System.out.println(Arrays.toString(numbers));
        for(int i =0; i< points.length;i++)
            System.out.println("("+points[i].x+","+points[i].y+")");
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point" + (i+1) + ":");

            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

}

