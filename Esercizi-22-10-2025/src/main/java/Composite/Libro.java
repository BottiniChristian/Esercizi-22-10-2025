package Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ElementoLibro {
    private String titolo;
    private List<String> autori;
    private double prezzo;
    private final List<ElementoLibro> contenuto = new ArrayList<>();

    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungi(ElementoLibro el) {
        contenuto.add(el);
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titolo + " (" + prezzo + "€)");
        System.out.println("Autori: " + String.join(", ", autori));
        for (ElementoLibro e : contenuto) {
            e.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int tot = 0;
        for (ElementoLibro e : contenuto) {
            tot += e.getNumeroPagine();
        }
        return tot;
    }
}

