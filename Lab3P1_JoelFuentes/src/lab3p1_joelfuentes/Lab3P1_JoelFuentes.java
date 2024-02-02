package lab3p1_joelfuentes;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jefue
 */
public class Lab3P1_JoelFuentes {

    public static void main(String[] args) {
        Scanner mcok_string = new Scanner(System.in);
        Scanner mcok_numero = new Scanner(System.in);
        Random randint = new Random();

        while (true)
        {
            System.out.println("Bienvenido a mi laboratorio :)");
            System.out.println("1) Los 75 juegos del hambre");
            System.out.println("2) Wordle");
            System.out.println("3) Movimiento de pendulo");
            System.out.println("4) Salir");
            System.out.print("Escoge tu opcion: ");
            byte opcion = mcok_numero.nextByte();

            switch (opcion)
            {
                case 1:
                {
                    int x = randint.nextInt(2);
                    byte empezar_while = 1;
                    while (empezar_while == 1)
                    {
                        System.out.println("Bienvenido a los 75 juegos del hambre");
                        System.out.println("Escoga los peleadores el distrito 1, 11 o 12: ");
                        byte distrito = mcok_numero.nextByte();
                        System.out.println("");

                        switch (distrito)
                        {
                            case 1:
                            {
                                System.out.println("Tributos masculinos disponibles:");
                                System.out.println("Gloss \nMarvel");
                                System.out.println("");
                                System.out.println("Tributos femeninas disponibles:");
                                System.out.println("Cashmere \nGlimmer");
                                System.out.println("");

                                switch (x)
                                {
                                    case 0:
                                    {
                                        System.out.println("El tributo masculino es Gloss");
                                        System.out.println("El tributo femenino es Cashmere");
                                        break;
                                    }
                                    case 1:
                                    {
                                        System.out.println("El tributo masculino es Marvel");
                                        System.out.println("El tributo femenino es Glimmer");
                                        break;
                                    }
                                }
                                System.out.println("Desea continuar? \n1)si, 2)no");
                                byte continuar = mcok_numero.nextByte();
                                switch (continuar)
                                {
                                    case 1:
                                    {
                                        System.out.println("");
                                        continue;
                                    }
                                    case 2:
                                    {
                                        System.out.println("Que la suerte siempre este de tu lado");
                                        System.out.println("");
                                        empezar_while = 2;
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Opcion no valida");
                                        System.out.println("Porfavor ingrese una opcion valida");
                                        System.out.println("");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 11:
                            {
                                System.out.println("Tributos masculinos disponibles:");
                                System.out.println("Finnick Odair \nThresh");
                                System.out.println("Tributos femeninas disponibles:");
                                System.out.println("Rue \nJohanna Mason");

                                switch (x)
                                {
                                    case 0:
                                    {
                                        System.out.println("El tributo masculino es Finnick Odair");
                                        System.out.println("El tributo femenino es Rue");
                                        break;
                                    }
                                    case 1:
                                    {
                                        System.out.println("El tributo masculino es Thresh");
                                        System.out.println("El tributo femenino es Johanna Mason");
                                        break;
                                    }
                                }
                                System.out.println("Desea continuar? \n1)si, 2)no");
                                byte continuar = mcok_numero.nextByte();
                                switch (continuar)
                                {
                                    case 1:
                                    {
                                        System.out.println("");
                                        continue;
                                    }
                                    case 2:
                                    {
                                        System.out.println("Que la suerte siempre este de tu lado");
                                        System.out.println("");
                                        empezar_while = 2;
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Opcion no valida");
                                        System.out.println("Porfavor ingrese una opcion valida");
                                        System.out.println("");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 12:
                            {
                                System.out.println("Tributos masculinos disponibles:");
                                System.out.println("Peeta Mellark \nHamich Albernathy");
                                System.out.println("");
                                System.out.println("Tributos femeninas disponibles:");
                                System.out.println("Katniss Everdeen \nLucy Gray");
                                System.out.println("");

                                switch (x)
                                {
                                    case 0:
                                    {
                                        System.out.println("El tributo masculino es Peeta Mellark");
                                        System.out.println("El tributo femenino es Katniss Everdeen");
                                        break;
                                    }
                                    case 1:
                                    {
                                        System.out.println("El tributo masculino es Hamich Albernathy");
                                        System.out.println("El tributo femenino es Lucy Gray");
                                        break;
                                    }

                                }
                                System.out.println("Desea continuar? \n1)si, 2)no");
                                byte continuar = mcok_numero.nextByte();
                                switch (continuar)
                                {
                                    case 1:
                                    {
                                        System.out.println("");
                                        continue;
                                    }
                                    case 2:
                                    {
                                        System.out.println("Que la suerte siempre este de tu lado");
                                        System.out.println("");
                                        empezar_while = 2;
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Opcion no valida");
                                        System.out.println("Porfavor ingrese una opcion valida");
                                        System.out.println("");
                                        break;
                                    }
                                }
                                break;
                            }
                            default:
                            {
                                System.out.println("Opcion no valida");
                                System.out.println("Ingrese una opcion valida");
                                System.out.println("");
                                continue;
                            }
                        }
                    }
                }
                case 2:
                {
                    byte empezar_while = 1;
                    while (empezar_while == 1)
                    {
                        byte intentos = 6;
                        System.out.println("Bienvenido a Wordle :)");
                        System.out.println("Ingrese una palabra de 5 letras: ");
                        String palabra = mcok_string.next();
                        palabra = palabra.toLowerCase();
                        if (palabra.length() != 5)
                        {
                            System.out.println("Palabra no valida");
                            System.out.println("Porfavor ingrese una palabra de 5 letras");
                            System.out.println(" ");
                            continue;
                        }

                        System.out.println("Palabra guardada ;)");
                        System.out.println("Adivine la palabra: ");
                        while (intentos > 0)
                        {
                            System.out.print("Ingrese la palabra: ");
                            String adivina = mcok_string.next();
                            adivina = adivina.toLowerCase();
                            
                            if (adivina.charAt(0) == palabra.charAt(0) && adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(2) == palabra.charAt(2) 
                                    && adivina.charAt(3) == palabra.charAt(3) 
                                    && adivina.charAt(4) == palabra.charAt(4) ) {
                                intentos = 0;
                                System.out.print("Resultado: ");
                                palabra = palabra.toUpperCase();
                                System.out.println(palabra);
                                System.out.println("Has ganado la partida");
                                System.out.println(" ");
                                System.out.println("Desea intentar otra vez?");
                                
                                System.out.print("1) Si, 2) No: ");
                                byte continuar = mcok_numero.nextByte();
                                switch(continuar) {
                                    case 1: {
                                        continue;
                                    }
                                    case 2: {
                                        empezar_while = 3;
                                        break;
                                    }
                                    default: {
                                        System.out.println("Opcion no valida");
                                        break;
                                    }
                                }
                                    
                                } else if (adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(2) == palabra.charAt(2) 
                                    && adivina.charAt(3) == palabra.charAt(3)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println("-" + palabra.substring(1,5) );
                                
                                
                                } else if (adivina.charAt(0) == palabra.charAt(0) 
                                    && adivina.charAt(2) == palabra.charAt(2) 
                                    && adivina.charAt(3) == palabra.charAt(3)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println(palabra.charAt(0) + "-" + palabra.substring(2,5) );
                                
                                
                                
                                } else if (adivina.charAt(0) == palabra.charAt(0) 
                                    && adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(3) == palabra.charAt(3)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println(palabra.substring(0, 2) + "-" + palabra.substring(3,5) );
                                
                                } else if (adivina.charAt(0) == palabra.charAt(0) 
                                    && adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(2) == palabra.charAt(2)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println(palabra.substring(0, 3) + "-" + palabra.substring(4,5) );
                                
                                
                                
                                } else if (adivina.charAt(0) == palabra.charAt(0) 
                                    && adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(2) == palabra.charAt(2)
                                    && adivina.charAt(3) == palabra.charAt(3)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println(palabra.substring(0, 4) + "-");
                         
                                } else if (adivina.charAt(2) == palabra.charAt(2) 
                                    && adivina.charAt(3) == palabra.charAt(3)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println("--" + palabra.substring(2, 5));
                                
                                } else if (adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(3) == palabra.charAt(3)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println("-" + palabra.charAt(1) + "-" + palabra.substring(3,5));
                                    
                                } else if (adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(2) == palabra.charAt(2)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println("-" + palabra.substring(1, 3) + "-" + palabra.charAt(4));
                                    
                                } else if (adivina.charAt(1) == palabra.charAt(1) 
                                    && adivina.charAt(2) == palabra.charAt(2)
                                    && adivina.charAt(3) == palabra.charAt(3)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println("-" + palabra.substring(1, 4) + "-");
                                    
                                } else if (adivina.charAt(0) == palabra.charAt(0) 
                                    && adivina.charAt(3) == palabra.charAt(3)
                                    && adivina.charAt(4) == palabra.charAt(4)) {
                                    
                                    intentos++;
                                    System.out.print("Resultado: ");
                                    palabra = palabra.toUpperCase();
                                    System.out.println(palabra.charAt(0) + "--" + palabra.substring(3,5));
                                }
                        }
                    }
                    break;
                }
                case 3:
                {
                    byte empezar_while = 1;
                    while (empezar_while == 1)
                    {

                        System.out.println("Bienvenido a movimiento de pendulo");
                        System.out.print("Ingrese la amplitud del movimiento (en metros): ");
                        int amp = mcok_numero.nextInt();
                        System.out.print("Ingrese cuantos segundo se movera el pendulo (en segundos): ");
                        int seg = mcok_numero.nextInt();

                        int pos_inicial = 0;
                        int cont_pos_inicial = 0;
                        int cont_amp = 0;
                        int cont_seg = 0;

                        if (cont_amp <= amp && cont_amp >= 0)
                        {
                            while (cont_amp <= amp && cont_seg < seg)
                            {
                                cont_amp++;
                                cont_seg++;
                                System.out.println("El pendulo esta a " + cont_amp + " metro/s de la posicion inicial en " + cont_seg + " segundo/s");
                                if (cont_amp == amp && cont_amp >= 0 && cont_seg < seg)
                                {
                                    do
                                    {
                                        cont_amp--;
                                        cont_seg++;
                                        System.out.println("El pendulo esta a " + cont_amp + " metro/s de la posicion inicial en " + cont_seg + " segundo/s");
                                    } while (cont_amp < amp && (cont_amp * -1) < amp);
                                }
                            }
                            System.out.println("");
                            System.out.println("Desea volver a intentar?");
                            System.out.println("1) Si, 2) No");
                            byte continuar = mcok_numero.nextByte();
                            
                            if (continuar == 1) {
                                continue;
                            } else if (continuar == 2) {
                               empezar_while = 2;
                            } else {
                                System.out.println("Opcion invalida");
                                continue;
                            }
                            if (cont_amp == pos_inicial)
                            {
                                cont_pos_inicial++;
                            }
                        }
                    }
                }
            }
        }
    }
}


