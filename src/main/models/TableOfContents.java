package main.models;
import main.services.*;

public class TableOfContents implements Element {
    public void print()
    {

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
        visitor.visitTableOfContents(this);
    }
}
