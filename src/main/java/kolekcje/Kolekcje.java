package kolekcje;

import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        List<String> lista;
        lista = new ArrayList<>();
        lista = new LinkedList<>();


        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack.pop());


    }
}
