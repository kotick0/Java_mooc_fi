import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.people.add(person);
        }
    }

    public void print() {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                System.out.println(iterator);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
