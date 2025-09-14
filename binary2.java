import java.util.*;
public class binary2 {
    static void swap(int a, int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void Bubble(int arr[],int n){
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]> arr[j+1]){
                    swap(arr[j], arr[j+1]);
                }
            }
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Bubble(arr,n);
    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
    
}
