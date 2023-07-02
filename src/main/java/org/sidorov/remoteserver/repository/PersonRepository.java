package org.sidorov.remoteserver.repository;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.sidorov.remoteserver.entity.Person;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class PersonRepository {

    private final static Integer MIN_COUNT_LETTER = 4;
    private final static Integer MAX_COUNT_LETTER = 12;
    private final static Integer MIN_OLD = 3;
    private final static Integer MAX_OLD = 99;

    public List<Person> generateRandomPersonList(Long count) {
        count = count < 1 ? 1 : count;
        count = count > 100 ? 100 : count;
        List<Person> personList = new ArrayList<>();
        for(int i = 1; i <= count; i++) {
            personList.add(generateRandomPerson());
        }
        return personList;
    }

    public Person generateRandomPerson() {
        long personOld = new Random().ints(MIN_OLD, MAX_OLD).findFirst().getAsInt();
        String personName = createName();
        String personSurname = createName();

        Person person = new Person();
        person.setAge(personOld);
        person.setName(personName);
        person.setSurname(personSurname);

        return person;
    }

    private String createName() {
        int nameLetterCount = new Random().ints(MIN_COUNT_LETTER, MAX_COUNT_LETTER).findFirst().getAsInt();
        String name = RandomStringUtils.random(nameLetterCount, true, false);
        return normalizeName(name);
    }

    private String normalizeName(String name) {
        return StringUtils.capitalize(name.toLowerCase(Locale.ROOT));
    }
}
