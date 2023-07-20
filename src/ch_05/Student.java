package ch_05;

public class Student {
    int studentID;
    private String studentName;
    int grade;
    String address;

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentAhn = new Student();     //Student 클래스 생성
        studentAhn.setStudentName("안승연");

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
