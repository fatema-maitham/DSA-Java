package week1student;

/**
 * Inheritance example: Instructor IS-A Person.
 */
public class Instructor extends Person {
    private String specialization;

    public Instructor(String id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        // TODO 4b: return the correct role name for an instructor.
        return "Instructor";
    }

    @Override
    public void displayInfo() {
        System.out.println(getRole() + ": " + getId() + " - " + getName()
                + " | Specialization: " + specialization);
    }
}
