package org.example;

import java.util.Map;

public class Información_del_sistema_con_process_builder {
    public static void main(String[] args) {
        ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe", "datos.txt");
        Map<String, String> env = pBuilder.environment();
        System.out.println("Num procesadores: " + env.get("NUMBER_OF_PROCESSORS"));


    }
}
