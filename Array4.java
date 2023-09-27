public class Array4 {
    public static void Rotatearr(int arr[], int n){
        int temp = arr[0];
        n = arr.length;

        for(int i = 1 ; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i = 0 ; i < n ; i++){
        System.out.print(arr[i] + " ");
        }

    }
public static void main(String[] args) {
    int  n = 5;
    int arr[] = {1,2,3,4,5,6};
    
    Rotatearr(arr, n);

    
}
    
}

