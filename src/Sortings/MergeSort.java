package Sortings;
import java.util.*;
public class MergeSort 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int A[];
        System.out.println("ENTER SIZE OF ARRAY: ");
        int n = in.nextInt();
        A=new int[n];
        System.out.println("ENTER ELEMENTS: ");
        for(int i=0;i<n;i++)
        {
            A[i]=in.nextInt();
        }
        printArray(A, n);
        mergeSort(A,0,n-1);
        printArray(A, n);
        in.close();
    }
    public static void Merge(int arr[],int mid,int low,int high) 
    {
        int i,j,k;
        int B[]=new int[high+1];
        i=low;
        j=mid+1;
        k=low;
        while (i<=mid && j<=high) 
        {
            if(arr[i]<arr[j]) // '=' for stability
            {
                B[k++]=arr[i++];
            }
            else
            {
                B[k++]=arr[j++];
            }
        }
        while (i<=mid) 
        {
            B[k++]=arr[i++];
        }
        while (j<=high)
        {
            B[k++]=arr[j++];
        }

        for(i=low;i<=high;i++)
        {
            arr[i]=B[i];
        }

    }
    public static void mergeSort(int A[], int low, int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergeSort(A, low, mid);
            mergeSort(A, mid+1, high);
            Merge(A, mid, low, high);
        }
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
