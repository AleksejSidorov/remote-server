package org.sidorov.remoteserver.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sidorov.remoteserver.entity.Person;
import org.sidorov.remoteserver.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Tag(name = "Сервис для работы с Person")
@RestController("person")
@RequiredArgsConstructor
public class GeneratePersonController {

    private final PersonService personService;

    @GetMapping("/generate-person-list")
    public List<Person> generatePersonList(@PathParam("count") Long count) {
        return personService.generateRandomPersonList(count);
    }

    @GetMapping("/generate-person")
    public Person generatePerson() {
        return personService.generateRandomPerson();
    }

}
