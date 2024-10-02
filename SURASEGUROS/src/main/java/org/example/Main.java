package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Asegurado aseguradoUno = new Asegurado();
        Asegurado aseguradoDos = new Asegurado(1l, "12345", "seguro inmueble", "Julieta Grisales", 22, "mujer", "1041631843", LocalDate.of(2006,10,4), "calle 8 # 10-111", "3202122930", "julieta@gmail.com", "medico", 1_000_000D, 2_000_000D, "activo");

        Inmueble inmuebleUno = new Inmueble();
        Inmueble inmuebleDos = new Inmueble(1l, "Finca La Julieta", "calle 9 #7-24", "Finca de dos pisos, con capacidad de albergar 50 personas", 100_000_000D, "Finca", "100 metros cuadrados", "En uso", "al dia", "todos");

        Beneficiario beneficiarioUno = new Beneficiario();
        Beneficiario beneficiarioDos = new Beneficiario(1l, "Luciana Grisales", "1000657736", LocalDate.of(2002,12,26), "3218023608", "luciana@gmail.com", "calle 10 # 10-101", "hermana", 5.0, "economico" );

        Asesor asesorUno = new Asesor();
        Asesor asesorDos = new Asesor(1l, "Emma Sanin", "10542389", "320657489", "Emma@gmail.com", "carrera 8 # 10-33", "seguros", 10, "8am-5pm", "Lunea a Viernes");

        Agencia agenciaUno = new Agencia();
        Agencia agenciaDos = new Agencia(1l, "Seguros Sura", "12345678", "carrera 10 # 10-20", "Medellin", "3202144646", "Sura@gmail.com", "suraseguros.com", "Claudia Calle", 5.0);

        Scanner lea = new Scanner(System.in);
        System.out.print("Digita el id: ");
        agenciaUno.setId(lea.nextLong());

        System.out.print("Digita el nombre de la agencia: ");
        agenciaUno.setNombreAgencia(lea.nextLine());

        System.out.print("Digita el NIT: ");
        agenciaUno.setNit(lea.nextLine());

        System.out.print("Digita la direccion: ");
        agenciaUno.setDireccion(lea.nextLine());

        System.out.print("Digita la ciudad: ");
        agenciaUno.setCiudad(lea.next());

        System.out.print("Digita el telefono: ");
        agenciaUno.setTelefono(lea.next());

        System.out.print("Digita el correo: ");
        agenciaUno.setCorreo(lea.nextLine());

        System.out.print("Cual es tu sitio Web ");
        agenciaUno.setSitioWeb(lea.nextLine());

        System.out.print("Digita el nombre del gerente: ");
        agenciaUno.setGerente(lea.nextLine());

        System.out.print("Digita el rating de la empresa: ");
        agenciaUno.setRating(lea.nextDouble());

    }
}