import java.util.*;

public class demo {

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int Linear(int[] arr, int x) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Choose an element from an array");
        int x = sc.nextInt();

        System.out.println(x + " is found at index " + Linear(arr, x));
    }
}
