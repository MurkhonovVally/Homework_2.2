
public class Person {
    String name;
    String surname;

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }


    public void changePerson(Person person){
        person = new Person("Ilya", "Lagutenko");
    }

    public void normalChangePerson(Person otherPerson){
        this.name = otherPerson.name;
        this.surname = otherPerson.surname;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }
}