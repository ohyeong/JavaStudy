package ch_07;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for (String lang : strArray) {   //(변수 : 배열)
            System.out.println(lang);
        }
    }
}
