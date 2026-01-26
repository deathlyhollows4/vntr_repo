
import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int x = 0;
    for (int i = 0; i < arr.length; i++) {
        x = x + arr[i];
    }
    System.out.print(x);


}


