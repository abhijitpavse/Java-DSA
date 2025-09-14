import java.util.*;

public class binary3 {
    
    // Modified swap method to accept the array as a parameter
    static void swap(int arr[], int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    // Bubble sort method
    static void Bubble(int arr[], int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {   
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);  // Pass the array to the swap method
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Bubble(arr, n);  // Sorting the array using Bubble Sort
        
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
