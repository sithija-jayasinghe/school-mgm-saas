package com.myschool.repository;

import com.myschool.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Example Repository Methods to Replace Removed Bidirectional Collections
 *
 * INSTRUCTIONS:
 * 1. Copy these methods to your existing repository interfaces
 * 2. Modify as needed for your specific requirements
 * 3. Use pagination (Page) for large result sets
 * 4. Use List for smaller, filtered queries
 */

// ============================================
// StudentRepository - Additional Methods
// ============================================
@Repository
interface StudentRepositoryExample extends JpaRepository<StudentEntity, Integer> {

    // Replaces: school.getStudents()
    Page<StudentEntity> findBySchool(SchoolEntity school, Pageable pageable);
    List<StudentEntity> findBySchool(SchoolEntity school);

    // Replaces: currentClass.getStudents()
    List<StudentEntity> findByCurrentClass(ClassEntity currentClass);

    // Useful queries
    List<StudentEntity> findBySchoolAndStatus(SchoolEntity school, String status);
    long countBySchool(SchoolEntity school);
}

// ============================================
// MarkRepository - Additional Methods
// ============================================
@Repository
interface MarkRepositoryExample extends JpaRepository<MarkEntity, Integer> {

    // Replaces: student.getMarks()
    List<MarkEntity> findByStudent(StudentEntity student);
    List<MarkEntity> findByStudentOrderByExamDateDesc(StudentEntity student);

    // Replaces: exam.getMarks()
    List<MarkEntity> findByExam(ExamEntity exam);

    // Replaces: subject.getMarks()
    Page<MarkEntity> findBySubject(SubjectEntity subject, Pageable pageable);

    // Useful queries
    List<MarkEntity> findByStudentAndExam(StudentEntity student, ExamEntity exam);
    List<MarkEntity> findByExamAndSubject(ExamEntity exam, SubjectEntity subject);
}

// ============================================
// StudentFeeRepository - Additional Methods
// ============================================
@Repository
interface StudentFeeRepositoryExample extends JpaRepository<StudentFeeEntity, Integer> {

    // Replaces: student.getFees()
    List<StudentFeeEntity> findByStudent(StudentEntity student);
    List<StudentFeeEntity> findByStudentAndStatus(StudentEntity student, String status);

    // Replaces: feeStructure.getStudentFees()
    Page<StudentFeeEntity> findByFeeStructure(FeeStructureEntity feeStructure, Pageable pageable);

    // Useful queries
    List<StudentFeeEntity> findByStudentAndDueDateBefore(StudentEntity student, LocalDate date);
}

// ============================================
// StudentAttendanceRepository - Additional Methods
// ============================================
@Repository
interface StudentAttendanceRepositoryExample extends JpaRepository<StudentAttendanceEntity, Integer> {

    // Replaces: student.getAttendanceRecords()
    List<StudentAttendanceEntity> findByStudent(StudentEntity student);
    List<StudentAttendanceEntity> findByStudentAndDateBetween(
        StudentEntity student, LocalDate startDate, LocalDate endDate
    );

    // Replaces: currentClass.getAttendanceRecords()
    List<StudentAttendanceEntity> findByCurrentClassAndDate(ClassEntity currentClass, LocalDate date);

    // Useful queries
    long countByStudentAndStatus(StudentEntity student, String status);
}

// ============================================
// TeacherRepository - Additional Methods
// ============================================
@Repository
interface TeacherRepositoryExample extends JpaRepository<TeacherEntity, Integer> {

    // Replaces: school.getTeachers()
    Page<TeacherEntity> findBySchool(SchoolEntity school, Pageable pageable);
    List<TeacherEntity> findBySchool(SchoolEntity school);

    // Useful queries
    List<TeacherEntity> findBySpecialization(String specialization);
}

// ============================================
// ClassSubjectRepository - Additional Methods
// ============================================
@Repository
interface ClassSubjectRepositoryExample extends JpaRepository<ClassSubjectEntity, Integer> {

    // Replaces: subject.getClasses()
    List<ClassSubjectEntity> findBySubject(SubjectEntity subject);

    // Replaces: teacher.getSubjectsTeaching()
    List<ClassSubjectEntity> findByTeacher(TeacherEntity teacher);

    // Already have: currentClass.getSubjects() - kept in entity

    // Useful queries
    ClassSubjectEntity findByCurrentClassAndSubject(ClassEntity currentClass, SubjectEntity subject);
}

// ============================================
// ClassRepository - Additional Methods
// ============================================
@Repository
interface ClassRepositoryExample extends JpaRepository<ClassEntity, Integer> {

    // Replaces: school.getClasses()
    List<ClassEntity> findBySchool(SchoolEntity school);

    // Replaces: academicYear.getClasses()
    List<ClassEntity> findByAcademicYear(AcademicYearEntity academicYear);

