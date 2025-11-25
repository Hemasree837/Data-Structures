public class c_InsertionSort {
    public static void insertion(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min=arr[i];
            int j=i-1;
            while(j>=0 && min<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
            System.out.println();
            for(Object k:arr)
            {
                System.out.print(k+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,7,4,2,9,8,1,3};
        System.out.println("Before Sort");
        for(int j:arr) System.out.print(j+" ");
        insertion(arr);
        System.out.println();
        System.out.println("After Sort");
        for(int i:arr) System.out.print(i+" ");
    }
}

/**
Before Sort
6 7 4 2 9 8 1 3 
6 7 4 2 9 8 1 3 
6 7 4 2 9 8 1 3 
4 6 7 2 9 8 1 3 
2 4 6 7 9 8 1 3 
2 4 6 7 9 8 1 3 
2 4 6 7 8 9 1 3 
1 2 4 6 7 8 9 3 
1 2 3 4 6 7 8 9 
After Sort
1 2 3 4 6 7 8 9
*/
