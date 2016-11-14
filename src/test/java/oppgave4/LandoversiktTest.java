package oppgave4;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class LandoversiktTest {

    @Test
    public void skalImportereAlleLand() throws Exception {
        List<Land> land = hentLand();
        assertThat(land).contains(new Land("South Ossetia", 53532));
    }

    @Test
    public void skalFinneLandetMedFlestInnbyggere() throws IOException, URISyntaxException {
        Land land = Landoversikt.finnLandMedFlestInnbyggere(hentLand());
        assertThat(land).isEqualTo(new Land("China", 1379840000));
    }

    @Test
    public void skalFinneTotaletAvAlleBokstaverINavneneTilLandene() throws Exception {
        long antallBokstaver = Landoversikt.finnAntallBokstaverINavnene(hentLand());
        assertThat(antallBokstaver).isEqualTo(2617L);

    }

    @Test
    public void skalFinneTotalAntallInnbygger() throws Exception {
        long antallBokstaver = Landoversikt.finnTotaltAntallInnbyggere(hentLand());
        assertThat(antallBokstaver).isEqualTo(7409522864L);
    }

    @Test
    public void skalFinneGjennomsnittligFolketallIAlleLandSomTilhoererUK() throws Exception {
        double landSomTilhoererUK = Landoversikt.finnGjennomsnittligFolketallIAlleLandSomTilhoererUK(hentLand());
        assertThat(landSomTilhoererUK).isEqualTo(27648.23076923077);
    }

    private List<Land> hentLand() throws URISyntaxException, IOException {
        URL resource = this.getClass()
                .getResource("/land.csv");

        try (Stream<String> stream = Files.lines(Paths.get(resource.toURI()))) {

            return stream.filter(s -> !s.startsWith("Country"))
                    .map(land -> {
                        String[] split = land.split(";");
                        return new Land(split[0], Integer.parseInt(split[1]));
                    }).collect(Collectors.toList());

        }
    }
}