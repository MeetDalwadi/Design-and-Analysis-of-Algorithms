
//Write a program to implement heap sort. 
import java.util.Random;

class Practical_3_Heap_Sort {
    public void sort(int arr[]) {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < N && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < N && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    void printArray(int arr[]) {
        int N = arr.length;
        for (int i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Random r = new Random();
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        Practical_3_Heap_Sort H = new Practical_3_Heap_Sort();
        System.out.println("Original array is : ");
        H.printArray(arr);
        H.sort(arr);
        System.out.println("Sorted array is");
        H.printArray(arr);
    }
}
