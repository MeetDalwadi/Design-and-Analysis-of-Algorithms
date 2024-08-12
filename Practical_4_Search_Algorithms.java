/*Write a program to search given element from an array using sequential search and binary 
search. Analyze the time complexity for best, average and worst case.*/
public class Practical_4_Search_Algorithms {
    public int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int BastCase = 0;
        int AvgrageCase = 50000;
        int WorstCase = 1000000;
        Practical_4_Search_Algorithms s = new Practical_4_Search_Algorithms();
        int Arr[] = new int[1000000];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = i;
        }
        // Best Case for Sequential Search :
        long startTime = System.nanoTime();
        int best = s.sequentialSearch(Arr, BastCase);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        if (best == -1) {
            System.out.println("Targeted Element Not Found.");
        } else {
            System.out.println("Index of Given Target : " + best);
        }
        System.out.println("Time Taken By Sequential Serch For Best Case : " + executionTime);

        // Average Case for Sequential Search :
        startTime = System.nanoTime();
        int Average = s.sequentialSearch(Arr, AvgrageCase);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        if (Average == -1) {
            System.out.println("Targat Element Not Found.");
        } else {
            System.out.println("Index of Given Target : " + Average);
        }
        System.out.println("Time Taken By Sequential Serch For Average case : " + executionTime);

        // Worst Case for Sequential Search :
        startTime = System.nanoTime();
        int Worst = s.sequentialSearch(Arr, WorstCase);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        if (Worst == 1) {
            System.out.println("Targat Element Not Found.");
        } else {
            System.out.println("Index of Given Target : " + Worst);
        }
        System.out.println("Time Taken By Sequential Serch for Worst case : " + executionTime);

        // Best Case for Binary Search :
        startTime = System.nanoTime();
        best = s.binarySearch(Arr, BastCase);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        if (best == 1) {
            System.out.println("Targat Element Not Found.");
        } else {
            System.out.println("Index of Given Target : " + best);
        }
        System.out.println("Time Taken By Binary Serch For Best Case : " + executionTime);

        // Average Case for Binary Search :
        startTime = System.nanoTime();
        Average = s.binarySearch(Arr, AvgrageCase);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        if (Average == 1) {
            System.out.println("Targat Element Not Found.");
        } else {
            System.out.println("Index of Given Target : " + Average);
        }
        System.out.println("Time Taken By Binary Serch For Average case : " + executionTime);

        // worst Case for Binary Search :
        startTime = System.nanoTime();
        Worst = s.binarySearch(Arr, WorstCase);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        if (Worst == 1) {
            System.out.println("Targat Element Not Found.");
        } else {
            System.out.println("Index of Given Target : " + Worst);
        }
        System.out.println("Time Taken By Binary Serch For Worst case : " + executionTime);
    }
}