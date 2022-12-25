package Seminar3.repository;

import Seminar3.data.Student;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student entity) {
        studentRepository.save(null);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

}
