package coreJava;

class Test {
    static int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 50;
        t1.y = 40;
        t2.x = 30;
        t2.y = 100;

        System.out.println(t1.x + " " + t1.y);
        System.out.println(t2.x + " " + t2.y);
    }
}