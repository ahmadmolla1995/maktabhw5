package DisplayPersonsList;

public class Address {
    private String city;
    private int zone;
    private String street;
    private String alley;
    private String postalCode;

    public Address(String city, int zone, String street, String alley, String postalCode) {
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.alley = alley;
        this.postalCode = postalCode;
    }

    public String getCity(){
        return city;
    }

    public int getZone(){
        return zone;
    }

    public String getStreet(){
        return street;
    }

    public String getAlley(){
        return alley;
    }

    public String getPostalCode(){
        return postalCode;
    }
}
