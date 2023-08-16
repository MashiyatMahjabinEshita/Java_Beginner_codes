Task_Sum


// display sum,product,average of an integer array
public class arraytwo {
    public static void main(String[] args){
        int[] numbers = {1,2,-3,5,7};

        int sum = 0;
        int product = 1;
        double average;

        for(int i =0; i<numbers.length;i++){
            sum+=numbers[i];
            product *= numbers[i];

        }
        average = (double)sum / numbers.length;
        System.out.println("Sum="+sum+",product="+product+",average:"+average);
    }
}

Extra 
// Print value //
public class lineararitterate {
    public static void main(String [] args){
        int[] a = {10,20,30,40,50};
        print(a);
    }
    public static void print(int[] y){
        for(int value:y){
            System.out.println(value);
        }
        y[0] = 250;
    }
}
//6