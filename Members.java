
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
public class Members extends Person {
    
    private String memberType;   // "Student" or "Teacher"
    private int maxBooksLimit;  //3 for students, 5 for teachers

    // ArrayList<String> means: a list that holds String values
    // Each String will be a book title the member has borrowed
    // We'll upgrade this to List<Book> on Day 6

    private ArrayList<String> borrowedBooks;  //list of books currently borrowed

    // =========================================================
    // CONSTRUCTOR — Parameterized
    // =========================================================
    // We set maxBorrowLimit automatically based on memberType
    // so the caller doesn't have to worry about the rules

    public Members(int id, String name, String email, String memberType) {
        super(id,name,email);
        setMemberType(memberType);
        this.borrowedBooks = new ArrayList<>();
    }       

    //adding getters


    public String getMemberType() {
        return this.memberType;
    }

    public int getMaxBooksLimit() {
        return this.maxBooksLimit;
    }

    //how many books borrowed
    public ArrayList<String> getBorrowedBooks() {
        return this.borrowedBooks;
    }
    public int getBorrowedCount()       
            { return this.borrowedBooks.size();}

    //calculate this member can borrow more books or not
    public boolean canBorrowMoreBooks() {
        return borrowedBooks.size() < maxBooksLimit;
    }

    // =========================================================
    // SETTERS — with validation
    // =========================================================

    
 
    
 
    
 
    public void setMemberType(String memberType) {
        if (memberType != null && memberType.toUpperCase().equals("TEACHER")) {
            this.memberType  = "TEACHER";
            this.maxBooksLimit = 5;
            return;
        }else{
            this.memberType     = "STUDENT";
            this.maxBooksLimit = 3;
        }
    }
     public boolean borrowBook(String bookTitle) {
        if (!canBorrowMoreBooks()) {
            System.out.println(getname() + " has reached the borrow limit of " + this.maxBooksLimit + ".");
            return false;
        }
        if (this.borrowedBooks.contains(bookTitle)) {
            System.out.println(getname() + " already has '" + bookTitle + "'.");
            return false;
        }
        this.borrowedBooks.add(bookTitle);
        System.out.println(getname() + " borrowed '" + bookTitle + "'.");
        return true;
    }
      public boolean returnBook(String bookTitle) {
        if (this.borrowedBooks.remove(bookTitle)) {
            System.out.println(getname() + " returned '" + bookTitle + "'.");
            return true;
        }
        System.out.println(getname() + " does not have '" + bookTitle + "'.");
        return false;
    }
 
    @Override
    public void displayInfo() {
        System.out.println("=============================");
        System.out.println("Member ID    : " + getId());
        System.out.println("Name         : " + getname());
        System.out.println("Email        : " + getemail());
        System.out.println("Type         : " + this.memberType);
        System.out.println("Borrow Limit : " + this.maxBooksLimit);
        System.out.println("Borrowed     : " + getBorrowedCount() + " / " + this.maxBooksLimit);
        if (this.borrowedBooks.isEmpty()) {
            System.out.println("Books        : (none)");
        } else {
            System.out.println("Books        :");
            for (String book : this.borrowedBooks) {
                System.out.println("               - " + book);
            }
        }
        System.out.println("=============================");
    }
}


    