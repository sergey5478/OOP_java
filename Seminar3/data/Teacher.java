package Seminar3.data;

public class Teacher extends User {
    private int kafedra;

    public Teacher(String fio, int age, int passport, int kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }

    public int getKafedra() {
        return kafedra;
    }

    public void setKafedra(int kafedra) {
        this.kafedra = kafedra;
    }   
    
}
