Task_ReverseArray

public class reversearray {
    public static void main(String[] args){
        int[] source = {10,20,30,40,50};
    }
    public static int[] reverse(int[] s) {
        int[] dest = new int[s.length]; //new and old same length
        for (int i = 0, j = dest.length - 1; i < s.length; i++, j--) {
            dest[j] = s[i];
            //return s;
        }
        return dest;
    }
}
//7

