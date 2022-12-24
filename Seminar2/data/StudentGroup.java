package seminar2.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private String teacher;
    private List<String> studentNames;
    private Integer namberG;

    
    public StudentGroup(String teacher, List<String> studentNames) {
        this.teacher = teacher;
        this.studentNames = studentNames;
    }
    
    public StudentGroup(String teacher, List<String> studentNames, Integer namberG) {
        this(teacher, studentNames);
        this.namberG = namberG;        
    }
    

    public Integer getNamberG() {
        return namberG;
    }

    public void setNamberG(Integer namberG) {
        this.namberG = namberG;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

  
}
