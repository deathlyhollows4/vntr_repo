import java.util.Scanner;

public class array_revers_arr {
    public static void reverse_arr(int arr[]){
        int mid = ((arr.length - 1)/2)+1;
        int j = arr.length - 1;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse_arr(arr);
        for( int ele : arr){
            System.out.println(ele+" ");
        }
    }
}
