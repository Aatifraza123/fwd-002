import java.util.*;

public class max {

    static int LinearSearch(int[] arr, int x) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
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
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x ");
        int x = sc.nextInt();

        System.out.println(LinearSearch(arr, x));

    }
}