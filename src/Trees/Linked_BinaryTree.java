package Trees;
class Node 
{
    public int data;
    Node left;
    Node right;
}
public class Linked_BinaryTree 
{
    static Node Root = createNode(100);
    public static Node createNode(int data) 
    {
        Node p = new Node();
        p.data = data;
        p.left = null;
        p.right = null;
        return p;
    }
    public static void PreOrder(Node root) // Recursive calling function()
    {
        // PreOrder: (Root,Left,Right)
        if(root!=null)
        {
            System.out.print(root.data+" "); //Root
            PreOrder(root.left);           //Left
            PreOrder(root.right);          //Right
        }
    }
    public static void PostOrder(Node root)
    {
         // PostOrder: (Left,Right,Root)
        if(root!=null)
        {
            PostOrder(root.left);            //Left
            PostOrder(root.right);           //Right
            System.out.print(root.data+" "); //Root
        }
    }
    public static void InOrder(Node root)
    {
         // InOrder: (Left,Root,Right)
        if(root!=null)
        {
            InOrder(root.left);              //Left
            System.out.print(root.data+" "); //Root
            InOrder(root.right);             //Right
        }
    }
    public static Node Search_Rec(Node root, int key)
    {
        // 1. RECURSION
        if(root==null)
        {
            return null;
        }
        else if(root.data==key)
        {
            return root;
        }
        else if(key < root.data)
        {
            return Search_Rec(root.left, key);
        }
        else
        {
            return Search_Rec(root.right, key);
        }
    }

    public static Node Search_Iter(Node root, int key)
    {
        // 2. ITERATIVE
        while (root!=null) 
        {
            if(root.data==key)
            return root;
            if(key < root.data)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return null;
            
    }

    


    public static void Insertion(Node root,int key) 
    {
        Node prev=null;
        while(root!=null)
        {
            prev=root;
            if(root.data==key)
            return;
            if(key < root.data)
            {
                root=root.left;
            }
            else
            {
                root=root.right; 
            }
        }

        Node P = createNode(key); //  Node of Inserted Data
        
        if(key < prev.data)
        {
            prev.left=P;
        }
        else
        {
            prev.right=P;
        }

    }

    public static Node Deletion(Node root,int key) 
    {
        Node inPre;
        //If Root is not Present in the Tree
        if(root==null)
        return null;
        //If Root is Leaf Node [BASE CASE]
        if(root.left==null && root.right==null)
        root=null;
        //Search for Node to be Deleted
        if(key < root.data)
        Deletion(root.left, key);
        else if(key > root.data)
        Deletion(root.right, key);
        else
        {
            inPre=inOrderPredecessor(root);
            root.data=inPre.data;
            Deletion(root.left, inPre.data);        
        }
        return root;
    }
    public static Node inOrderPredecessor(Node root)
    {
        root=root.left;
        while(root!=null)
        {
            root=root.right;
        }
        return root;
    }

    public static void main(String[] args) 
    {
        
        Node p = createNode(30);
        Node q = createNode(130);
        Node p1 = createNode(15);
        Node p2 = createNode(45);
        /* BINARY TREE DIAGRAM
                     100
                    /   \
                   30    130
                  /  \
                15   45
                    /
                   39  
        */
        // Linking root node with children nodes
        Root.left = p;
        Root.right = q;
        p.left = p1;
        p.right = p2;

        // Traversals:
        System.out.println("PRE ORDER TRAVERSAL");
        PreOrder(Root);
        System.out.println();
        System.out.println("POST ORDER TRAVERSAL");
        PostOrder(Root);
        System.out.println();
        System.out.println("IN ORDER TRAVERSAL");
        InOrder(Root);
        System.out.println();

        //Searching in Binary Tree
        //1. Using Recursion
        System.out.println("Searched for 100 ");
        if(Search_Rec(Root, 100)!=null)
        {
            System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }

        // 2. Using Iteration
        System.out.println("Searched for 130 ");
        if(Search_Iter(Root, 130)!=null)
        {
            System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }

        // Insertion in a Binary Tree [1. Iterative]
        Insertion(Root, 39);
        Insertion(Root, 198);
        InOrder(Root);
        // Insertion in a Binary Tree [2. Recursive]
        

        // Deletion in a Binary Tree
        Deletion(Root,130);
        InOrder(Root);
    }

}
