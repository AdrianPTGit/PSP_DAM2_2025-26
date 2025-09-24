package org.example;

import java.io.IOException;

public class Crear_Proceso_ProcessBuilder {
    public static void main(String[] args) throws IOException {
        new ProcessBuilder("Notepad.exe").start();

        // Create ProcessBuilder.
        ProcessBuilder p = new ProcessBuilder();

        // Use command "notepad.exe" and open the file.
       // p.command("notepad.exe");

        p.command("notepad.exe", "notas4.txt");

        p.start();


    }
}
