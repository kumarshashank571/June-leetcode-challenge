class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        
        if(n==0){return result;}
        Arrays.sort(nums);
        int[] nextidx = new int[n];
        int[] sizes = new int[n];
        Arrays.fill(nextidx,-1);
        Arrays.fill(sizes,1);
        int maxlen = 1;
        int maxidx = 0;
        for(int i =n-1;i>=0;i--){
            int j = i+1;
            int max = 0;
            int _maxidx = i;
            while(j<n){
                if(nums[j]%nums[i] == 0 && sizes[j]>max){
                    max = sizes[j];
                    _maxidx = j;
                }
                j++;
            }
            if(_maxidx != i){
                sizes[i] += sizes[_maxidx];
                nextidx[i] = _maxidx;
                if(max+1 > maxlen){
                    maxlen = max+1;
                    maxidx = i;
                }
            }
        }
        int curr = maxidx;
        while(curr>=0){
            result.add(nums[curr]);
            curr = nextidx[curr];
        }
        return result;
    }
}
