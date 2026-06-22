public abstract class Person {
    private int id;
    private String name;
    private String email;

    // parameterized constructor
    public Person(int id, String name, String email){
        setid(id);
        setname(name);
        setemail(email);
// why we use validation in setter because we want to ensure that the data being set is valid and consistent with our business rules. By adding validation in the setter methods, we can prevent invalid data from being assigned to the fields of our class. This helps
    }
    public int getId() {
        return this.id;
    }

    public String getname(){
        return this.name;
    }

    public String getemail(){
        return this.email;
    }

    //validation for setters now

    public void setid(int id){
        if(id<=0){
            System.out.println("Warning: ID must be positive. Ignoring: " + id);
            return;
        }
        this.id=id;
    }
    public void setname(String name){
        if(name==null || name.trim().isEmpty()){
            System.out.println("Warning: Name cannot be null or empty. Ignoring: " + name);
            return;
        }

        if(!name.trim().matches("[a-zA-Z]+")){
            System.out.println("Warning: Name should contain only letters. Ignoring: " + name);
            return;
        }
        this.name=name;
    }
    public void setemail(String email){
        if(email==null || email.trim().isEmpty()){
            System.out.println("Warning: Email cannot be null or empty. Ignoring: " + email);
            return;
        }
        if(!email.contains("@")||!email.contains(".")){
            System.out.println("Warning: Email should contain '@' and '.' characters. Ignoring: " + email);
            return;
        }
        this.email=email;
    }
    public abstract void displayInfo();
 
    public String toString() {
        return "[" + this.id + "] " + this.name + " (" + this.email + ")";
    }
}
