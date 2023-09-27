import java.util.ArrayList;

 class solution{
     private static void Merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp= new ArrayList<>();
        int left = low;
        int right = mid +1;

        while(left<= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        // transfering all elements from temporary to arr //

        for(int i= low; i<= high; i++){
            arr[i]=temp.get(i-low);
        }

    }
    public static void Mergesort(int[]arr , int low , int high) {
        if(low >= high) return;
        int mid = (low + high)/2;
        Mergesort(arr,low,mid);
        Mergesort(arr,mid+1,high);
        Merge(arr,low,mid,high);
        
    }
}
public class mergesort{
    public static void main(String args[]) {
        int n = 7;
        int arr[]= {3, 1, 6, 1, 5, 2, 4};

        System.out.println("Before sort");
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        
        }
        System.out.println();
        solution.Mergesort(arr,0 , n-1);
        System.out.println("After Sort");
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        
    }
}