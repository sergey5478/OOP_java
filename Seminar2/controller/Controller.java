package seminar2.controller;

import seminar2.data.Student;
import seminar2.data.StudentGroup;
import seminar2.service.DataService;
import seminar2.service.StudentGroupServiceImpl;
import seminar2.service.StudentServiceImpl;

public class Controller {

    private DataService studentService;
    private StudentGroupServiceImpl serviceImpl;
    
    public Controller(StudentGroupServiceImpl serviceImpl) {
            this.serviceImpl = serviceImpl;
    }
    public StudentGroup createStudentGroup(StudentGroup studentGroup){
        serviceImpl.writer(studentGroup);
        return(StudentGroup) serviceImpl.read(studentGroup);
    }        
    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }
    public Student createStudent(Student student){
        studentService.create(student);
        return(Student) studentService.read(student);
    }
    public StudentGroup createGroup(int groupNumber){
        return serviceImpl.getGroup(groupNumber);
    }
}
