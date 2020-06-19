class Solution {
//-- using rabin karp's algorithm

    int a = 26;
    int mod = 1<<30;
    public String longestDupSubstring(String S) {
        int lo = 1;
        int hi = S.length()-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int startIndex = search(S,mid);
            if(startIndex==-1){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        int startIndex = search(S,hi);
        return startIndex==-1? "" : S.substring(startIndex,startIndex+hi);
    }
    
    public int search(String S, int len){
        long h = 0;
        long aL = 1;
        for(int i=0; i<len; i++){
            h = (h*a%mod + S.charAt(i))%mod;
            aL = aL*a%mod;
        }
        HashMap<Long,List<Integer>> visited = new HashMap();
        visited.put(h,new ArrayList<Integer>());
        visited.get(h).add(0);
        for(int i=1; i<S.length()-len+1; i++){
            h = ((h*a%mod-S.charAt(i-1)*aL%mod+mod)%mod+S.charAt(i+len-1))%mod;
            if(visited.containsKey(h)){
                for(int start : visited.get(h)){
                    if(S.substring(start,start+len).equals(S.substring(i,i+len))) return i;
                }            
            }
            else{
                visited.put(h,new ArrayList<Integer>());           
            }
            visited.get(h).add(i);     
        }
        return -1;
    }
}
