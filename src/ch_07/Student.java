package ch_07;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String name;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        for(Subject subject : subjectList){
            total += subject.getScore();
            System.out.println("학생 " + this.name + "의 " + subject.getName()
                    + "과목 성적은 " + subject.getScore() + "입니다.");
        }
        System.out.println("학생 " + name + "의 총점은 " + total + " 입니다.");
    }
}
