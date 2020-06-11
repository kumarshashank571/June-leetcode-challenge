class Solution {
    public void sortColors(int[] arr) {
        //-- using 3 pointers approach we can do it in one pass and constant space 
        //-- and the method is shown here.
        int i =0;   //-- 1's starting point
        int j =0;   //-- 2's starting point
        int k =0;   //-- to iterate through the array.
        while(k<arr.length){
            if(arr[k]==0){
                //-- 2's shifting
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                
                //-- 1's shifting
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
            }
            else if(arr[k] == 1){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j++;
            }
            k++;
        }
    }
}
