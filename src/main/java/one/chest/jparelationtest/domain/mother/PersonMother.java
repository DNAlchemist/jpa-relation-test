package one.chest.jparelationtest.domain.mother;

import one.chest.jparelationtest.domain.Person;

import java.util.List;

public class PersonMother {

    public static Person personNullId() {
        Person person = new Person();
        person.setPhones(List.of(PhoneMother.phoneNullId()));
        return person;
    }
}
