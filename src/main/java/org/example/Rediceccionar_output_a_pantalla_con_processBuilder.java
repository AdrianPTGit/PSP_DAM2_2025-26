package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rediceccionar_output_a_pantalla_con_processBuilder {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe","/C","dir");
            Process p=pb.start();

            BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
