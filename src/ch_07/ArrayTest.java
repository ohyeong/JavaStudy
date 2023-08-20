package ch_07;

public class ArrayTest {
    public static void main(String[] args) {
        int[ ] num = new int[ ] {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<num.length; i++){    //length -> 전체 길이 반환
            System.out.println(num[i]);
        }
    }
}
