public class b_LinearSearch {
    public static void main(String[] args) {
        int arr[]={2,8,3,6,4,5,9};
        int target=7;
        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int[] arr,int target){
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]==target) return i;
            i++;
        }
        return -1;
    }
}
