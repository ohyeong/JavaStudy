package ch_05;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5;
        personKim.height = 180;

        Person personLee = new Person("이순신", 175, 75);
    }
}
