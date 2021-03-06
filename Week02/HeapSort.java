import java.util.*;
public class HeapSort 
{ 
    public void sort(int arr[]) 
    { 
        int n = arr.length; 
        // Build heap (rearrange array) 处理前一半的数据，使前半段最大值在arr[0]
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
        printArray(arr);
        //  从队尾依次拿出数据与头交换,（是i>0所以头本身不参与）
        //，交换后以队尾数据为头heapify n * logn
        for (int i = n - 1; i > 0; i --) { 
            // Move current root to end 
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
            // 以i为size，0为subroot做heapify
            heapify(arr, i, 0); 
        } 
        printArray(arr);
    } 
  
    // To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // 不要除边界If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root, swap it with the root,
        // so the root is the actual largest
        if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
        int n = arr.length; 
        System.out.println("The array is ");
        printArray(arr);
        HeapSort ob = new HeapSort(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is"); 
        printArray(arr); 
    } 
} 