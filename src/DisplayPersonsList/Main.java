package DisplayPersonsList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("ahmad", "molla", 24, new Address("tehran", 2, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("reza", "omrani", 21, new Address("esfahan", 8, "niavaran", "golha", "1230")));
        persons.add(new Person("hamid", "naderi", 23, new Address("tehran", 9, "zaferanieh", "sadoughi", "11")));
        persons.add(new Person("ali", "rezaei", 27, new Address("tehran", 3, "saadatabad", "nasim", "095")));
        persons.add(new Person("navid", "hamidi", 29, new Address("tehran", 4, "tehransar", "aftab", "00101")));
        persons.add(new Person("sara", "goudarzi", 26, new Address("mashhad", 5, "tajrish", "sahel", "23008")));
        persons.add(new Person("ramtin", "sadeghi", 25, new Address("tehran", 6, "velenjak", "kiani", "4560")));
        persons.add(new Person("amin", "resoulzadeh", 28, new Address("tehran", 3, "farmanieh", "sedaghati", "470998")));
        persons.add(new Person("alireza", "javadizadeh", 30, new Address("tehran", 1, "kamranieh", "amirnezhad", "542360")));
        persons.add(new Person("mina", "saberi", 22, new Address("tehran", 1, "elahieh", "hosseinpur", "145")));
    }
}
