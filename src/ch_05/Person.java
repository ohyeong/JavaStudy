package ch_05;

public class Person {
    String name;
    int height;
    double weight;
    char gender;
    boolean married;

    public Person(){}

    public Person(String pname){
        name = pname;
    }

    public Person(String pname, int pheight, double pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
