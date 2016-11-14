package oppgave1.a;

import java.util.List;
import java.util.stream.Collectors;

public class Pingvinkoloni {

    public static List<Pingvin> pingvinerSomVeierOver(List<Pingvin> pingviner, int overKilo) {
        return pingviner.stream()
                .filter(pingvin -> pingvin.vekt > overKilo)
                .collect(Collectors.toList());
    }

    public static List<Pingvin> sorterEtterNavn(List<Pingvin> pingviner) {
        return pingviner.stream()
                .sorted((a, b) -> a.navn.compareTo(b.navn))
                .collect(Collectors.toList());
    }
}
