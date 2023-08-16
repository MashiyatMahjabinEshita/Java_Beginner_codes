Task2D_array
public class twodimension {
    public static void main(String[] args){
        int[][] integers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        for(int i = 0; i<3; i++){ // i<4
            int sum =0;
            for(int j =0; j<4;j++) //j<3
                sum+=integers[i][j];//[j][i] this change will give the sum

            System.out.println("The sum of row"+(i+1)+":"+sum);
        }
    }
}
