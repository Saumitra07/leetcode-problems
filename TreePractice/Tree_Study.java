package TreePractice;

import java.util.LinkedList;
import java.util.Queue;

class Tree_study {

        class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public Node root=null;


        Node insert(Node root,int data){
            if(root==null)
            {
                Node newnode=new Node(data);
                root=newnode;
                //return root;
            }
            else if(data<=root.data)
            {
                root.left=insert(root.left,data);
            }
            else
            {
                root.right=insert(root.right,data);
            }
            return root;

        }


        void levelOrder(Node temp)
        {
            Queue<Node> q=new LinkedList<>();
            q.add(temp);
            while(!q.isEmpty())
            {
                Node p=q.remove();
                System.out.println(p.data);
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
            }



        }
        void inorder(Node temp)
        {
            if (temp == null)
                return;

            inorder(temp.left);
            System.out.print(temp.data + " ");
            inorder(temp.right);
        }
        void postorder(Node temp)
        {
            if(temp==null)
                return;
            postorder(temp.left);
            postorder(temp.right);
            System.out.print(temp.data + " ");

        }

        boolean search(Node temp,int data)
        {

            if(temp==null)
                return  false;
            if(temp.data==data)
                return true;
            else if(data< temp.data)
                return search(temp.left,data);
            else
                return search(temp.right,data);

        }

        int find_min(Node root)
        {
            if(root==null)
            {
                System.out.println("Tree is empty");
            }
            else{
//
//                Node x=root;
//                while(x.left!=null)
//                {
//
//                    x=x.left;
//                }
                while(root.left!=null)
                {

                    root=root.left;
                }

                System.out.println("Min element is"+root.data)
                ;
            }
            return  root.data;
        }
        int find_recursive_min()
        {
            if(root==null)
            {
                //  System.out.println("Tree is empty");
                return -1;
            }
            else if(root.left==null)
            {
                return root.data;

            }
            else {
                return find_recursive_min();
            }

        }
        public static void main(String []args)
        {

            Tree_study ts=new Tree_study();
            ts.root=ts.insert(ts.root,6);
            // System.out.println(ts.root);
            ts.root=ts.insert(ts.root,15);
            // System.out.println(ts.root);
            ts.root=ts.insert(ts.root,12);
            ts.insert(ts.root,25);
            ts.insert(ts.root,14);
            ts.insert(ts.root,1);
            //System.out.println(ts.root);
          //  ts.inorder(ts.root);
//            ts.postorder(ts.root);
          //  ts.search(ts.root,25);
         //   ts.find_min();
           // System.out.println(ts.find_recursive_min());
            System.out.println(ts.find_min(ts.root));
            System.out.println("root elemnt is"+ts.root.data);
        System.out.println(ts.search(ts.root,14));
        System.out.println("LEVEL ORDER TRAVERSAL");
        ts.levelOrder(ts.root);
        }
    }


