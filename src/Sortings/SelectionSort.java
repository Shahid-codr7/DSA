package Sortings;
public class SelectionSort 
{
    static int arr[]={12,54,65,7,23,9};
    static int n=arr.length;
    public static void main(String[] args) 
    {
        //selectionsort();
        selectionsort();
        display();

    }
    public static void selectionsort()
    {
        int minInd;
        // loop for traversing from 0 -> (n-1)
        for(int i=0;i<n-1;i++)
        {
            minInd=i;
            //loop for finding minimum element
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minInd])
                {
                    minInd=j;
                }
            }
            // swapping b/w minElement and i th position
            int temp=arr[minInd];
            arr[minInd]=arr[i];
            arr[i]=temp;

        }
    }
    public static void display() 
    {
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    
}
