import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String args[]){

        //Test Data
        int[]numsWithDuplicate = new int[]{1,1,1,3,3,4,3,2,4,2};
        Boolean resultExpectedTrue = containsDuplicate(numsWithDuplicate);
        System.out.println(resultExpectedTrue);

        int[]numsWithoutDuplicate = new int[]{1,3,4,2};
        Boolean resultExpectedFalse = containsDuplicate(numsWithoutDuplicate);
        System.out.println(resultExpectedFalse);

    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> processedNums = new HashSet<>();
        
        for(int item : nums){
            
            if (processedNums.contains(item)){
                return true;
            }
            processedNums.add(item);
        }
        return false;
    }
}
