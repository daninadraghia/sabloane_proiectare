package main.models;
import main.services.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private String url;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print()
    {
        System.out.println("Image with Name: " + this.imageName);
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
        visitor.visitImage(this);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}
