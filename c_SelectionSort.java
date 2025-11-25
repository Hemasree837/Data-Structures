public class c_SelectionSort {
    public static void selection(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            System.out.println();
            for(Object k:arr)
            {
                System.out.print(k+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,4,2,9,7,1,3};
        System.out.println("Before Sort");
        for(int i:arr) System.out.print(i+" ");
        selection(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int i:arr) System.out.print(i+" ");
    }
}
/**
Before Sort
6 8 4 2 9 7 1 3 
1 8 4 2 9 7 6 3 
1 2 4 8 9 7 6 3 
1 2 3 8 9 7 6 4 
1 2 3 4 9 7 6 8 
1 2 3 4 6 7 9 8 
1 2 3 4 6 7 9 8 
1 2 3 4 6 7 8 9
1 2 3 4 6 7 8 9 
After Sort
1 2 3 4 6 7 8 9
*/
