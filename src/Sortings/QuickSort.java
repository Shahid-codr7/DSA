package Sortings;
public class QuickSort
{
    public static void main(String[] args) 
    {
        int a[]={3,5,2,13,12,3,2,13,45};
        int n=a.length;
        printArray(a,n);
        quickSort(a,0,n-1);
        printArray(a,n);
    }
    public static void quickSort(int a[],int low,int high)
    {
        int partitionInd;
        if(low<high)
        {
            partitionInd=Partition(a,low,high);
            printArray(a, a.length);
            quickSort(a, low, partitionInd-1); //sort left subtree
            quickSort(a, partitionInd+1, high);

        }
    }
    public static int Partition(int a[],int low,int high) 
    {
        int i,j,temp;
        int pivot;
        pivot=a[low];
        i=low+1; 
        j=high;
        do
        {
            while(i<a.length && a[i]<=pivot)
            i++;

            while (i<a.length && a[j]>pivot) 
            j--;

            if(i<j)
            {
                // swapping a[i] and a[j]
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }while(i<j);

        // swapping pivot(a[low]) and a[j]
        temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }

    public static void printArray(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
    }
}
    

