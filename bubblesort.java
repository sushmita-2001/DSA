// import java.util.*;

public class bubblesort {
    static void Bubble_sort(int arr[], int n){ 
        for(int i = n - 1; i >= 0;i--){
            for(int j = 0; j<= i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {913, 936, 34, 88, 20, 9};
        int n = arr.length;
        System.out.println("Before  sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Bubble_sort(arr, n);
        
        
    }
    
}
