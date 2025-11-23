import java.util.*;
public class A_1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print1toN(n);
    }
    public static void print1toN(int n){
        if(n==0) return ;
        print1toN(n-1);
        System.out.println(n);
    }
}
