package oppgave2.b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class Groups {

    private List<Person> people;

    public Groups() {
        people =
                Arrays.asList(
                        new Person("Andreas", 18, "M"),
                        new Person("Andrea", 19, "F"),
                        new Person("Jens", 20, "M"),
                        new Person("Fredrik", 21, "M"),
                        new Person("Frank", 27, "M"),
                        new Person("Peter", 18, "M"),
                        new Person("Paul", 18, "M"),
                        new Person("Martin", 19, "M"),
                        new Person("Hanne", 20, "F"),
                        new Person("Fredrik", 18, "M"),
                        new Person("Annette", 19, "F"),
                        new Person("Henriette", 20, "M"),
                        new Person("Jasmin", 21, "M")
                );
    }

    public Map<String, List<Person>> groupByName() {
        return people.stream().collect(Collectors.groupingBy(Person::getName));
    }

    public Map<Integer, List<Person>> groupByAge() {
        return people.stream().collect(Collectors.groupingBy(Person::getAge));
    }

    public Map<String, List<Person>> groupBySex() {
        return people.stream().collect(Collectors.groupingBy(Person::getSex));
    }

    public Double findAverageAge() {
        return people.stream().mapToInt(Person::getAge).average().getAsDouble();

    }
}
