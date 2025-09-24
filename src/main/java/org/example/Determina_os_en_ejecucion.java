package org.example;

import java.sql.SQLOutput;

public class Determina_os_en_ejecucion {
    public static void main(String[] args) {
        String so = System.getProperty("os.name");
        String comando;
// Determinar comando Windows o Linux
        if (so.equals("Linux")) {
            System.out.println("Linux");
        } else {
            System.out.println("windows");
        }


    }
}
