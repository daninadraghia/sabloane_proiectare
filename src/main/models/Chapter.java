package main.models;
import main.services.*;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public Chapter(String name) {
        this.name = name;
        subChapterList = new ArrayList<SubChapter>();
    }

    public int createSubChapter(String subchapterName)
    {
        SubChapter subcapitol = new SubChapter(subchapterName);
        subChapterList.add(subcapitol);
        return subChapterList.size() - 1;
    }

    public SubChapter getSubChapter(int index)
    {
        return subChapterList.get(index);
    }

    public void print()
    {
        System.out.print("Chapter: " + this.name + "\n");
        for(int i = 0; i < subChapterList.size(); i++)
        {
            subChapterList.get(i).print();
        }
    }
}
