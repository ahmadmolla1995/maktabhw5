package DisplayPersonsList;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress(){
        return address;
    }
}
