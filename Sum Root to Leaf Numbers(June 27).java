class Solution {
    public int result=0;
    public int sumNumbers(TreeNode root) {
        if(root == null){return 0;}
        findsum(root,0);
        return result;
    }
    public void findsum(TreeNode root,int val){
        int curr = val*10+root.val;
        if(root.left == null && root.right == null){
            result += curr;
            return;
        }
        if(root.left != null){findsum(root.left,curr);}
        if(root.right != null){findsum(root.right,curr);}
    }
}
