package DS;

import java.util.*;
class Node1
{
    int data;
    Node1 next;
}
public class CircularLL 
{
    static Node1 start=null;
    public static void create() 
    {
        Node1 p;
        Node1 q=null;
        char ch;
        Scanner in=new Scanner (System.in);
        do
        {
            p=new Node1();
            System.out.println("Enter data: ");
            p.data=in.nextInt();
            p.next=null;
            if(start== null)
            {
                start=p;
                q=p;
                p.next=start;
            }
            else
            {
                q.next=p;
                p.next=start;
                q=p;
            }
            System.out.println("Want to c reate more nodes? ");
            ch=in.next().charAt(0);

        }while(ch=='Y'||ch=='y');
        in.close();
    }
    public static void InsertBeg()
    {    
        Scanner in=new Scanner (System.in);
        Node1 p=new Node1();
        System.out.println("Enter data: ");
        p.data=in.nextInt();
        Node1 q=start;
        while(q.next!=start)
        {
            q=q.next;
        }
        q.next=p;
        p.next=start;
        start=p;
        in.close();
    }
    public static void InsertEnd()
    {
        Scanner in=new Scanner (System.in);
        Node1 p=new Node1();
        System.out.println("Enter data: ");
        p.data=in.nextInt();
        Node1 q=start;
        while(q.next!=start)
        q=q.next;

        q.next=p;
        p.next=start;
        in.close();
    }
    public static void InsertAny()
    {
        Scanner in=new Scanner (System.in);
        Node1 p=new Node1();
        System.out.println("Enter data: ");
        p.data=in.nextInt();
        System.out.println("Enter position: ");
        int pos=in.nextInt();
        if(pos==0)
        System.out.println("Not possible; invalid choice");
        else if(start==null)
        {
            start=p;
            p.next=start;
        }
        else if(pos==1)
        {
            Node1 q=start;
            while(q.next!=start)
            q=q.next;
        q.next=p;
        p.next=start;
        start=p;
        }
        else
        {
            Node1 q=start;
            for(int i=1;i<pos-1 && q.next!=start;i++)
            {
                q=q.next;
            }
            if(q.next==start)
            {
                System.out.println("POSITION DOESN'T EXIST; INSERTED AT END");
                q.next=p;
                p.next=start;
            }
            else
            {
                p.next=q.next;
                q.next=p;
            }
        }

        in.close();
    }
    public static void DeleteBeg()
    {
        if(start==null)
        System.out.println("EMPTY LINKEDLIST");
        else
        {
            Node1 p=start;
            Node1 q=start;
            while(q.next!=start)
            q=q.next;

            q.next=start.next;
            start=start.next;

            System.out.println("DELETED NODE with data: "+p.data);
        }
    }
    public static void DeleteEnd()
    {
        if(start==null)
        {
            System.out.println("EMPTY LINKEDLIST");
        }
        else
        {
            Node1 p=start;
            Node1 q=start;
            while(p.next!=start)
            {
                q=p;
                p=p.next;
            }
            q.next=start;
            System.out.println("DELETED NODE with data: "+p.data);

        }
    }
    public static void DeleteAny()
    {
        if(start==null)
        {
            System.out.println("EMPTY LINKEDLIST");
        }
        else
        {
            Scanner in=new Scanner (System.in);
            System.out.println("Enter positon: ");
            int pos =in.nextInt();
            in.close();
            if(pos==1)
            {
                Node1 p=start;
                while(p.next!=start)
                {
                    p=p.next;
                }
                p.next=start.next;
                Node1 q=start;
                start=start.next;
                System.out.println("DELETED NODE with data: "+q.data);
            }
            else if(start.next==start)
            {
                System.out.println("DELETED NODE with data: "+start.data);
                start=null;
            }
            else
            {
                Node1 p=start;
                Node1 q=start;
                for(int i=1;i<pos && q.next!=start;i++)
                {
                    p=q;
                    q=q.next;
                }
                if(q.next==start)
                {
                    System.out.println("Position not found");
                }
                else
                {
                p.next=q.next;
                System.out.println("DELETED NODE with data: "+q.data);
                }
            }
        }
        
    }
    public static void display() 
    {
        if(start==null)
        {
            System.out.println("EMPTY LINKEDLIST");
        }
        else
        {
        Node1 p=start;
        System.out.println("ALL DATA OF CIRCULAR LINKED LIST");
        do
        {
            System.out.print(p.data+" ");
            p=p.next;
        }while(p!=start);
        System.out.println();
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter\n0:EXIT\n1:Create Nodes of CIRCULAR LINKEDLIST\n2:DISPLAY\n3:INSERT AT BEG\n4:INSERT AT END\n5:INSERT AT ANY POSITION\n6:Delete from beg\n7:Delete from End\n8:DELETE from any position");
        int ch=in.nextInt();
        switch (ch) 
        {
            case 0:System.out.println("PROGRAM ENDED");
            System.exit(0);
            break;
            case 1:create();
            break;
            case 2:display();
            break;
            case 3:InsertBeg();
            break;
            case 4:InsertEnd();
            break;
            case 5:InsertAny();
            break;
            case 6:DeleteBeg();
            break;
            case 7:DeleteEnd();
            break;
            case 8:DeleteAny();
            break;
            default:System.out.println("Invalid choice");

        }

        }
    }
    
}