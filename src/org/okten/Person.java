package org.okten;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
// Immutable
public class Person {

    private final String name;

    private final Integer age;

    private final String company;

    private final double salary;

    private final String phoneNumber;

    private final String homeAddress;
}
