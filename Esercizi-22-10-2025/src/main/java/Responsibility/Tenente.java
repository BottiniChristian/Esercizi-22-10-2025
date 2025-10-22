package Responsibility;

public class Tenente extends Ufficiale {
    public Tenente() {
        this.grado = "Tenente";
        this.stipendio = 2000;
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if ("permesso breve".equalsIgnoreCase(richiesta)) {
            System.out.println(grado + " approva: permesso breve.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Richiesta non gestita.");
        }
    }
}
