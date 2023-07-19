package ch_02;

public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;   //final를 통해 constant 선언
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //MAX_NUM = 1000;      //오류 발생 상수는 값 변경 불가능
    }
}
