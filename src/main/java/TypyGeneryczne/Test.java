package TypyGeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List lista = new ArrayList();
        lista.add("somebody");
        lista.add(666);

        list.add("once");
        list.add("told me");
//        list.add(666);



//        for (Object o : lista
//        ) {
//            System.out.println(((String) o).length());
//        }

        for (String element :
                list) {
            System.out.println(element.length());
        }
    }
}
