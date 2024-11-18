public class ArraySum{

    static int SumOfArray(int[] arr, int idx){
        if(idx == arr.length){
            return 1;
            }
            int sum = arr[idx] * SumOfArray(arr, idx+1);
            return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(SumOfArray(arr,0));

    }
}