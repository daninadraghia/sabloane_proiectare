package main.models;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphList;
    private List<Image> imageList;
    private List<Table> tableList;

    public SubChapter(String name) {
        this.name = name;
        paragraphList = new ArrayList<Paragraph>();
        imageList = new ArrayList<Image>();
        tableList = new ArrayList<Table>();
    }

    public void createNewParagraph(String text) {
        Paragraph paragraph1 = new Paragraph(text);
        paragraphList.add(paragraph1);
    }

    public void createNewImage(String text) {
        Image image1 = new Image(text);
        imageList.add(image1);
    }

    public void createNewTable(String text) {
        Table table1 = new Table(text);
        tableList.add(table1);
    }

    public void print()
    {
        System.out.print("Subchapter: " + this.name + "\n");
        for(int i = 0; i < paragraphList.size(); i++)
        {
            paragraphList.get(i).print();
        }

        for(int i = 0; i < imageList.size(); i++)
        {
            imageList.get(i).print();
        }

        for(int i = 0; i < tableList.size(); i++)
        {
            tableList.get(i).print();
        }
    }
}