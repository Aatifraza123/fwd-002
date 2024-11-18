import java.util.*;

public class practise {

    static void SwapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversearra(int[] arr, int i, int j){
        
        while (i < j) {
            SwapArray(arr, i, j);
            i++;
            j--;
    }
}

static void Rotation(int[] arr,int k){
    k = k % arr.length;
    
    reversearra(arr, 0, k - 1);
    reversearra(arr, k, arr.length - 1);
    reversearra(arr, 0, arr.length - 1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println("Enter k");
       int k = sc.nextInt();
       Rotation(arr, k);
    }
   
}