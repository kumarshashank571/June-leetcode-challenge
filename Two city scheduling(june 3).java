class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int counta = 0;int countb = 0;
        int n = costs.length;
        int cost = 0;
        //-- sorting array on the basis of difference between the fare of place A and place B.

        Arrays.sort(costs,(a,b) -> Math.abs(b[0]-b[1]) - Math.abs(a[0]-a[1]));
        //-- now traversing at each element and checking which of the 2 places is cheaper
        //-- but if half of the people are already at the given place we have to choose the other one.
        for(int i =0;i<costs.length;i++){
            if(costs[i][0]<costs[i][1]){
                if(counta != n/2){
                    counta++;
                    cost += costs[i][0];
                }
                else{
                    countb++;
                    cost += costs[i][1];
                }
            }
            else{
                if(countb != n/2){
                    countb++;
                    cost += costs[i][1];
                }
                else{
                    counta++;
                    cost += costs[i][0];
                }
            }
        }
        return cost;
    }
}
