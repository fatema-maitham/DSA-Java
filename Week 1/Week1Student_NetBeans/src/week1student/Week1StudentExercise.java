package week1student;

/**
 * Week 1 Java Practice Exercise
 * Topics covered:
 * - Classes and objects
 * - Encapsulation
 * - Abstraction using abstract classes and interfaces
 * - Inheritance
 * - Polymorphism
 * - Abstract Data Types (ADTs)
 * - Arrays
 * - Dynamic arrays using ArrayList
 *
 * Scenario:
 * You are building a small Course Management System for a DSA course.
 * Complete the TODO sections in this project.
 */
public class Week1StudentExercise {

    public static void main(String[] args) {
        System.out.println("===== WEEK 1 JAVA OOP + ADT + ARRAYLIST PRACTICE =====\n");

        // ================================================================
        // TODO 1: Create objects from Student and Instructor.
        // Example format: new Student("S001", "Sara Ahmed", "Programming")
        // ================================================================
        Student student1 = new Student("S001", "Mohamed Ali", "Programming");
        Instructor instructor1 = new Instructor("I001", "Jasim Mohamed", "Data Structures");

        // ================================================================
        // TODO 2: Demonstrate polymorphism using a Person array.
        // Place student1 and instructor1 inside the people array.
        // ================================================================
        Person[] people = new Person[2];
        people[0] = student1; // replace with student1
        people[1] = instructor1; // replace with instructor1

        System.out.println("1) People in the system (polymorphism example):");
        for (Person person : people) {
            if (person != null) {
                person.displayInfo();
            } else {
                System.out.println("TODO: Add a Person object here.");
            }
        }

        System.out.println("\n2) Courses:");
        Course c1 = new Course("DSA101", "Data Structures and Algorithms", 3);
        Course c2 = new Course("OOP101", "Object-Oriented Programming", 3);
        Course c3 = new Course("DB101", "Database Systems", 4);

        // ================================================================
        // TODO 7: Use an ADT reference with a fixed-size array implementation.
        // Create an ArrayCourseList with capacity 2.
        // ================================================================
        CourseListADT fixedList = new ArrayCourseList(2); // replace null with new ArrayCourseList(2)

        if (fixedList != null) {
            System.out.println("Adding to fixed array list:");
            System.out.println("Add DSA101: " + fixedList.addCourse(c1));
            // TODO 8a: Add OOP101 and print the result.
            // TODO 8b: Add DB101 and print the result. What should happen and why?
            
            System.out.println("Add OOP101: " + fixedList.addCourse(c2));
            System.out.println("Add DB101: " + fixedList.addCourse(c3));
            
            fixedList.displayAll();
            System.out.println("Is fixed list full? " + fixedList.isFull());
        } else {
            System.out.println("TODO: Create fixedList first.");
        }

        // ================================================================
        // TODO 9: Use the same ADT reference with a dynamic ArrayList implementation.
        // Create an ArrayListCourseList.
        // ================================================================
        CourseListADT dynamicList = new ArrayListCourseList(); // replace null with new ArrayListCourseList()

        if (dynamicList != null) {
            System.out.println("\nAdding to dynamic ArrayList:");
            // TODO 10a: Add DSA101.
            // TODO 10b: Add OOP101.
            // TODO 10c: Add DB101.
            

            System.out.println("Add DSA101: " + dynamicList.addCourse(c1));
            System.out.println("Add OOP101: " + dynamicList.addCourse(c2));
            System.out.println("Add DB101: " + dynamicList.addCourse(c3));

            dynamicList.displayAll();
        } else {
            System.out.println("TODO: Create dynamicList first.");
        }

        // ================================================================
        // TODO 11: Search for course code "OOP101" in dynamicList.
        // Print the result if found.
        // ================================================================
        if (dynamicList != null) {
            Course found = dynamicList.findByCode("OOP101"); // replace null with dynamicList.findByCode("OOP101")
            System.out.println("\n3) Search result for OOP101:");
            System.out.println(found != null ? found : "Course not found / TODO not completed.");
        }

        // ================================================================
        // TODO 12: Remove course code "DB101" from dynamicList and display the list again.
        // ================================================================
        if (dynamicList != null) {
            boolean removed = dynamicList.removeByCode("DB101"); // replace false with dynamicList.removeByCode("DB101")
            System.out.println("\nWas DB101 removed? " + removed);
            System.out.println("4) Dynamic list after removal:");
            dynamicList.displayAll();
        }
    }
}
