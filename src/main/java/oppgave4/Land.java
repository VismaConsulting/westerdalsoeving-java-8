package oppgave4;

public class Land {
    public final String navn;
    public final long innbyggere;

    public Land(String navn, long innbyggere) {
        this.navn = navn;
        this.innbyggere = innbyggere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Land land = (Land) o;

        if (innbyggere != land.innbyggere) return false;
        return navn != null ? navn.equals(land.navn) : land.navn == null;

    }

    @Override
    public int hashCode() {
        int result = navn != null ? navn.hashCode() : 0;
        result = 31 * result + (int) (innbyggere ^ (innbyggere >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Land{" +
                "navn='" + navn + '\'' +
                ", innbyggere=" + innbyggere +
                '}';
    }
}
