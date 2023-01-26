import java.util.ArrayList;
import java.util.List;

public class Director implements Element{
    private String nume;
    private List<Element> listaD = new ArrayList<Element>();

    public Director(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Element> getListaD() {
        return listaD;
    }

    public void setListaD(List<Element> listaD) {
        this.listaD = listaD;
    }

    @Override
    public void print() {
        System.out.println("\n" + "Nume Director: " + this.nume);
        for(int i = 0; i < listaD.size(); i++){
            listaD.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaD.add(addElement);
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
        visitor.visitDirector(this);
        for (Element el: listaD)
        {
            el.accept(visitor);
        }
    }
}
