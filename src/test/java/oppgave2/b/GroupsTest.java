package oppgave2.b;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class GroupsTest {

    private Groups groups;

    @Before
    public void setUp() throws Exception {
        groups = new Groups();
    }

    @Test
    public void groupByName() throws Exception {
        groups.groupByName().forEach((name, person) -> System.out.format("Name %s: %s\n", name, person));
    }

    @Test
    public void groupByAge() throws Exception {
        groups.groupByName().forEach((age, person) -> System.out.format("Age %s: %s\n", age, person));
    }

    @Test
    public void groupBySex() throws Exception {
        groups.groupByName().forEach((sex, person) -> System.out.format("Sex %s: %s\n", sex, person));
    }

    @Test
    public void findAverageAge() throws Exception {
        assertThat(groups.findAverageAge()).isEqualTo(19.846153846153847);
    }

}