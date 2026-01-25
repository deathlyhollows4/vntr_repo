import java.util.Scanner;

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int row = sc.nextInt();
   // int col = sc.nextInt();
    int nsp= row-1;
    int nst=1;
    for (int i = 1; i <= 2*row-1; i++) {
        int k = 1;
        for(int j = 1; j<= 2*row-1; j++){
        if(i<j) System.out.print(i+" ");
        else System.out.print(j+" ");
        }
        
        System.out.println();
    }
    
    System.out.println("done");

}