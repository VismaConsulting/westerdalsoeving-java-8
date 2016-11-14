package oppgave4.a;

import java.util.List;

public class Landoversikt {
    public static Land finnLandMedFlestInnbyggere(List<Land> land) {
        return land.stream()
                .max((land1, land2) -> Long.compare(land1.innbyggere, land2.innbyggere))
                .get();
    }

    public static long finnAntallBokstaverINavnene(List<Land> land) {
        return land.stream()
                .mapToInt(l -> l.navn.length())
                .sum();
    }

    public static long finnTotaltAntallInnbyggere(List<Land> land) {
        return land.stream()
                .mapToLong(l -> l.innbyggere)
                .sum();
    }

    public static double finnGjennomsnittligFolketallIAlleLandSomTilhoererUK(List<Land> land) {
        return land.stream()
                .filter(l -> l.navn.contains("(UK)"))
                .mapToLong(l -> l.innbyggere)
                .average()
                .getAsDouble();
    }
}
