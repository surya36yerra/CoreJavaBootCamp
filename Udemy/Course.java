package Udemy;

public class Course implements Cloneable{
    private String courseName;
    private String courseCode;

    public Course() {
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
