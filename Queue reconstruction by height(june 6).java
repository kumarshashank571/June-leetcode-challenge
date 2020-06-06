class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //-- first of all sorting the array in descending order of height
        //-- if height is equal sorting in ascending order of people in front of them
        //-- sample output array after sorting will look like
        //-- [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
       // --   7,0    7,1    6,1    5,0    5,2    4,4    (after sorting)
        for(int i=0;i<people.length;i++){
            for(int j=0;j<people.length-i-1;j++){
                if(people[j][0]<people[j+1][0]){
                    int[] temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
                else if(people[j][0]==people[j+1][0]){
                    if(people[j][1] >people[j+1][1]){
                        int[] temp = people[j];
                        people[j]= people[j+1];
                        people[j+1] = temp;
                    }
                }
            }
        }
        //-- you can acheive this sorting using internal function Arrays.sort() 
        //-- or any other efficient method for sorting.
        
        
        //-- now positioning the elements at their kth position and shifting remaining elements to the right
        //-- this can be acheived by using arraylist
        
        ArrayList<int[]> list = new ArrayList<>(); 
        for(int i =0;i<people.length;i++){
            int k = people[i][1];
            list.add(k,people[i]);
        }
        return list.toArray(new int[people.length][2]);
    }
}
