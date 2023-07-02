package org.sidorov.remoteserver.service;

import lombok.RequiredArgsConstructor;
import org.sidorov.remoteserver.entity.Person;
import org.sidorov.remoteserver.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> generateRandomPersonList(Long count) {
        return personRepository.generateRandomPersonList(count);
    }

    public Person generateRandomPerson() {
        return personRepository.generateRandomPerson();
    }
}
