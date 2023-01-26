public class FIsierTXT implements Element{
    private String nume;

    public FIsierTXT(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void print() {
        System.out.println("  Fisier --> Nume: " + this.nume + ", Tip: TXT");
    }

    @Override
    public void add(Element addElement) {

    }

    @Override
    public void remove(Element removeElement) {

    }

    @Override
    public int get(Element getElement) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFisierTXT(this);
    }
}
