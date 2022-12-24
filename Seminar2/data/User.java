package seminar2.data;

public abstract class User {

    private String fio;
    private Integer age;
    private Integer passport;

    public User(String fio, Integer age, Integer passport) {
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }
}
