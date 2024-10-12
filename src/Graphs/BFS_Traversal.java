package Graphs;

public class BFS_Traversal
{
    public static final int MAX = 400;
    public static int rear = -1;
    public static int front = -1;
    static int[] Q = new int[MAX];

    public static void insert(int n) 
    {
        if (isFull())
            System.out.println("Queue Overflow, Insert not possible");
        else 
        {
            if (front == -1) 
            {
                front = 0;
            }
            Q[++rear] = n;
        }
    }

    public static int delete() 
    {
        if (isEmpty())
            return -1;
        else 
        {
            int n=Q[front];
            if (front == rear) 
            {
                front = -1;
                rear = -1;
            } 
            else 
            {
                front++;
            }
            return(n);
        }
    }

    public static void display()
    {
        if (front == -1)
            System.out.println("Empty Queue");
        else {
            System.out.println("Queue elements are: ");
            for (int i = front; i <= rear; i++) 
            {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isFull() 
    {
        return rear == MAX - 1;
    }

    public static boolean isEmpty() 
    {
        return front == -1;
    }

    public static void main(String[] args) 
    {
        int i=1;
        int visited[]={0,0,0,0,0,0,0};
        int a[][]={{0,1,1,1,0,0,0},{1,0,1,0,0,0,0},{1,1,0,1,1,0,0},{1,0,1,0,1,0,0},{0,0,1,1,0,1,1},{0,0,0,0,1,0,0},{0,0,0,0,1,0,0}};
        System.out.println(i);
        visited[i]=1;
        insert(i);
        while (!isEmpty()) 
        {
            int node=delete();
            for(int j=0;j < 7;j++)
            {
                if(a[node][j]==1 && visited[j]==0)
                {
                    insert(j);
                    System.out.println(j);
                    visited[j]=1;                
                }
            }
            
        }


        

    }
}