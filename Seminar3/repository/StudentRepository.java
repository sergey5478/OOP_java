package Seminar3.repository;

import Seminar3.data.Student;
import Seminar3.db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {

    private final StudentTable studentTable;

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }
    
    @Override
    public Student delete(Student entity) {
        return null;
    }

    @Override
    public Student findByFio(Student fio) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student save(Student entity) {
        return null;
    }

    public StudentTable getStudentTable() {
        return studentTable;
    }

}
