package oppgave2.a;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class StreamConvert {

    public static List<String> convertToString() {
        return Stream.of(2.10, 3.67, 5.33, 8.7)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    public static List<String> orderedList() {
        return Stream.of("d2", "a2", "b1", "b3", "c", "r1", "d6")
                .sorted()
                .collect(Collectors.toList());
    }


}
