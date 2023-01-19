package main.models;
import main.services.*;

public class Context {
    private AlignStrategy strategy;

    public Context(AlignStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(Paragraph paragraph, Context context){
        return strategy.render(paragraph, context);
    }
}
