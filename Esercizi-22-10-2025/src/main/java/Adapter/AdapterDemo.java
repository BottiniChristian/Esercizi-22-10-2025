package Adapter;

import java.util.Calendar;

public class AdapterDemo {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        Calendar c = Calendar.getInstance();
        c.set(2004, Calendar.APRIL, 15);
        info.setDataDiNascita(c.getTime());

        InfoAdapter adapter = new InfoAdapter(info);
        UserData user = new UserData();
        user.getData(adapter);

        System.out.println("Nome completo: " + user.getNomeCompleto());
        System.out.println("Età: " + user.getEta());
    }
}
