package Adapter;

import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        String n = (info.getNome() != null) ? info.getNome() : "";
        String c = (info.getCognome() != null) ? info.getCognome() : "";
        return (n + " " + c).trim();
    }

    @Override
    public int getEta() {
        Date nascita = info.getDataDiNascita();
        if (nascita == null) return 0;
        Calendar oggi = Calendar.getInstance();
        Calendar dataNascita = Calendar.getInstance();
        dataNascita.setTime(nascita);
        int age = oggi.get(Calendar.YEAR) - dataNascita.get(Calendar.YEAR);
        if (oggi.get(Calendar.DAY_OF_YEAR) < dataNascita.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
}
