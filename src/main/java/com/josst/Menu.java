package com.josst;

import java.util.Scanner;

public class Menu {

    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion =0;
        do{
            System.out.println("-----------------------");
            System.out.println("APLICACIÓN DE MENSAJES");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            //Leemos la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensajes();
                    break;
                case 3:
                    MensajeService.borrarMensaje();
                    break;
                case 4:
                    MensajeService.editarMensaje();
                    break;
                default:
                    break;

            }
        }while (opcion!=5);


    }
}
