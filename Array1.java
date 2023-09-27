// import java.util.*;
 public class Array1{

  public static void main(String[] args) {

    
    int arr1[] = {1,5,2,8,4,5,9};
    int n = arr1.length;
    int largest = arr1[0];

    for ( int i = 0 ; i < n  ; i++){
      if(largest< arr1[i]){
        largest = arr1[i];
      }
    }
    System.out.println(largest);

  


  }
 }
    