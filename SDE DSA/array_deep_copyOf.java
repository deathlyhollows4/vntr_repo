import java.util.Scanner;
import java.util.Arrays;

public class array_deep_copyOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println();

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        arr2[2] = 100;
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]+" ");
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+" ");
        }
    }
    
}
