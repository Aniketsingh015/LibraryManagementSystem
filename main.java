public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System!");

        //creating of objects from class Books

        Books book1= new Books(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 5, 5);
        Books book2= new Books(2, "To Kill a Mockingbird", "Harper Lee", "Fiction", 3, 3);
        Books book3= new Books(3, "1984", "George Orwell", "Dystopian", 4, 4);

        //displaying information about books
        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();

        //borrowing and returning books
        System.out.println("\n Borrowing books \n");

        boolean borrowResult1= book1.borrowBook();
        System.out.println("Borrowing " + book1.getName() + ": " + (borrowResult1 ? "Success" : "Failed"));
        book1.displayBookInfo();

        boolean borrowResult2= book2.borrowBook();
        System.out.println("Borrowing " + book2.getName() + ": " + (borrowResult2 ? "Success" : "Failed"));

        boolean borrowResult3= book3.borrowBook();
        System.out.println("Borrowing " + book3.getName() + ": " + (borrowResult3 ? "Success" : "Failed"));

        //lets implement return method for book1
        boolean returnBook1=book1.returnBook();
        System.out.println("\n Returning " + book1.getName() + ": " + (returnBook1 ? "Success" : "Failed"));
        book1.displayBookInfo();

        //using deafault constructor to create book5
        Books book5=new Books();
        System.out.println("before setter");
        book5.displayBookInfo();

        book5.setId(105);
        book5.setName("The Catcher in the Rye");
        book5.setAuthor("J.D. Salinger");
        book5.setGenre("Fiction");
        book5.setTotalCopies(6);
        book5.setAvailableCopies(6);

        System.out.println("\n After setter");

        book5.displayBookInfo();




    }

    

}
