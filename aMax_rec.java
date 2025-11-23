public class aMax_rec {
    public static void main(String args[])
    {
        int arr[]={3,7,5,2,20,32,4};
        System.out.println(maxValue(arr, 0));
    }
    public static int maxValue(int[] arr,int i)
    {
        if(i==arr.length-1) return arr[i];
        return Math.max(arr[i],maxValue(arr, i+1));
    }
}
