package Searching;

public class linearSearch {
    public static int search(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,10,40};
        int x=10;
        int result=search(arr,x);
        if(result==-1) System.out.println("not present");
        else System.out.println("element is present at index "+ result);
    }
}
