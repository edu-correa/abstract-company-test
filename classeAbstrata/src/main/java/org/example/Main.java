package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Vendedor v = new Vendedor("402399100", "Edu", 10.0, 1000.0);
       Horista h = new Horista("402399101", "Edu2", 300, 10.0);

       Empresa e = new Empresa();
       e.adicionarFunc(v);
       e.adicionarFunc(h);

       e.exibeTodos();

        System.out.println("/////////////////");

        e.exibeTotalSalario();
    }
}