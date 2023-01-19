package main.models;
import main.services.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book extends Section{
    private String title;
    private List<Author> authorList = new ArrayList<Author>();

    public Book(String title) {
        super();
        this.title = title;
    }

    public void addAuthor(Author authorName)
    {
        authorList.add(authorName);
    }

    public void addContent(Element elemente) {
        listaElemente.add(elemente);
    }

    public void print()
    {
        System.out.println("Book:"+title);
        System.out.println();
        System.out.println("Authors:");
        for(int i = 0; i < authorList.size(); i++)
            authorList.get(i).print();
        System.out.println();
        for(int i = 0; i < listaElemente.size(); i++)
            listaElemente.get(i).print();
    }


}