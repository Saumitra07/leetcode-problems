package TreePractice;
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

        void find_min()
        {
            if(root==null)
            {
                System.out.println("Tree is empty");
            }
            else{

                Node x=root;
                while(x.left!=null)
                {

                    x=x.left;
                }

                System.out.println("Min element is"+x.data);
            }
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
            //System.out.println(ts.root);
          //  ts.inorder(ts.root);
            ts.postorder(ts.root);
         //   ts.find_min();
           // System.out.println(ts.find_recursive_min());
        System.out.println(ts.search(ts.root,14));
        }
    }


