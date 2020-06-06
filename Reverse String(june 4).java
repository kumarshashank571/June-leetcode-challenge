class Solution {
    public void reverseString(char[] s) {
        // --- first approach o(1)-space o(n)-time
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;right--;
        }
        //--- second approach o(1)-space o(n)-time
       /* for(int i =0;i<s.length/2;i++){
           char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }*/
        //--- third approach is using recursion but it uses o(n)-space for recursion stack and o(n)-time.
    }
}
