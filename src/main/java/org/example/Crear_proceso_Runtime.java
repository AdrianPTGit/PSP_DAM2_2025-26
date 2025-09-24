package org.example;

import java.io.IOException;

public class Crear_proceso_Runtime {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("Notepad.exe");
        Runtime.getRuntime().exec("Notepad.exe notas.txt");

        String[] infoProceso = {"Notepad.exe","notas1.txt"};
        Runtime.getRuntime().exec(infoProceso);
    }
}
