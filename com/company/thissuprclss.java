package com.company;
class ekclass{
    int a;

    public int getA() {
        return a;
    }

    ekclass(int v){

        this.a = v;
    }
        public int returnone(){
        return 1;
        }
}
class doclass extends ekclass{
    doclass (int c){
        super(c);
        System.out.println(" me ak constructor hu");
    }
}

public class thissuprclss {
    public static void main(String[] args) {
       // ekclass v = new ekclass(5);
        //System.out.println(v.getA());
        doclass d = new doclass(12);
        System.out.println(d.getA());

    }
}
