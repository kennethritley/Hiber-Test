/**
 * This is a POJO - Plain Old Java Object. If you look closely, you will see the following:
 * - simple constructor with no parameters
 * - all variables are private variables
 * - getter and setting methods for the variables
 * - no references to outside library
 * - no additional business logic
 */

public class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
