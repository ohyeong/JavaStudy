package ch_03;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);  //앞 항의 결과가 거짓이라 뒤에 항 실행X
        System.out.println(value);   //false
        System.out.println(num1);    //20
        System.out.println(i);       //2

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);  //앞 항의 결과가 참이라 뒤에 항 실행X
        System.out.println(value);  //true
        System.out.println(num1);   //30
        System.out.println(i);      //2
    }
}
