package Sortings;
public class InsertionSort 
{
    static int arr[]={12,54,65,7,23,9};
    static int n=arr.length;
    public static void main(String[] args) 
    {
        //inertionsort();
        insertionsort();
        display();

    }
    public static void insertionsort()
    {
        int key,j,i;
        for(i=1;i<n;i++)   //loop for passes
        {
            key=arr[i];
            j=i-1;
            //loop for each pass
            while (j>=0 && arr[j] > key) 
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void display() 
    {
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
