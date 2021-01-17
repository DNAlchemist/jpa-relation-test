package one.chest.jparelationtest.domain.mother;

import one.chest.jparelationtest.domain.Person;

import java.util.Set;

public class PersonMother {

    public static Person personNullId() {
        Person person = new Person();
        person.setPhones(Set.of(PhoneMother.phoneNullId()));
        person.getPhones().forEach(p -> p.setPerson(person));
        return person;
    }
}
