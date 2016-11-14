package oppgave1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PingvinkoloniTest {

    @Test
    public void skalFinnePingvinerSomVeierOverEtVisstAntallKilo() throws Exception {
        Pingvin tyngstePingvin = new Pingvin("Åge", 1996, 23);
        List<Pingvin> pingviner = Arrays.asList(
                tyngstePingvin,
                new Pingvin("Tor", 2000, 20),
                new Pingvin("Per", 2003, 11),
                new Pingvin("Mohammed", 2005, 15)
        );
        List<Pingvin> pingvinerSomVeierOver = Pingvinkoloni.pingvinerSomVeierOver(pingviner, 22);

        assertThat(pingvinerSomVeierOver).hasSize(1);

    }
}