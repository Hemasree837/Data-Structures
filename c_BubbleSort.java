public class c_BubbleSort {
    public static void bubblesort2(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
            System.out.println();
            for(Object k:arr)
            {
                System.out.print(k+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,7,4,5,9,1,2,8};
        System.out.println("Before Sort");
        for(int j:arr){
            System.out.print(j+" ");
        }
        bubblesort2(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
/**
 * Before Sort
3 7 4 5 9 1 2 8 
7 4 5 9 3 2 8 1 
7 5 9 4 3 8 2 1 
7 9 5 4 8 3 2 1 
9 7 5 8 4 3 2 1
9 7 8 5 4 3 2 1 
7 9 5 4 8 3 2 1
9 7 5 8 4 3 2 1
9 7 8 5 4 3 2 1
9 7 8 5 4 3 2 1
9 8 7 5 4 3 2 1
9 8 7 5 4 3 2 1
9 8 7 5 4 3 2 1
After Sort
9 8 7 5 4 3 2 1

For Ascending order
arr[j]>arr[j+1]
 */
