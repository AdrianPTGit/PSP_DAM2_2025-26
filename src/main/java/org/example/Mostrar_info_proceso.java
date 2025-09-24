package org.example;

public class Mostrar_info_proceso {
    // Referencia al entorno de ejecución actual
    Runtime r = Runtime.getRuntime();

    void mostrarInfo(){
        // Número de procesadores disponibles
        System.out.println("Procesadores disponibles: " + r.availableProcessors());
    }

    void mostraEntorn() {
        double totalGB = r.totalMemory() / (1024.0 * 1024 * 1024);
        double libreGB = r.freeMemory() / (1024.0 * 1024 * 1024);
        double maxGB   = r.maxMemory()   / (1024.0 * 1024 * 1024);

        System.out.printf("Memoria total: %.2f GB%n", totalGB);
        System.out.printf("Memoria libre: %.2f GB%n", libreGB);
        System.out.printf("Memoria máxima: %.2f GB%n", maxGB);
        System.out.printf("Memoria usada: %.2f GB%n", (totalGB - libreGB));
    }

    void NetejaFem() {
        r.gc(); // Llamar al recolector de basura
    }

    public static void main(String[] args) throws Exception {
        Mostrar_info_proceso rd = new Mostrar_info_proceso();

        rd.mostrarInfo();
        System.out.println("\nEstado inicial..");

        // Llenamos la memoria
        rd.mostraEntorn();
        for (int i = 0; i <= 10000; i++) {
            new Object();
        }

        System.out.println("\nEstado después de crear 10.000 objetos");
        rd.mostraEntorn();

        // Llamamos al colector de basura
        rd.NetejaFem();

        System.out.println("\nEstado tras llamar al colector de basura");
        rd.mostraEntorn();
    }
}

