package Composite;

public class Pagina implements ElementoLibro {
    private int numero;
    private String contenuto;

    public Pagina(int numero, String contenuto) {
        this.numero = numero;
        this.contenuto = contenuto;
    }

    @Override
    public void stampa() {
        System.out.println("  Pagina " + numero + ": " + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
