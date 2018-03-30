package Classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Data {
    private String data;

public static String getDataAtual() {
        SimpleDateFormat datas = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        String grava = datas.format(cal.getTime());
        return grava;
    }

    
}