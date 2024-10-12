package Sortings;
import java.util.*;
public class CountSort 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int A[];
        System.out.println("ENTER SIZE OF ARRAY: ");
        int n = in.nextInt();
        A = new int[n];
        System.out.println("ENTER ELEMENTS: ");
        for (int i = 0; i < n; i++) 
        {
            A[i] = in.nextInt();
        }
        printArray(A,n);
        int B[]=Count_Sort(A);
        printArray(B,n);
        in.close();
    }

    public static int[] Count_Sort(int A[]) {
        int i, j, l = A.length;
        int max = A[0];
        for (i = 1; i < l; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        int count[] = new int[max + 1];
        for (i = 0; i < max + 1; i++)
            count[i] = 0;
        //incrementing index of count[] with corresponding  elements of A[]
        for (i = 0; i < l; i++) 
        {
            count[A[i]]++;
        }

        j = 0; // index for A[]
        for (i = 0; i < max + 1; i++) // index for count[]
        {
            while (count[i] > 0) 
            {
                A[j++] = i;
                count[i]--;
            }
        }
        return A;
    }

    public static void printArray(int A[],int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }

}
