public class multiples{
static int Multiple(int a, int b){
    if(a == 0){
        return 1;
    }
    return a + Multiple (a,b - 1);
}

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = Multiple(a , b);
        System.out.println(result);

    }
}