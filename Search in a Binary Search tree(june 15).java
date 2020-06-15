class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){return null;}
        if(root.val==val){return root;}
        //-- using the bst property of left child is always smaller than the right child 
        //-- a concise solution is given below.
        if(root.val > val){
            return searchBST(root.left,val);
        }
         return searchBST(root.right,val);
         }
}
