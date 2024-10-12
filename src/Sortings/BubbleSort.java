package Sortings;

public class BubbleSort {
    // static int arr[]={1,5,2,6,8,90};
    static int arr[] = { 1, 2, 3, 4, 5, 11 };
    static int n = arr.length;

    public static void main(String[] args) {
        // bubblesort();
        bubblesort_Adaptive();
        printa();

    }

    public static void bubblesort_Adaptive() {
        int isSorted = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("working on position " + (i + 1));
            isSorted = 1;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    isSorted = 0;
                }
            }
            if (isSorted == 1)
                return;
        }
    }

    public static void bubblesort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void printa() {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
