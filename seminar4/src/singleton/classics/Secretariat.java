package singleton.classics;

public class Secretariat {

    private int numarBirou;
    private int numarAngajati;

    public static Secretariat instanta = null;

    public Secretariat(int numarBirou, int numarAngajati) {
        this.numarBirou = numarBirou;
        this.numarAngajati = numarAngajati;
    }
    public synchronized Secretariat getInstance(int numarBirou, int numarAngajati)
    {
        if (instanta ==null)
        {
            instanta = new Secretariat(numarBirou, numarAngajati);
        }
        return instanta;
    }


    @Override
    public String toString() {
        return "Secretariat{" +
                "numarBirou=" + numarBirou +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}



