package ch_04;

public class ContinueExample {
    public static void main(String[ ] args) {
        int total = 0;
        int num;

        for(num = 1; num <= 100; num++) {
            if(num % 2 == 0)
                continue;
            total += num;   //num 값이 홀수인 경우에만 수행
        }
        System.out.println("1부터 100까지의 홀수의 합은" + total + "입니다.");
    }
}
