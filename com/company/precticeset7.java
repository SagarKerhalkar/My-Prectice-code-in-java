package com.company;
class cylinder{
    private int redus;
    private int hight;

    public int getRedus() {
        return redus;
    }

    public void setRedus(int redus) {
        this.redus = redus;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public float surfasearea(){
        return (2f* (22f/7f)*redus*redus+ 2f*3.142f*redus*hight);
    }
    public double volum() {
        return ( Math.PI * redus * redus * hight);
    }

}

public class precticeset7 {
    public static void main(String[] args) {
        //problum 1

        cylinder mycl = new cylinder();
        mycl.setHight(12);
        mycl.setRedus(9);
        /*
        int h = mycl.getHight();
        System.out.println(h);
        */
        // problum 2
        System.out.println(mycl.surfasearea());
        System.out.println(mycl.volum());

    }
}
