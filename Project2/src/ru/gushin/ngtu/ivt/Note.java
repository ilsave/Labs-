package ru.gushin.ngtu.ivt;

public class Note extends Document implements  IDocument{
private String theme;

    public Note(String name, String theme) {
        super(name);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Note{" +
                "theme='" + theme + '\'' +  "name ="+super.name+'}';
    }

    @Override
    public IDocument getDoc() {
        return this::getDoc;
    }
}
