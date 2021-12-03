public class Person {
    private String name;


    //constructor for instance variable
    public Person(String initialName)
    {
        this.name = initialName;
    }

    //empty constructor
    public Person()
    {
    }

    //setter for person name
    public void setName( String fullName) {
        this.name = fullName;
    }

    //getter for person name
    public String getName() {return name;}

    //unused toString method
    public String toString() {return null;}
}
