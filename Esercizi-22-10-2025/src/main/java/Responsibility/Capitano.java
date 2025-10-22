package Responsibility;

public class Capitano extends Ufficiale {
    public Capitano() {
        this.grado = "Capitano";
        this.stipendio = 3000;
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        if ("addestramento".equalsIgnoreCase(richiesta)) {
            System.out.println(grado + " autorizza: addestramento.");
        } else if (superiore != null) {
            superiore.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Richiesta non gestita.");
        }
    }
}

