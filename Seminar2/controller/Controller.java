package Seminar2.controller;

import Seminar2.data.Student;
import Seminar2.data.StudentGroup;
import Seminar2.service.DataService;
import Seminar2.service.StudentGroupServiceImpl;
import Seminar2.service.StudentServiceImpl;

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
