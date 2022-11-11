package com.josst;

import java.util.Scanner;

public class MensajeService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje:");
        String mensaje= sc.nextLine();
        System.out.println("Tu nombre :");
        String autor = sc.nextLine();
        Mensajes registro = new Mensajes();
        registro.setMensjae(mensaje);
        registro.setAutor_mensaje(autor);

        MensajesDAO.crearMensajeDB(registro);
    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        listarMensajes();
        System.out.println("Indica el id del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    public static void editarMensaje(){

    }
}
