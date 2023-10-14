import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Arrays.sort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
