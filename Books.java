public class Books {
    //for day 1 we will directlly create default constructor built an object rather than using modifiers and encapsulation prop
    int Id;
    String name;
    String author;
    String genre;
    int totalCopies;
    int availableCopies;

    // now it's time to create constructor of the class template
    Books(){
      this.Id=0;
      this.name="unknown";
      this.author="unknown";
      this.genre="unknown";
      this.totalCopies=0;
      this.availableCopies=0;  
    }

    //now we will create parameterized constructor to initialize the values of the object
    Books(int id, String name, String author, String genre, int totalCopies, int availableCopies){
        this.Id=id;
        this.name=name;
        this.author=author;
        this.genre=genre;
        this.totalCopies=totalCopies;
        this.availableCopies=availableCopies;
    }

    //copy constructor
    Books(Books other){
        this.Id=other.Id;
        this.name=other.name;
        this.author=other.author;
        this.genre=other.genre;
        this.totalCopies=other.totalCopies;
        this.availableCopies=other.availableCopies;
    }
}
