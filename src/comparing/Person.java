package comparing;

public class Person implements Comparable<Person> {
    private String name;
    private String secondName;

    private int age;

    public Person(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
//        return o.name.compareTo(this.getName());
        return name.compareTo(o.getName());
    }
}
