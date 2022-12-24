package seminar2.data;

import java.util.Iterator;
import java.util.List;

public class StudentGrupIterator implements Iterator<Student>{
    private List<StudentGroup> studentGroup;    

    public StudentGrupIterator(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
        
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Student next() {
        // TODO Auto-generated method stub
        return null;
    }

}