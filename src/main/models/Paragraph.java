package main.models;
import main.services.*;

public class Paragraph implements Element
{
    private String text, text2;

    public Paragraph(String text) {
        this.text = text;
        this.text2 = text;
    }

    public void print()
    {
        System.out.println("Paragraph: " + this.text);
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
        visitor.visitParagraph(this);
    }

    public void setAlignStrategy(AlignStrategy strategy)
    {
        Context context = new Context(strategy);
        this.text = this.text2 + context.executeStrategy(this, context);
    }
}
