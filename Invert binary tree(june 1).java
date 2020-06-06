class Solution {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        //-- we have to swap the subtree by traversing at each node
        //-- will do this using recursion 
        //-- recursion calls
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
       //-- swaping.
        root.left = right;
        root.right = left;
        
        return root;
    }
    
}
