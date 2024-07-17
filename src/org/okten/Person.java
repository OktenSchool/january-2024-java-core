package org.okten;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
public class Person extends Object {

    private final String name;

    private final Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    // Integer.MIN_VALUE - Integer.MAX_VALUE
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
