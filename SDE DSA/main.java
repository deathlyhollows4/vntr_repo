import java.util.Scanner;

public static long fact(int n){
    if(n==1 || n==0){
        return 1;
    }
    return n*fact(n-1);
}
public static long nCr(int n, int r){
    if(n<r || n<0 || r<0) return -1;
    long n_ = fact(n);
    long r_ = fact(r);
    long n1 = fact(n-r);

    return n_/((n1)*r_);

}

public static void hagimaru_tanu(int x){
    x =10;

}




public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    // int n = sc.nextInt();
    // int r = sc.nextInt();
    
    // System.out.println(nCr(n, r));
    // System.out.println();
    int x = 6;
    System.out.println(x);
    hagimaru_tanu(x);
    System.out.println(x);


}