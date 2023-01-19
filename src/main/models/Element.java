package main.models;
import main.services.*;

public interface Element {
    public void print();
    public void add(Element addElement);
    public void remove(Element removeElement);
    public int get(Element getElement);

    public void accept(Visitor visitor);
}
