class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){return 0;}
        int count = 1;
        if(root.left != null){
           count += countNodes(root.left);
        }
        if(root.left != null){
         count += countNodes(root.right);
        }
        return count;
    }
}
