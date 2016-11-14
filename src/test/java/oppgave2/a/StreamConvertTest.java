package oppgave2.a;

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
public class StreamConvertTest {

    private List<String> stringDoubles;
    private List<String> orderedList;

    @Before
    public void setUp() throws Exception {
        stringDoubles = Arrays.asList("2.1", "3.67", "5.33", "8.7");
        orderedList = Arrays.asList("a2", "b1", "b3", "c", "d2", "d6", "r1");
    }

    @Test
    public void convertToString() throws Exception {
        List<String> converted = StreamConvert.convertToString();
        assertThat(stringDoubles).isEqualTo(converted);
    }

    @Test
    public void orderedList() throws Exception {
        List<String> converted = StreamConvert.orderedList();
        assertThat(orderedList).isEqualTo(converted);
    }

}