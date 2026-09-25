package week1student;

/**
 * Fixed-size array implementation of CourseListADT.
 */
public class ArrayCourseList implements CourseListADT {
    private Course[] courses;
    private int count;

    public ArrayCourseList(int capacity) {
        courses = new Course[capacity];
        count = 0;
    }

    @Override
    public boolean addCourse(Course course) {
        // TODO 5a:
        // If the array is full, return false.
        // Otherwise, store the course at index count, increase count, and return true.
        if(isFull())
        {
            return false;
        }
        courses[count] = course;
        count++;
        return true;
        
    }

    @Override
    public Course findByCode(String code) {
        // TODO 5b:
        // Search only from index 0 to count - 1.
        // If courses[i].getCode().equalsIgnoreCase(code), return courses[i].
        // If not found, return null.
        for (int i = 0; i < count; i++)
        {
            if(courses[i].getCode().equalsIgnoreCase(code))
            {
                return courses[i];
            }
        }
        return null;
    }

    @Override
    public boolean removeByCode(String code) {
        // TODO 5c:
        // Find the course by code.
        // If found, shift all following elements one position to the left.
        // Set the last used slot to null, decrease count, and return true.
        // If not found, return false.
        for (int i = 0; i < count; i++) {
            if (courses[i].getCode().equalsIgnoreCase(code)) {

                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }

                courses[count - 1] = null;
                count--;

                return true;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isFull() {
        return count == courses.length;
    }

    @Override
    public void displayAll() {
        System.out.println("Fixed Array Course List:");
        if (count == 0) {
            System.out.println("  No courses to display.");
        }
        for (int i = 0; i < count; i++) {
            System.out.println("  " + courses[i]);
        }
    }
}
