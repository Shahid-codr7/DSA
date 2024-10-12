package Trees;
class Node 
{
    int key;
    Node left;
    Node right;
    int height;
}

public class AVL_Rotation 
{
    //utility function to get Height
    public static int getHeight(Node n) 
    {
        if (n == null)
            return 0;
        return n.height;
    }

    //utility function create node
    public static Node createNode(int key) 
    {
        Node p = new Node();
        p.key = key;
        p.left = null;
        p.right = null;
        p.height = 1;
        return p;
    }

    // utility function to get Balance Factor
    public static int getBalanceFactor(Node node)
    {
        if(node==null)
            return 0;
        return getHeight(node.left)-getHeight(node.right);

    }

    //utility function to rotate the subtree right with node y
    public static Node Right_Rotate(Node y) 
    {
        Node x=y.left;
        Node T2=x.right;
        x.right=y;
        y.left=T2;  

        y.height=(int)(Math.max(getHeight(y.left), getHeight(y.right)))+1;
        x.height=(int)(Math.max(getHeight(x.left), getHeight(x.right)))+1;

        return x;
    }
    
    //utility function to rotate the subtree left with node x
    public static Node Left_Rotate(Node x) 
    {
        Node y=x.right;
        Node T2=y.left;
        y.left=x;
        x.right=T2;  

        y.height=(int)(Math.max(getHeight(y.left), getHeight(y.right)))+1;
        x.height=(int)(Math.max(getHeight(x.left), getHeight(x.right)))+1;

        return y;
    }

    public static Node Insertion(Node node,int key) 
    {
        if(node==null)
        return createNode(key); 

        if(key < node.key)
        node.left=Insertion(node.left, key);
        else if(key > node.key)
        node.right=Insertion(node.right, key);
        else
        return node;
        
        node.height=1+(int)(Math.max(getHeight(node.left), getHeight(node.right)));

        int bf=getBalanceFactor(node);

        //There are 4 cases:
        //1. Left Left case
        if(bf>1 && key < node.left.key) 
        {
            return Right_Rotate(node);
        }

        //2. Right Right case
        if(bf<-1 && key > node.right.key)
        {
            return Left_Rotate(node);
        }

        //3. Left Right case
        if(bf>1 && key > node.left.key)
        {
            node.left=Left_Rotate(node.left);
            return Right_Rotate(node);
        }

        //4. Right Left Case
        if(bf<-1 && key > node.left.key)
        {
            node.right=Right_Rotate(node.right);
            return Left_Rotate(node);
        }

        return node;//return the node pointer

    }
    public static void PreOrder(Node node){ 
		if(node != null) {  
			System.out.print(node.key + " "); 
            PreOrder(node.left);
			PreOrder(node.right); 
		} 
	}
    public static void InOrder(Node node){ 
		if(node != null) 
        {
            InOrder(node.left);  
			System.out.print(node.key + " "); 
			InOrder(node.right); 
		} 
	} 

    public static void main(String[] args) 
    {
        Node root=null;
        root=Insertion(root, 10);
        root=Insertion(root, 20);
        root=Insertion(root, 30);
        root=Insertion(root, 50);
        PreOrder(root);
        System.out.println();
        InOrder(root);
    }
}
