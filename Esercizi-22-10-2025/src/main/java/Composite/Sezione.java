package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {
    private String titolo;
    private final List<ElementoLibro> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungi(ElementoLibro el) {
        elementi.add(el);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (ElementoLibro e : elementi) {
            e.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int tot = 0;
        for (ElementoLibro e : elementi) {
            tot += e.getNumeroPagine();
        }
        return tot;
    }
}
