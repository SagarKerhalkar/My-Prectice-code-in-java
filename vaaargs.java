public class vaaargs {
    static int sum (int x,int ... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("sum of 1,3,5,7 ana 9 is = "+sum(1,3,5,7,9));

    }

}
