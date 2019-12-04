package DisplayPersonsList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("ahmad", "molla", 24, new Address("tehran", 2, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("reza", "omrani", 21, new Address("esfahan", 8, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("hamid", "naderi", 23, new Address("tehran", 9, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("ali", "rezaei", 27, new Address("tehran", 3, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("navid", "hamidi", 29, new Address("tehran", 4, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("sara", "goudarzi", 26, new Address("mashhad", 5, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("ramtin", "sadeghi", 25, new Address("tehran", 6, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("amin", "resoulzadeh", 28, new Address("tehran", 3, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("alireza", "javadizadeh", 30, new Address("tehran", 1, "sattarkhan", "ehsangar", "145")));
        persons.add(new Person("mina", "saberi", 22, new Address("tehran", 1, "sattarkhan", "ehsangar", "145")));
    }
}
