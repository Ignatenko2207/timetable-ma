package com.mainacad.dao;

import com.mainacad.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface LessonDAO extends JpaRepository<Lesson, Integer> {
//    List<Lesson> findByStudentAndStartTimeBetweenFromAndTo(Student student, LocalDateTime from, LocalDateTime to);

    List<Lesson> findByGroupAndStartTimeAfterAndStartTimeBefore(Group group, LocalDateTime from, LocalDateTime to);

    List<Lesson> findBySpecializationAndAndStartTimeAfterAndStartTimeBefore(Specialization specialization, LocalDateTime from, LocalDateTime to);

    List<Lesson> findByTeacherAndAndStartTimeAfterAndStartTimeBefore(Teacher teacher, LocalDateTime from, LocalDateTime to);

    List<Lesson> findByAndStartTimeAfterAndStartTimeBefore(LocalDateTime from, LocalDateTime to);
}
