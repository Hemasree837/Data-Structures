public class b_LinearSearch2 {
    public static void main(String[] args) {
        String str="Banana";
        System.out.println(replaceA(str));
    }
    public static String replaceA(String str)
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='A')
            {
                result+='*';
            }
            else result+=str.charAt(i);
        }
        return result;
    }
}
//B*n*n*
