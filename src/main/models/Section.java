package main.models;
import main.services.*;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String tile;
    public List<Element> listaElemente = new ArrayList<Element>();

    public Section(String tile) {
        this.tile = tile;
    }

    public Section() {

    }

    @Override
    public void print() {
        System.out.println(this.tile);
        for(int i = 0; i < listaElemente.size(); i++){
            listaElemente.get(i).print();
        }
    }

    @Override
    public void add(Element addElement) {
        listaElemente.add(addElement);
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
        visitor.visitSection(this);
        for (Element el: listaElemente)
        {
            el.accept(visitor);
        }
    }
}
