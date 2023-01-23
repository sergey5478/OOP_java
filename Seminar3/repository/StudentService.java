package Seminar3.repository;

import Seminar3.data.Student;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public boolean deletStudentNumberAge(int groupNumber, int age) {
        return studentRepository.equals(studentRepository);
    }

    public void deletStudentFirstName(String fio) {
    }

    public void deletStudent(Student student) {
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void saveStudent(Student entity) {
        studentRepository.save(null);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudentByFio(Student fio) {
        return studentRepository.findByFio(fio);
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

}
