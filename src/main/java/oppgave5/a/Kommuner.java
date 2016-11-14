package oppgave5.a;


import java.util.HashSet;
import java.util.Set;

/**
 * 14.11.2016
 *
 * @author <a href="mailto:leo-andreas.ervik@visma.com">Leo-Andreas Ervik</a>.
 */
public class Kommuner {

    public Set<String> nordNorge = new HashSet<>();
    public Set<String> trondelag = new HashSet<>();
    public Set<String> vestlandet = new HashSet<>();
    public Set<String> sorlandet = new HashSet<>();
    public Set<String> ostlandet = new HashSet<>();

    public Kommuner() {
        nordNorge.add("Finnmark");
        nordNorge.add("Troms");
        nordNorge.add("Nordland");

        trondelag.add("Nord Trøndelag");
        trondelag.add("Sør Trøndelag");

        vestlandet.add("Møre og Romsdal");
        vestlandet.add("Sogn og Fjorane");
        vestlandet.add("Hordaland");
        vestlandet.add("Rogaland");

        sorlandet.add("Vest Agder");
        sorlandet.add("Aust Agder");

        ostlandet.add("Telemark");
        ostlandet.add("Vestfold");
        ostlandet.add("Buskerud");
        ostlandet.add("Oppland");
        ostlandet.add("Hedmark");
        ostlandet.add("Oslo");
        ostlandet.add("Akershus");
        ostlandet.add("Østfold");
    }

    public Set<String> convertToOneSetWithFlatMap() {
        return null;
    }
}
