package org.example;

import org.example.MODELOS.Hincha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("****************************");
        System.out.println("SISTEMA DE ABONOS 2024-2");
        System.out.println("****************************");

        System.out.println("\n Bienvenido !!!");

        Scanner lea = new Scanner(System.in);
        Hincha hincha = new Hincha();

        System.out.print("Digita tu nombre: ");
        hincha.setNombres(lea.nextLine());

        System.out.print("Digita tus apellidos: ");
        hincha.setApellidos(lea.nextLine());

        System.out.print("Digita tu numero de documento: ");
        hincha.setNumeroDocumento(lea.nextLine());

        System.out.print("Digita tu telefono: ");
        hincha.setTelefono(lea.nextLine());

        System.out.print("Digita tu correo: ");
        hincha.setCorreo(lea.nextLine());

        System.out.print("Digita tu direccion: ");
        hincha.setDireccion(lea.nextLine());

        System.out.print("Digita tu contacto de emergencia: ");
        hincha.setContactoEmergencia(lea.nextLine());

        System.out.print("En que ciudad vives: : ");
        hincha.setCiudad(lea.nextLine());

        System.out.print("En que año naciste: ");
        Integer anio = lea.nextInt();

        System.out.print("En que mes naciste: ");
        Integer mes = lea.nextInt();

        System.out.print("En que dia naciste: ");
        Integer dia = lea.nextInt();

        hincha.setFechaNacimiento(LocalDate.of(anio,mes,dia));


        //Imprimiendo los datos del hincha

        System.out.print(hincha);



        /* LocalDate fechaPrueba = LocalDate.of(2006,10,4);
        LocalDate fechaHoy = LocalDate.now();
        Long diferencia = ChronoUnit.DAYS.between(fechaPrueba,fechaHoy);
        Long diferenciaDos = ChronoUnit.MONTHS.between(fechaPrueba,fechaHoy);
        System.out.println(diferencia);
        System.out.println(diferenciaDos);
        System.out.println(fechaHoy); */



    }
}