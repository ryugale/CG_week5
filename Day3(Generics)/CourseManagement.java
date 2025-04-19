import java.util.*;

abstract class CourseType{
    String name;
    CourseType(String name){
        this.name = name;
    }
    abstract String getName();

}

class ExamCourse extends CourseType{
   
    ExamCourse(String name){
        super(name);
    }
    @Override
    String getName() {
        return name;
    }
}

class AssignmentCourse extends CourseType{
    AssignmentCourse(String name){
        super(name);
    }
    
    @Override
    String getName(){
        return name;
    }

}

class ResearchCourse extends CourseType{
    ResearchCourse(String name){
        super(name);
    }
    
    @Override
    String getName(){
        return name;
    }
}

class Course<T extends CourseType>{
    String courseName;
    double coursePrice;
    T courseType;

    Course(String courseName, double coursePrice, T courseType ){
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseType = courseType;
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        ExamCourse examCourse = new ExamCourse("Exam Course");
        AssignmentCourse assignmentCourse = new AssignmentCourse("Assignment Course");
        ResearchCourse researchCourse = new ResearchCourse("Research Course");

        Course<ExamCourse> java = new Course<>("Advance Java Programming", 100000, examCourse); 

        Course<AssignmentCourse> python = new Course<>("Python ", 11110, assignmentCourse);

        List<? extends CourseType> courses = new ArrayList<>();
        List<Course<? extends CourseType>> allCourses = new ArrayList<>();
        allCourses.add(python);
        allCourses.add(java);
    }
}