import java.util.ArrayList;
import java.util.List;
public class Fisiere implements Element{
    private String nume;
    private List<Element> listaF = new ArrayList<Element>();

    public Fisiere(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Element> getListaF() {
        return listaF;
    }

    public void setListaF(List<Element> listaF) {
        this.listaF = listaF;
    }

    @Override
    public void print() {
        System.out.println(" Nume Fisier: " + this.nume);
        for(int i = 0; i < listaF.size(); i++){
            listaF.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaF.add(addElement);
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
        visitor.visitFisier(this);
        for (Element el: listaF)
        {
            el.accept(visitor);
        }
    }
}
