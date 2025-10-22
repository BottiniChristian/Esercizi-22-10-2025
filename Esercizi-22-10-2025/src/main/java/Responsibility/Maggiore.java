package Responsibility;

public class Maggiore extends Ufficiale {
    public Maggiore() {
        this.grado = "Maggiore";
        this.stipendio = 4000;
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if ("missione speciale".equalsIgnoreCase(richiesta)) {
            System.out.println(grado + " approva: missione speciale.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Richiesta non gestita.");
        }
    }
}
