package Responsibility;

public class Colonnello extends Ufficiale {
    public Colonnello() {
        this.grado = "Colonnello";
        this.stipendio = 5000;
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if ("operazione militare".equalsIgnoreCase(richiesta)) {
            System.out.println(grado + " approva: operazione militare.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Richiesta non gestita.");
        }
    }
}

