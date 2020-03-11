package ru.gushin.ngtu.ivt;

import java.util.List;

public class Printer {

    public static void printing(Document document) {
        if (document instanceof Note) {
            System.out.println("thats note!");
            System.out.println(document.toString());
        }
        if (document instanceof Passport) {
            System.out.println("tahts passport");
            System.out.println(document.toString());
        }
    }

    public static void printMyFactory(List<Document> list) {
        for (Document a : list) {
            Printer.printing(a);
        }
    }
}
