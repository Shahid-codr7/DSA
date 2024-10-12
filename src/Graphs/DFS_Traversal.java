package Graphs;

public class DFS_Traversal
{
    static int visited[]={0,0,0,0,0,0,0};
    static int a[][]={{0,1,1,1,0,0,0},{1,0,1,0,0,0,0},{1,1,0,1,1,0,0},{1,0,1,0,1,0,0},{0,0,1,1,0,1,1},{0,0,0,0,1,0,0},{0,0,0,0,1,0,0}};
    public static final int MAX = 400;
    public static int rear = -1;
    public static int front = -1;
    static int[] Q = new int[MAX];

    public static void DFS(int i) 
    {
        System.out.println(i);
        visited[i]=1;
        for(int j=0;j<7;j++)
        {
            if(a[i][j]==1 && visited[j]==0)
            {
                DFS(j);
            }
        }  
    }

    public static void main(String[] args) 
    {
        DFS(5);
    }
}