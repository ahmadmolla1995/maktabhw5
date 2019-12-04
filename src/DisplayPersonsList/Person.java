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

    public void displayInfo() {
        System.out.printf("first_name:%s  ", firstName);
        System.out.printf("last_name:%s  ", lastName);
        System.out.printf("age:%d  ", age);
        System.out.printf("city:%s  ", address.getCity());
        System.out.printf("zone:%d  ", address.getZone());
        System.out.printf("street:%s  ", address.getStreet());
        System.out.printf("alley:%s  ", address.getAlley());
        System.out.printf("postalCode:%s\n", address.getPostalCode());
    }
}
