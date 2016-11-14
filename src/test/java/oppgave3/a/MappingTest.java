package oppgave3.a;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class MappingTest {

    private Mapping mapping;
    private List<String> searches;

    @Before
    public void setUp() throws Exception {
        mapping = new Mapping();
        searches = Arrays.asList("BMW", "Audi", "Pontiac");
    }

    @Test
    public void collectedResult() throws Exception {
        for(String value : searches){
            System.out.printf("Expected: %-10s | Result: %10s\n", value, mapping.collectedResult(value));
            assertThat(value.equals(mapping.collectedResult(value)));
        }
    }

}