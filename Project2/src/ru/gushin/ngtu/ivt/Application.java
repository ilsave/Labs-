package ru.gushin.ngtu.ivt;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Document doc1 = new Note("Going to superMarket", "wanna eat");
        Document doc2 = new Passport("Ilya ", "123", 67890);
        Printer.printing(doc1);
        Printer.printing(doc2);
        //IDocument tr = new Passport();
        System.out.println("FACTORU HAS BEEN STARTED");
        List<Document> factory = DaFactory.getDaFactory();
        Printer.printMyFactory(factory);
    }
}
