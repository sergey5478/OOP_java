package Seminar2.data;

public class Teacher extends User {

    private String kafedra;

    public Teacher(String fio, Integer age, Integer passport, String kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }
}
