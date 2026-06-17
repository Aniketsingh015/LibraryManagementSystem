
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

    //calculate this member can borrow more books or not
    public boolean canBorrowMoreBooks() {
        return borrowedBooks.size() < maxBooksAllowed;
    }

    