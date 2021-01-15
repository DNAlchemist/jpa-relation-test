package one.chest.jparelationtest.controller;

import lombok.RequiredArgsConstructor;
import one.chest.jparelationtest.domain.mother.PersonMother;
import one.chest.jparelationtest.repository.PersonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final PersonRepository personRepository;

    @GetMapping("/save")
    public ResponseEntity<String> save() {
        personRepository.save(PersonMother.personNullId());
        return ResponseEntity.ok("OK");
    }

}
