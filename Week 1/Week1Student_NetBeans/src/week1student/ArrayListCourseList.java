package week1student;

import java.util.ArrayList;

/**
 * Dynamic ArrayList implementation of CourseListADT.
 */
public class ArrayListCourseList implements CourseListADT {
    private ArrayList<Course> courses = new ArrayList<>();

    @Override
    public boolean addCourse(Course course) {
        // TODO 6a: Add the course to the ArrayList and return true.
        courses.add(course);
        return true;
    }

    @Override
    public Course findByCode(String code) {
        // TODO 6b: Use an enhanced for loop to find the course by code.
        for (Course course : courses) {
            if (course.getCode().equalsIgnoreCase(code)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public boolean removeByCode(String code) {
        // TODO 6c: Find the course first, then remove it if it exists.
        Course course = findByCode(code);

        if (course != null) {
            courses.remove(course);
            return true;
        }

        return false;
    }

    @Override
    public int size() {
        return courses.size();
    }

    @Override
    public boolean isFull() {
        // ArrayList grows dynamically, so for this exercise it is never full.
        return false;
    }

    @Override
    public void displayAll() {
        System.out.println("Dynamic ArrayList Course List:");
        if (courses.isEmpty()) {
            System.out.println("  No courses to display.");
        }
        for (Course course : courses) {
            System.out.println("  " + course);
        }
    }
}
