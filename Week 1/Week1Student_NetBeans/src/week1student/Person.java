package week1student;

/**
 * Abstract class example.
 * Person is abstract because the system should create specific types such as
 * Student and Instructor, not a general Person object.
 */
public abstract class Person implements Displayable {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Each child class must explain its own role.
     */
    public abstract String getRole();

    @Override
    public void displayInfo() {
        System.out.println(getRole() + ": " + id + " - " + name);
    }
}
