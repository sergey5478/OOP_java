package Seminar3.data;

public class Student extends User implements Comparable<Student>{
    private int namberGroup;

    public Student(String fio, int age, int passport, int namberGroup) {
        super(fio, age, passport);
        this.namberGroup = namberGroup;
    }

    public int getNamberGroup() {
        return namberGroup;
    }

    public void setNamberGroup(int namberGroup) {
        this.namberGroup = namberGroup;
    }

    @Override
    public int compareTo(Student o) {        
        return Integer.compare(this.getAge(), o.getAge());
    }
    
}
