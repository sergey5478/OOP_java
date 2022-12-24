package seminar2.data;

public class Student extends User implements Comparable<Student>{
    private int grupNamber;

    public Student(String fio, Integer age, Integer passport, Integer grupNamber) {
        super(fio, age, passport);
        this.grupNamber = grupNamber;
        
    }

    public Integer getGrupNamber() {
        return grupNamber;
    }

    public void setGrupNamber(Integer grupNamber) {
        this.grupNamber = grupNamber;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grupNamber,o.grupNamber);
    }    
    
}
