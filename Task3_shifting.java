
Task3 shifting java 
public class shifting {
    public static void main(String [] args){
        int [] source = {10,20,30,40,50};
        rightShift(source);

    }
    public static void rightShift(int[] s){
        for(int i= s.length-1; i>=1;i--){
            s[i] = s[i-1];
        }
        s[0] = 0;
        }
}
// right rotating an array by one place
// int temp=s[s.length-1];
