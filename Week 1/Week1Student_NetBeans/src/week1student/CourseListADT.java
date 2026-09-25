package week1student;

/**
 * ADT interface.
 * This defines WHAT a course list can do, without saying HOW it is implemented.
 */
public interface CourseListADT {
    boolean addCourse(Course course);
    Course findByCode(String code);
    boolean removeByCode(String code);
    int size();
    boolean isFull();
    void displayAll();
}
