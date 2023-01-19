package main.models;
import main.services.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Element, Picture {
    private String url;
    private List<Image> imageList = new ArrayList<Image>();
    private Dimension dim;
    private Image realImage;

    private Image loadImage()
    {
        if(realImage == null)
        {
            realImage = new Image(url);
        }
        return realImage;
    }

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    @Override
    public void print() {
        realImage = loadImage();
        System.out.println("ImageProxy with url: " + this.url);
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
        visitor.visitImageProxy(this);
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
