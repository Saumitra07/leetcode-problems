package TreePractice;

import com.sun.source.tree.Tree;

public class MergeTwoBinaryTree {

    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public TreeNode root=null;

//    public TreeNode insert(TreeNode root, int data)
//    {
//        if(root==null)
//        {
//           TreeNode newnode=new TreeNode(data);
//            root=newnode;
//        }
//        else if(data<=root.data)
//        {
//            root.left=insert(root.left,data);
//        }
//        else
//        {
//            root.right=insert(root.right,data);
//        }
//        return root;
//
//    }
//    public static void main(String []args)
//    {
//
//        MergeTwoBinaryTree ts=new MergeTwoBinaryTree();
//        ts.root=ts.insert(ts.root,6);
//        // System.out.println(ts.root);
//        ts.root=ts.insert(ts.root,15);
//        // System.out.println(ts.root);
//        ts.root=ts.insert(ts.root,12);
//        ts.insert(ts.root,25);
//        ts.insert(ts.root,14);
//
//    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
        {
            return null;
        }
        else if(root1==null)
            return root2;
        else if (root2==null)
            return root1;
        else
        {
            TreeNode node=new TreeNode(root1.data+root2.data);
            node.left=mergeTrees(root1.left,root2.left);
            node.right=mergeTrees(root1.right,root2.right);
            return node;

        }
    }
}
