package Trees;

// public class Main_Tree 
// {
//     public static void main(String[] args) 
//     {
//         Linked_BinaryTree ob = new Linked_BinaryTree();
        
//         Node p = ob.createNode(30);
//         Node q = ob.createNode(130);
//         Node p1 =ob.createNode(15);
//         Node p2 = ob.createNode(45);
//         /* BINARY TREE DIAGRAM
//                      100
//                     /   \
//                    30    130
//                   /  \
//                 15   45
//                     /
//                    39  
//         */
//         // Linking root node with children nodes
//         Root.left = p;
//         Root.right = q;
//         p.left = p1;
//         p.right = p2;

//         // Traversals:
//         System.out.println("PRE ORDER TRAVERSAL");
//         PreOrder(Root);
//         System.out.println();
//         System.out.println("POST ORDER TRAVERSAL");
//         PostOrder(Root);
//         System.out.println();
//         System.out.println("IN ORDER TRAVERSAL");
//         InOrder(Root);
//         System.out.println();

//         //Searching in Binary Tree
//         //1. Using Recursion
//         System.out.println("Searched for 100 ");
//         if(Search_Rec(Root, 100)!=null)
//         {
//             System.out.println("FOUND");
//         }
//         else
//         {
//             System.out.println("NOT FOUND");
//         }

//         // 2. Using Iteration
//         System.out.println("Searched for 130 ");
//         if(Search_Iter(Root, 130)!=null)
//         {
//             System.out.println("FOUND");
//         }
//         else
//         {
//             System.out.println("NOT FOUND");
//         }

//         // Insertion in a Binary Tree [1. Iterative]
//         Insertion(Root, 39);
//         Insertion(Root, 198);
//         InOrder(Root);
//         // Insertion in a Binary Tree [2. Recursive]
        

//         // Deletion in a Binary Tree
//         Deletion(Root,130);
//         InOrder(Root);
//     }
// }