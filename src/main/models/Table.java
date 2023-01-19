package main.models;
import main.services.*;

public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print()
    {
        System.out.println("Table with Title: " + this.title);
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
        visitor.visitTable(this);
    }
}