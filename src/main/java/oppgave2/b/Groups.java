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
        return null;
    }

    public Map<Integer, List<Person>> groupByAge() {
        return null;
    }

    public Map<String, List<Person>> groupBySex() {
        return null;
    }

    public Double findAverageAge() {
        return 0.0d;
    }
}
