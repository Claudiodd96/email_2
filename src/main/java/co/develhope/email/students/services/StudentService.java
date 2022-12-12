package co.develhope.email.students.services;

import co.develhope.email.students.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Claudio", "Di Donato", "provaese01@gmail.com"),
            new Student("2", "Luca", "Di Cristofano", "provaese02@gmail.com"),
            new Student("3", "Mario", "Di Cristofano", "provaese03@gmail.com"),
            new Student("4", "Giovanni", "Salvatore", "provaese04@gmail.com")
            );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromList = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        return studentFromList.isPresent() ? studentFromList.get() : null;
    }
}