    // Replaces: teacher.getClassesAsClassTeacher() - kept in entity

    // Useful queries
    List<ClassEntity> findBySchoolAndAcademicYear(SchoolEntity school, AcademicYearEntity academicYear);
    ClassEntity findBySchoolAndClassNameAndSection(SchoolEntity school, String className, String section);
}

// ============================================
// ExamRepository - Additional Methods
// ============================================
@Repository
interface ExamRepositoryExample extends JpaRepository<ExamEntity, Integer> {

    // Replaces: academicYear.getExams()
    List<ExamEntity> findByAcademicYear(AcademicYearEntity academicYear);
    List<ExamEntity> findByAcademicYearOrderByDateDesc(AcademicYearEntity academicYear);

    // Useful queries
    List<ExamEntity> findByAcademicYearAndExamType(AcademicYearEntity academicYear, String examType);
}

// ============================================
// ExamSubjectRepository - Additional Methods
// ============================================
@Repository
interface ExamSubjectRepositoryExample extends JpaRepository<ExamSubjectEntity, Integer> {

    // Already have: exam.getExamSubjects() - kept in entity

    // Replaces: subject.getExams()
    List<ExamSubjectEntity> findBySubject(SubjectEntity subject);

    // Replaces: teacher.getExamsInvigilating()
    List<ExamSubjectEntity> findByInvigilator(TeacherEntity teacher);

    // Useful queries
    ExamSubjectEntity findByExamAndSubject(ExamEntity exam, SubjectEntity subject);
    List<ExamSubjectEntity> findByExamAndDate(ExamEntity exam, LocalDate date);
}

// ============================================
// UserRepository - Additional Methods
// ============================================
@Repository
interface UserRepositoryExample extends JpaRepository<UserEntity, Integer> {

    // Replaces: school.getUsers()
    Page<UserEntity> findBySchool(SchoolEntity school, Pageable pageable);

    // Replaces: role.getUsers()
    List<UserEntity> findByRole(RoleEntity role);

    // Useful queries
    UserEntity findByUsername(String username);
    UserEntity findByEmail(String email);
    List<UserEntity> findBySchoolAndRole(SchoolEntity school, RoleEntity role);
}

// ============================================
// TimetableRepository - Additional Methods
// ============================================
@Repository
interface TimetableRepositoryExample extends JpaRepository<TimetableEntity, Integer> {

    // Replaces: currentClass.getTimetables()
    List<TimetableEntity> findByCurrentClass(ClassEntity currentClass);
    List<TimetableEntity> findByCurrentClassAndDayOfWeek(ClassEntity currentClass, String dayOfWeek);

    // Useful queries
    List<TimetableEntity> findByCurrentClassOrderByTimeSlot(ClassEntity currentClass);
}

// ============================================
// FeeStructureRepository - Additional Methods
// ============================================
@Repository
interface FeeStructureRepositoryExample extends JpaRepository<FeeStructureEntity, Integer> {

    // Replaces: currentClass.getFeeStructures()
    List<FeeStructureEntity> findByCurrentClass(ClassEntity currentClass);

    // Replaces: feeCategory.getFeeStructures()
    List<FeeStructureEntity> findByFeeCategory(FeeCategoryEntity feeCategory);

    // Useful queries
    FeeStructureEntity findByCurrentClassAndFeeCategory(ClassEntity currentClass, FeeCategoryEntity feeCategory);
}

// ============================================
// USAGE EXAMPLES
// ============================================

/**
 * Example Service Usage:
 *
 * @Service
 * public class StudentService {
 *
 *     @Autowired
 *     private StudentRepository studentRepository;
 *
 *     @Autowired
 *     private MarkRepository markRepository;
 *
 *     public StudentDto getStudentWithMarks(Integer studentId) {
 *         StudentEntity student = studentRepository.findById(studentId)
 *             .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
 *
 *         // Instead of: student.getMarks()
 *         List<MarkEntity> marks = markRepository.findByStudent(student);
 *
 *         // Map to DTO
 *         StudentDto dto = modelMapper.map(student, StudentDto.class);
 *         dto.setMarks(marks.stream()
 *             .map(mark -> modelMapper.map(mark, MarkDto.class))
 *             .collect(Collectors.toList()));
 *
 *         return dto;
 *     }
 *
 *     public Page<StudentDto> getSchoolStudents(Integer schoolId, int page, int size) {
 *         SchoolEntity school = schoolRepository.findById(schoolId)
 *             .orElseThrow(() -> new ResourceNotFoundException("School not found"));
 *
 *         // Instead of: school.getStudents()
 *         Page<StudentEntity> students = studentRepository.findBySchool(
 *             school, PageRequest.of(page, size)
 *         );
 *
 *         return students.map(student -> modelMapper.map(student, StudentDto.class));
 *     }
 * }
 */
