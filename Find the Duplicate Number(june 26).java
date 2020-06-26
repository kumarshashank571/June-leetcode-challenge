class Solution {
   /* Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){return nums[i];}
        }
        return -1;
    }*/
    //== according to the constraints we can not modify the array
    //== but in the first approach we sorted the array
    //== another approach is using a hashset n=but space is not allowed(although the answer gets submitted)
    
    //== now we will see the final approach in which we will use the two pointers approach called slow and fast
    //== or hare and turtle approach.
    
    public int findDuplicate(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];
    do{
      slow = nums[slow];
      fast = nums[nums[fast]];
    }while(slow != fast);

    slow = nums[0];
    while(slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }

    return slow;
  }
}
