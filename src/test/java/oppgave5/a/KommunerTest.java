package oppgave5.a;

import oppgave5.a.Kommuner;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class KommunerTest {

    private Set<String> converted;
    private Kommuner kommuner;

    @Before
    public void setUp() throws Exception {
        kommuner = new Kommuner();
    }

    @Test
    public void testConvertManySetsToOne() throws Exception {
        converted = kommuner.convertToOneSetWithFlatMap();

        assertThat(converted).hasSize(19);
    }
}