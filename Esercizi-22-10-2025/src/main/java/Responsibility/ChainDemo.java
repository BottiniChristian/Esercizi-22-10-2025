package Responsibility;

public class ChainDemo {
    public static void main(String[] args) {
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        System.out.println("Esempi di richieste:");
        tenente.gestisciRichiesta("permesso breve");
        tenente.gestisciRichiesta("addestramento");
        tenente.gestisciRichiesta("missione speciale");
        tenente.gestisciRichiesta("operazione militare");
        tenente.gestisciRichiesta("richiesta imprevista");
    }
}
