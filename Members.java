
/*
 * ============================================================
 * DAY 2 — Member.java  (Brand new class)
 * ============================================================
 *
 * A Member is anyone who has a library card — student or teacher.
 * For now they're the same class. On Day 3 (Inheritance) we'll
 * split them into Student and Teacher subclasses.
 *
 * NEW CONCEPT TODAY: ArrayList
 * A Member holds a LIST of borrowed books.
 * We can't use a plain array (int[]) because arrays have fixed size.
 * ArrayList grows automatically as books are added/removed.
 *
 * import java.util.ArrayList;  ← we need this to use ArrayList
 */
import java.util.ArrayList;
public class Members {
    
    private int memberId;
    private String name;
    private String email;
    private String memberType;   // "Student" or "Teacher"
    private int maxBooksAllowed;  //3 for students, 5 for teachers

    // ArrayList<String> means: a list that holds String values
    // Each String will be a book title the member has borrowed
    // We'll upgrade this to List<Book> on Day 6

    private ArrayList<String> borrowedBooks;  //list of books currently borrowed

    // =========================================================
    // CONSTRUCTOR — Parameterized
    // =========================================================
    // We set maxBorrowLimit automatically based on memberType
    // so the caller doesn't have to worry about the rules

    public Members(int memberId, String name, String email, String memberType) {
        setMemberId(memberId);
        setName(name);
        setEmail(email);
        setMemberType(memberType);
        this.borrowedBooks = new ArrayList<>();
    }       

    //adding getters
    public int getMemberId() {
        return this.memberId;
    }       

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public int getMaxBooksAllowed() {
        return this.maxBooksAllowed;
    }

    //how many books borrowed
    public int getBorrowedBooksCount() {
        return this.borrowedBooks.size();
    }

    //calculate this member can borrow more books or not
    public boolean canBorrowMoreBooks() {
        return borrowedBooks.size() < maxBooksAllowed;
    }

    // =========================================================
    // SETTERS — with validation
    // =========================================================

    public void setMemberId(int memberId) {
        if (memberId <= 0) {
            System.out.println("Warning: Member ID must be positive. Ignoring: " + memberId);
            return;
        }
        this.memberId = memberId;
    }
 
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Warning: Member name cannot be empty. Ignoring.");
            return;
        }
        // Only letters and spaces allowed in a name
        // matches() checks if the string fits a pattern
        // "[a-zA-Z ]+" means: one or more letters or spaces
        if (!name.trim().matches("[a-zA-Z ]+")) {
            System.out.println("Warning: Name should contain only letters. Ignoring: " + name);
            return;
        }
        this.name = name.trim();
    }
 
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Warning: Email cannot be empty. Ignoring.");
            return;
        }
        // Basic email check: must contain "@" and a "."
        // contains() checks if a string includes a substring
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Warning: Invalid email format. Must contain '@' and '.'. Ignoring: " + email);
            return;
        }
        this.email = email.trim().toLowerCase();
    }
 
    public void setMemberType(String memberType) {
        if (memberType == null) {
            this.memberType  = "STUDENT";
            this.maxBooksAllowed = 3;
            return;
        }
        // toUpperCase() so "student", "Student", "STUDENT" all work
        String type = memberType.toUpperCase();
        if (type.equals("TEACHER")) {
            this.memberType     = "TEACHER";
            this.maxBooksAllowed = 5;   // teachers get higher limit
        } else {
            this.memberType     = "STUDENT";
            this.maxBooksAllowed = 3;
        }
    }
}


    