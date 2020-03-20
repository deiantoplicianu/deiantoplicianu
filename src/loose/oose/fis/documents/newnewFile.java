public class newnewFile {
    protected String[] continut;

    public Document(String[] continut) {
        this.continut = continut;
    }

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        String res = "";
        for (String cuvant : continut) {
            //modif
        }
        return res;
    }
}