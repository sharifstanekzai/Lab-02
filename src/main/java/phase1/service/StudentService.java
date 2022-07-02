package phase1.service;

import phase1.entity.Course;
import phase1.entity.Student;

import java.util.List;

public interface StudentService {

    Integer create(Student course);

    List<Student> getStudentsByMajor(String major);

    List<Course> getCoursesByStudentId(Integer id);

}