package TreePractice;

public class SymmetricTree {
    class TreeNode{
        int val;
    TreeNode left;
     TreeNode right;

        TreeNode(int data){
            this.val=data;
            this.left=null;
            this.right=null;
        }
    }


        public boolean isSymmetric(TreeNode root) {

            return helper(root.left,root.right);

        }

        public boolean helper(TreeNode root1,TreeNode root2)
        {
            if(root1==null || root2==null)
            {
                return root1==root2;
            }
            if(root1.val!=root2.val)
                return false;

            return helper(root1.left,root2.right) && helper(root1.right,root2.left);
        }
    }
