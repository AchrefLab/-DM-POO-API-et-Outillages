package com.java.tp3;

import java.io.*;
import java.net.ServerSocket;

public class Serveur {

 private int port;
 private String SERVEUR_DIR=System.getProperty("user.dir");
 public Serveur(int port){
     this.port =port;

 }
     private void GET_FILE(String nom) throws IOException {
         int i = 0;

         boolean b = false;
         String ligne;
         File file = new File(SERVEUR_DIR);
          File clientFile=new File("clientTEST");


         File[] files = file.listFiles();

         if (files != null) {
             for (int j = 0; j < files.length; j++) {
                 if (!files[j].isDirectory() && files[j].getName().equals(nom)) {
                     System.out.println("fichier: " + files[j].getAbsolutePath());
                 }


                 while (i < files.length && !b) {
                     if (files[i].getName().equals(nom)) {
                         b = true;

                     }
                     i++;
                 }

             }

             if (i < files.length) {
                 BufferedReader lb = new BufferedReader(new FileReader(files[i - 1].getName()));
                 while ((ligne = lb.readLine()) != null)
                     System.out.println(ligne);
                 lb.close();
             } else System.out.println("fichier non trouvé");
         }
             InputStream inStream = new FileInputStream(file);
             OutputStream outStream = new FileOutputStream(clientFile);
             byte[]buffer = new byte[1024];
             int length;
             //copy the file content in bytes
             while ((length = inStream.read(buffer)) > 0){

                 outStream.write(buffer, 0, length);

             }
             inStream.close();
             outStream.close();

             System.out.println("le fichier est bien copié");

     }
    public static void main(String[] args) throws IOException {
    // int port= Integer.parseInt(args[0]);
        Serveur s= new Serveur (5488);
        s.GET_FILE("blala.txt");
    }
         }


