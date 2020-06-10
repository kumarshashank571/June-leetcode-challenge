class Solution {
    //-- this is a rather easy question and can be done using simple iteration.
    public int searchInsert(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i] >= target){return i;} //-- if we encounter the number or a number greater than it just                                                  //-- return that index 
        }
        return nums.length; //-- if no number greater than it exists in the array just return size.
    }
}
