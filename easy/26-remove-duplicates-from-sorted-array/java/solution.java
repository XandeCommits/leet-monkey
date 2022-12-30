import java.util.Arrays;

class Solution {

    public static void main(String [] args){

        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public static int removeDuplicates(int[] nums) {
        
        System.out.println("Input: " + Arrays.toString(nums));

        int left = 1;

        for(int right = left; right < nums.length; right++){
            int currentNumber = nums[right];
            int previousNumber = nums[right - 1];

            if(currentNumber != previousNumber){
                nums[left] = currentNumber;
                left++;
            }
        }

        System.out.println("Output: " + Arrays.toString(nums));
        System.out.println("K: " + left);

        return left;
    }
}