class Solution {
    public int hIndex(int[] citations) {
        //-- linear search approach complexity O(n)
       /* int n = citations.length;
        int i = n-1;
        while(i>=0){
            if(citations[i]<n-i){break;}
            i--;
        }
        return n-i-1;*/
      
        //-- applying binary search approach for logarithmic time complexity
        
        int n = citations.length;
        int r = n-1;
        int l = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(citations[mid] < n-mid){l = mid+1;}
            else{r = mid-1;}
        }
       return n-l;
    }
}
