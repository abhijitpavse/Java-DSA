import java.util.*;


    public class code13{
        static int Linear (int arr[],int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    return i;
                }
            } return -1;
        }
                public static void main(String[] args){
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int [n];
                    for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                    }
                    int key=sc.nextInt();
                    System.out.println(Linear(arr,key));

                }
            }
