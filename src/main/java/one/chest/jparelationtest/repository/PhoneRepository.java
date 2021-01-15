package one.chest.jparelationtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import one.chest.jparelationtest.domain.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
