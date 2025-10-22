package Responsibility;

public class Generale extends Ufficiale {
    public Generale() {
        this.grado = "Generale";
        this.stipendio = 7000;
    }

    @Override
    public void gestisciRichiesta(String richiesta) {
        // Il generale decide sempre (caso finale)
        System.out.println(grado + " decide sulla richiesta: " + richiesta);
    }
}
