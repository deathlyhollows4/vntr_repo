import java.util.Scanner;

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int row = sc.nextInt();
    int col = sc.nextInt();
    for (int i = 1; i <= row; i++) {
        for(int j = row-i; j>=0; j--){
            System.out.print(j+1);
        }
        System.out.println();
    }

}