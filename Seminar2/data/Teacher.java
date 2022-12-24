package seminar2.data;

/**
 * Teacher
 */
public class Teacher extends User {
    private String kafedra;

    public Teacher(String fio, Integer age, Integer passport, String kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

}