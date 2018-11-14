public class Person {
private String name;

    //no argument constructor for person

    Person() {this("Unknown");}

    //single-argument constructor for person

    Person(String name){setName(name);}

    //Accessor methoad for name

    String getName(){return name;}

    //mutator method for the name

    public void setName(String name){this.name = name;}

    public String toString() {return "name: "+ getName();}

}
