package org.sidorov.remoteserver.entity;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Person implements Serializable {
    Long age;
    String name;
    String surname;
}
