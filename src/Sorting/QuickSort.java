package Sorting;
public class QuickSort
{
    public static void quicksort(int arr[] , int low , int high)
    {
        if(low < high)
        {
            int pidx = partition(arr, low , high);
            quicksort(arr , low,pidx-1);
            quicksort(arr,pidx+1,high);
        }
    }
    public static int partition(int arr[],int low , int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j= low ; j<high-1;j++)
        {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args)
    {
        int []arr= {1,3,2,6,43};
        quicksort(arr,0,arr.length-1);
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}