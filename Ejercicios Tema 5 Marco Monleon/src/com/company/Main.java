package com.company;

public class Main {

    public static void main(String[] args) {
        // if, else if y else
        int numeroIf = -1989;

        if (numeroIf<0){
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        }
        else if(numeroIf>0){
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else {
            System.out.println("La variable numeroIf es cero");
        }

        //while
        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

        //do while
        //Al no cumplirse la condición, solo entra en el bucle una vez
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        //for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){

            System.out.println(numeroFor);}

        //switch
        String estacion= "Verano";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Esto no es una estacion");
        }
    }
}