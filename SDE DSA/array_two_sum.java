import java.util.Scanner;
public class array_two_sum {
    public static boolean two_sum(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target: ");
        int n = sc.nextInt();
        System.out.println(two_sum(arr, n));
    }
}
