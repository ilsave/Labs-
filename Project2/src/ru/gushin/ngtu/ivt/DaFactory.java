package ru.gushin.ngtu.ivt;

import javax.print.attribute.DocAttribute;
import java.util.LinkedList;
import java.util.List;

public class DaFactory {
    private DaFactory(){}
    public static List<Document> getDaFactory(){
        List<Document> list1 = new LinkedList<>();
        list1.add(new Note("Ilya", "new one"));
        list1.add(new Passport("not Ilya", "123", 1234567890));
      return list1;
    }
}
