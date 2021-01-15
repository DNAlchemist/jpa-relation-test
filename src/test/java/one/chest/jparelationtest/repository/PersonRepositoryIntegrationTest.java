package one.chest.jparelationtest.repository;

import one.chest.jparelationtest.domain.Person;
import one.chest.jparelationtest.domain.mother.PersonMother;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
        properties = {
                "spring.datasource.url=jdbc:tc:postgresql:11.9:///",
                "spring.datasource.driver-class-name=org.testcontainers.jdbc.ContainerDatabaseDriver"
        }
)
@Transactional
@AutoConfigureMockMvc
class PersonRepositoryIntegrationTest {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PhoneRepository phoneRepository;

    @Test
    void testForeignKey() {
        Person person = PersonMother.personNullId();
        Person dbPerson = personRepository.saveAndFlush(person);
        assertThat(dbPerson.getId()).isNotNull();
        assertThat(phoneRepository.findAll().get(0).getPerson().getId())
                .isNotNull();
    }

}