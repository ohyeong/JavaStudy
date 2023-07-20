package ch_06;

class Static {
    static int width = 200;
    static int height = 120;
}
public class StaticTest {
    public static void main(String[] args) {
        Static test1 = new Static();
        Static test2 = new Static();

        test1.width = 300;
        System.out.println(test1.width);   //300
        System.out.println(test2.width);   //300
    }
}
