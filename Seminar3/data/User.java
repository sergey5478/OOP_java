package Seminar3.data;

public abstract class User {
    private String fio;
    private int age;
    private int passport;
    private String firstName;

    public User(String fio) {
        this.fio = fio;
    }

    public User(int age, int passport) {
        this.age = age;
        this.passport = passport;
    }

    public User(String fio, String firstName) {
        this.fio = fio;
        this.firstName = firstName;
    }

    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
