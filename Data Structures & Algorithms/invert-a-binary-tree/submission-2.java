
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null){
            return null;
        }
        TreeNode temp = root.left;
        if(root.left==null && root.right==null)return root;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
