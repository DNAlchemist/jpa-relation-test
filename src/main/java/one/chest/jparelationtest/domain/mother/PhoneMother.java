package one.chest.jparelationtest.domain.mother;

import one.chest.jparelationtest.domain.Phone;

public class PhoneMother {

    public static Phone phoneNullId() {
        Phone phone = new Phone();
        phone.setPhone("+79991112233");
        return phone;
    }
}
