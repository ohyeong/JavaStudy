package ch_06;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        //studentLee.setStudentName("이지원");
        //System.out.println(Student2.getSerialNum());
        //System.out.println(studentLee.studentName+"학번:"+studentLee.studentID);

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.getSerialNum());
        System.out.println(studentSon.studentName+"학번:"+studentSon.studentID);
        //static 메서드를 이용하지 않아도 static 변수 반환이 가능할까?에 관한 답
        //먼저 인스턴스를 생성 후 그 인스턴스의 메서드를 이용해 static 변수 반환이 가능함.
    }
}
