package week1student;

/**
 * Encapsulated class example.
 * A Course object has private data and public methods to control access.
 */
public class Course {
    private String code;
    private String title;
    private int creditHours;

    public Course(String code, String title, int creditHours) {
        this.code = code;
        this.title = title;
        setCreditHours(creditHours);
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        // TODO 3: Apply simple validation.
        // If creditHours is greater than 0, store it.
        // Otherwise, set creditHours to 1.
        if(creditHours>0) 
        {
            this.creditHours = creditHours;
        } else {
            this.creditHours = 1;
        }
    }

    @Override
    public String toString() {
        return code + " - " + title + " (" + creditHours + " credit hours)";
    }
}
