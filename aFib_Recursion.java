public class aFib_Recursion {
    public static void main(String[] args) {
       System.out.println(fibonacci(6)); 
    }
    public static int fibonacci(int num)
    {
       if(num<=1)
       {
        return num;
       }
       return fibonacci(num-1)+fibonacci(num-2);
    }
}
