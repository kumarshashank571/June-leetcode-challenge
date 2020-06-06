class Solution {
    //-- declaring a global array so that it can be used in both functions.
    //-- this is our prefix sum array.
    int[] weights;
    public Solution(int[] w) {
    weights = new int[w.length];
       weights[0] = w[0];
    for(int i =1;i<weights.length;i++){
        
        weights[i]= w[i]+weights[i-1];
    }
        }
    
    public int pickIndex() {
        int sum = weights[weights.length-1];
        //-- random function is an inbuilt java function Random(n) 
        //-- which gives any random number between 1 to n.
        Random rand = new Random();
        int p = rand.nextInt(sum);
        int l=0,r=weights.length-1;
        int index=-1;
        //binary search to find the upper bound of p in prefix sum array
        while(l<=r)
        {
            int m=(l+r)/2;
            if(p<weights[m])
            {
                index=m;
                r=m-1;
               
            }
            else
            {
                l=m+1;
            }
           
        }
        return index;
    }
}
