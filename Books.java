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

    //lets make method to get the values of the object
    int getId(){
        return this.Id;
    }
    String getName(){
        return this.name;
    }
    String getAuthor(){
        return this.author; 
    }
    String getGenre(){
        return this.genre;
    }
  int getTotalCopies(){
    return this.totalCopies;
  }
  int getAvailableCopies(){
    return this.availableCopies;  
  }

  boolean isAvailable(){  
    return this.availableCopies > 0;
  }

  void setId(int id){
    this.Id=id;
  }
  void setName(String name){
    this.name=name;
  }
  void setAuthor(String author){
    this.author=author;
  }
  void setGenre(String genre){
    this.genre=genre;
  }   
  void setTotalCopies(int totalCopies){
    this.totalCopies=totalCopies;
  }
  void setAvailableCopies(int availableCopies){
    if(availableCopies<0){
      this.availableCopies=0;
    }else if(availableCopies>this.totalCopies){
      this.availableCopies=this.totalCopies;
    }else{
      this.availableCopies=availableCopies;
    }
  }

  boolean borrowBook(){
    if(this.availableCopies>0){
      this.availableCopies--;
      return true;
    }else{
      return false;
    }
  }

  boolean returnBook(){
    if(this.availableCopies<this.totalCopies){
      this.availableCopies++;
      return true;
    }else{
      return false;
    }
  }
  void displayBookInfo(){
    System.out.println("Book ID: " + this.Id);
    System.out.println("Book Name: " + this.name);
    System.out.println("Author: " + this.author);
    System.out.println("Genre: " + this.genre);
    System.out.println("Total Copies: " + this.totalCopies);
    System.out.println("Available Copies: " + this.availableCopies);
  }


}
