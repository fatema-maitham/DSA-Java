package week2student;

/**
 * A simple record class used in searching examples.
 */
public class StudentRecord {
    private int id;
    private String name;
    private double mark;

    public StudentRecord(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMark() { return mark; }

    @Override
    public String toString() {
        return id + " - " + name + " (" + mark + ")";
    }
}
