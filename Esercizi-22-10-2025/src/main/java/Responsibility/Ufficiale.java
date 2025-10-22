package Responsibility;

public abstract class Ufficiale {
    protected Ufficiale superiore;
    protected String grado;
    protected double stipendio;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public abstract void gestisciRichiesta(String richiesta);

    public String getGrado() {
        return grado;
    }

    public double getStipendio() {
        return stipendio;
    }
}
