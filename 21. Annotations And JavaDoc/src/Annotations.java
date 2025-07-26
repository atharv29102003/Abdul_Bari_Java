

/**
 * This class represents operations related to a Book.
 */
public class Annotations {

    /**
     * Default value
     */
    public static final int VAL = 10;

    /**
     * Parameterized Constructor
     * 
     * @param name Book name
     */
    public Annotations(String name) {
        // constructor logic
    }

    /**
     * Issue a Book to a Student.
     * 
     * @param roll Roll number of the student
     * @throws Exception if the book is not available
     */
    public void issue(int roll) throws Exception {
        // issue logic
    }

    /**
     * Check if book is available.
     * 
     * @param name Book name
     * @return true if book is available, false otherwise
     */
    public boolean available(String name) {
        return true;
    }

    /**
     * Get book name by ID.
     * 
     * @param id Book ID
     * @return Book name
     */
    public String getName(int id) {
        return "Book Name";
    }
}
