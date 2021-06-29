public class Method {
   static   int sur(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 6 ; int b = 9;
        int c;
       // Method obj = new Method();
       // c = obj.sur(a,b);
        c = sur(a,b);
        System.out.println(c);

        int a1 = 34; int b1 = 12;
        int c1;
        c1 = sur(a1,b1);
        System.out.println(c1);
    }
}
