package Seminar3.repository2;

import Seminar3.data.Teacher;

public class TeacherService {
    private final TeacherRepository teacherRepository;
    
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void saveStudent(Teacher entity) {
        teacherRepository.save(null);
    }

    public Teacher findStudentById(int id) {
        return teacherRepository.findById(id);
    }

    public Teacher findStudentByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }

    public TeacherRepository getTeacherRepository() {
        return teacherRepository;
    }
    
}
