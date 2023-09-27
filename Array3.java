
//  import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Array3{
    public static void containDup(int[] nums){
              Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                continue;
            }else{
                set.add(nums[i]);
            }
        }
        System.out.print(set);
    }
    public static void main(String[] args) {
        int [] nums= {1,1,1,2,12,11,12,11,13 };
        containDup(nums);
    }
}




    
