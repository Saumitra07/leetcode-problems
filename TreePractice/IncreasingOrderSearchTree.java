package TreePractice;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {

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
    List<Integer> list=new ArrayList<Integer>();
    int index=0;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);

//         System.out.println(list);

//         TreeNode p=new TreeNode(list.get(0),null,null);
//         TreeNode temp=p;
//         for(int i=1;i<list.size()-1;i++)
//         {
//             TreeNode newnode=new TreeNode(list.get(i),null,null);
//             p.right=newnode;
//             p=newnode;

//         }
//         if(list.size()>1)
//         {
//         TreeNode newnode=new TreeNode(list.get(list.size()-1),null,null);
//         p.right=newnode;
//         }

        return arrange(root,index);

    }


    public TreeNode arrange(TreeNode root,int index)
    {
        if(index==list.size())
            return null;
        if(root!=null)
        {
            root.val=list.get(index);
            root.left=null;
            index++;
            root.right=arrange(root.right,index);
            return root;
        }
        else
        {
            TreeNode newnode=new TreeNode(list.get(index));
            index++;
            newnode.right=arrange(newnode.right,index);
            return newnode;
        }


    }
    public void inorder(TreeNode root)
    {

        if(root==null)
            return;
        if(root.left!=null)
            inorder(root.left);
        list.add(root.val);
        if (root.right!=null)
            inorder(root.right);


    }


}
