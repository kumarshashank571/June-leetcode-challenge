class Solution {
    public boolean isSubsequence(String s, String t) {
        //-- first approach that comes in mind is surely the brute approach with 2 loops each iterating thorugh          
        //-- both the string but that will have a complexity of o(t^2) in worst case and o(s*t) in average.
        
      //-- the second approach is two pointers approach which has better complexity than the brute force solution
      //-- and it is provided below.  
        
        int i =0;int j =0;
       while(i<s.length()){
           if(j==t.length()){
               return false;
           }
           if(s.charAt(i)==t.charAt(j)){
               i++;
           }
           j++;
       }
        return true;
    }
}
