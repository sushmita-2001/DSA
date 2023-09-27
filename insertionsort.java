 //import java.util.*;
public class insertionsort {
    static void insertion_sort(int arr[], int n){
        for(int i = 0; i <= n - 1; i++){
            int j= i;
            while(j > 0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                j--;
            }
        }
        System.out.println("After sorting");
        for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i] + " ");

        }

        System.out.println();
            
        }
        
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
         int[]arr = {5, 6, 4, 3, 2};
        int n = arr.length;
        System.out.println("Before sort");
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        insertion_sort(arr, n);
    }
    
}
