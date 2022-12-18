package Seminar2.data;

public class Student extends User {
    private Integer grupNamber;

    public Student(String fio, Integer age, Integer passport, Integer grupNamber) {
        super(fio, age, passport);
        this.grupNamber = grupNamber;
        
    }
    
    
}
