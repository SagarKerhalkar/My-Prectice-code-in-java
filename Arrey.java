

public class Arrey {
    public static void main(String[] args) {
        // 1. int [] i = new int[5];
        //int [] i;
        //i = new int[5];
//        int [] i = {98, 45,70 ,87,98 };
////        i [0] = 20;
////        i [1] = 200;
////        i [2] = 60;
////        i [3] = 420;
////        i [4] = 210;
//        System.out.println(i[4]);

        int[] i = {98, 45, 70, 87, 98, 78, 68};
        //float []i = {12.2f,13.5f};
        System.out.println(i[0]);
        System.out.println("leanth for arrey = " + i.length);
        for (int a = 0; a < i.length; a++) {
            System.out.print(" | " + i[a]);
        }
        System.out.println(" ");
        System.out.println("Print in recivers order ");
        for (int b = i.length - 1; b >= 0; b--) {
            System.out.print(" | " + i[b]);
        }
        System.out.println(" ");
        System.out.println("for esch loop");
        for (int a : i) {
            System.out.print("|" + a);
        }
    }

}
