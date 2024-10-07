public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    //The setup for saving the person's name
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    public String toString() {
        return lastName + " " + firstName + ", " + home.toString();
    }
}

