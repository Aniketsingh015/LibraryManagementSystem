public class Books {
    //for day 1 we will directlly create default constructor built an object rather than using modifiers and encapsulation prop
    private int Id;
    private String name;
    private String author;
    private String genre;
    private int totalCopies;
    private int availableCopies;

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
    public int getId(){
        return this.Id;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author; 
    }
    public String getGenre(){
        return this.genre;
    }
    public int getTotalCopies(){
        return this.totalCopies;
    }
    public int getAvailableCopies(){
        return this.availableCopies;  
  }

  public boolean isAvailable(){  
    return this.availableCopies > 0;
  }

  public void setId(int id){
    if(id<=0){
      System.out.println("Invalid ID. ID must be positive.");
      return;
    }
    this.Id=id;
  }
  public void setName(String name){
    // Rule: title cannot be null or empty/blank
    if(name==null || name.trim().isEmpty()){
      System.out.println("Invalid name. Name cannot be empty.");
      return;
    }
    this.name=name.trim(); 
    // trim removes leading and trailing whitespace from the string ex: "  The Great Gatsby  " becomes "The Great Gatsby"
  }
  public void setAuthor(String author){
    if(author==null || author.trim().isEmpty()){
      System.out.println("Invalid author. Author cannot be empty.");
      return;
    }
    this.author=author.trim();
  }
  public void setGenre(String genre){
    if(genre==null || genre.trim().isEmpty()){
      System.out.println("Invalid genre. Genre cannot be empty.");
      return;
    }
    this.genre=genre.trim();
  }   
  public void setTotalCopies(int totalCopies){
    if(totalCopies<0){
      System.out.println("Invalid total copies. Total copies cannot be negative.");
      return;
    }
    this.totalCopies=totalCopies;
  }
  public void setAvailableCopies(int availableCopies){
    if(availableCopies<0){
      this.availableCopies=0;
    }else if(availableCopies>this.totalCopies){
      this.availableCopies=this.totalCopies;
    }else{
      this.availableCopies=availableCopies;
    }
  }

  public boolean borrowBook(){
    if(this.availableCopies>0){
      this.availableCopies--;
      return true;
    }else{
      return false;
    }
  }

  public boolean returnBook(){
    if(this.availableCopies<this.totalCopies){
      this.availableCopies++;
      return true;
    }else{
      return false;
    }
  }
  public void displayBookInfo(){
    System.out.println("Book ID: " + this.Id);
    System.out.println("Book Name: " + this.name);
    System.out.println("Author: " + this.author);
    System.out.println("Genre: " + this.genre);
    System.out.println("Total Copies: " + this.totalCopies);
    System.out.println("Available Copies: " + this.availableCopies);
    System.out.println("Status           : " + (isAvailable() ? "Available" : "All Copies Borrowed"));
  }


}
