package Composite;

import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Pagina p1 = new Pagina(1, "Frontespizio");
        Pagina p2 = new Pagina(2, "Introduzione");
        Pagina p3 = new Pagina(3, "Contenuto capitolo 1");
        Pagina p4 = new Pagina(4, "Contenuto capitolo 2");

        Sezione cap1 = new Sezione("Capitolo 1");
        cap1.aggiungi(p3);

        Sezione cap2 = new Sezione("Capitolo 2");
        cap2.aggiungi(p4);

        Sezione parte = new Sezione("Parte I");
        parte.aggiungi(cap1);
        parte.aggiungi(cap2);

        Libro libro = new Libro("Design Patterns - Esempio", List.of("Autore A", "Autore B"), 29.90);
        libro.aggiungi(p1);
        libro.aggiungi(p2);
        libro.aggiungi(parte);

        libro.stampa();
        System.out.println("Totale pagine: " + libro.getNumeroPagine());
    }
}

