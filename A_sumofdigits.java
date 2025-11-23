import java.util.*;
public class A_sumofdigits {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(sumOfdigits(n));
        }    
        public static int sumOfdigits(int n)
        {
            if (n==0) return 0;
            return (n%10)+sumOfdigits(n/10);
        }
}


