package main.services;
import main.models.*;

public class BookStatistics implements Visitor {
    int bookCount,
            sectionCount,
            tableOfContentCount,
            paragraphCount,
            imageProxyCount,
            imageCount,
            tableCount;

    public BookStatistics() {
    }


    public void printStatistics() {
        System.out.println("Sections visited: " + sectionCount);
        System.out.println("Table of Contents visited: " + tableOfContentCount);
        System.out.println("Paragraphs visited: " + paragraphCount);
        System.out.println("Image Proxys visited: " + imageProxyCount);
        System.out.println("Images visited: " + imageCount);
        System.out.println("Tables visited: " + tableCount);
    }

    @Override
    public void visitBook(Book B) {
        bookCount++;
    }

    @Override
    public void visitSection(Section S) {
        sectionCount++;
    }

    @Override
    public void visitTableOfContents(TableOfContents ToC) {
        tableOfContentCount++;
    }

    @Override
    public void visitParagraph(Paragraph P) {
        paragraphCount++;
    }

    @Override
    public void visitImageProxy(ImageProxy IP) {
        imageProxyCount++;
    }

    @Override
    public void visitImage(Image I) {
        imageCount++;
    }

    @Override
    public void visitTable(Table T) {
        tableCount++;
    }
}
