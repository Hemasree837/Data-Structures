public class b_BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(result(arr,target));
    }
    public static int result(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if (mid==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
