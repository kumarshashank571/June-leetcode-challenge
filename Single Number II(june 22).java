class Solution {
public:
//=== using bits manipulation 
    int singleNumber(vector<int>& nums) {
     vector<int> bitfreq(32,0);
        int ans = 0;
        for(int i=0;i<32;i++){
            for(int ele:nums){
                int mask = (1<<i);
                if((ele & mask) != 0){bitfreq[i]++;}
            }
            ans |= ((bitfreq[i] % 3) << i);
            }
        return ans;
    }
};
