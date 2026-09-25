package week1student;

/**
 * Inheritance example: Student IS-A Person.
 */
public class Student extends Person {
    private String major;

    public Student(String id, String name, String major) {
        super(id, name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getRole() {
        // TODO 4a: return the correct role name for a student.
        return "Student";
    }

    @Override
    public void displayInfo() {
        System.out.println(getRole() + ": " + getId() + " - " + getName()
                + " | Major: " + major);
    }
}
