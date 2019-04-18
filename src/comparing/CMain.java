package comparing;

import java.util.Set;
import java.util.TreeSet;

public class CMain {

    private static PersonAgeComparing PersonAgeComparing;

    public static void main(String[] args) {
        Person p1 = new Person("b1", "s1", 1);
        Person p2 = new Person("b2", "s2",1);

//        Set<Person> set = new TreeSet<>();//default comparing
//        Set<Person> set = new TreeSet<>(new PersonAgeComparing());//sorting by 1 parameter
        Set<Person> set = new TreeSet<>(new PersonAgeComparing().thenComparing(new PersonSecondNameComparing()));//sorting by 2 parameter

        set.add(p1);
        set.add(p2);
        set.forEach(System.out::println);
    }
}
