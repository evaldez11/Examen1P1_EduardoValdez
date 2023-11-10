/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_eduardovaldez;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guali
 */
public class Examen1P1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        
        System.out.println("**********Menu**********\n1. Fight or Flight\n2. Tri Fuerza\n3. Salir del programa\n Ingrese una opcion: ");
        int opcion = leer.nextInt();
        System.out.println("");
        
        while (opcion>0 && opcion<3){
            
            switch (opcion){
                case 1:
                    fight();
                    break;
                case 2:
                    Trifuerza();
                    break;
                case 3:
                    System.out.println("Salio del programa");
                default:
                    System.out.println("Opcion no valida");
                    break;
            }//fin del switch
        System.out.println("**********Menu**********\n1. Fight or Flight\n2. Tri Fuerza\n3. Salir del programa\n Ingrese una opcion: ");
        opcion = leer.nextInt();
        System.out.println("");            
            
        }//fin del while

    }//fin del main
    
    public static void fight(){
        Random rand = new Random();
        System.out.println("**********Fight or Flight**********\nIngrese maestria\n1. Prinicpiante (0% de hit extra + extra damage)\n2. Intermedio (5% de hit extra + extra damage)\n3. Experto (15% de hit extra + extra damage)");
        int maestria = leer.nextInt();
        
        switch (maestria){
            case 1: 
                int metros = rand.nextInt(16)+15;
                int balas = 25;
                int vida = 25;
                while (balas>0 && metros>0&&vida>0){
                    char resp = 's';
                    while (resp == 's'||resp=='S'){
                    int probabilidad = rand.nextInt(101);
                    System.out.println("El zombie se encuentra a: "+metros+" metros!");
                    System.out.println("El jugador cuenta con "+balas+" balas!");
                    System.out.println("");

                    if(probabilidad<=65){
                        int aleatorio = rand.nextInt(6)+1;
                        int daño = aleatorio;
                        balas = balas-1;
                        vida = vida-daño;
                        metros= metros-0;
                        if (metros<0){
                            metros = 0;
                        }else if (vida<0){
                            vida=0;
                        }else if (balas<0){
                            balas=0;
                        }
                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+daño+"!");
                        System.out.println("");
                        System.out.println("Vida restante del zombie: "+vida);
                        System.out.println("El zombie se encuentra a: "+metros+" metros");
                        System.out.println("");

                    }else{
                        metros=metros-5;
                        balas = balas-1;
                        if (metros<0){
                            metros = 0;
                        }else if (vida<0){
                            vida=0;
                        }else if (balas<0){
                            balas=0;
                        }
                        System.out.println("Ha fallado! El zombie se encuentra a: "+metros+" metros");
                        System.out.println("");
                    }
                    if(vida<=0||metros<=0||balas<=0){
                        resp = 'n'; 
                    }else{
                       System.out.println("Listo para otra ronda? [S/N] ");
                        resp = leer.next().charAt(0);
                        System.out.println("");
                        System.out.println("************************");
                    }
                    }//fin while interno
                    if (vida<=0){
                        System.out.println("YOU WIN! Has logrado vencer al zombie!");
                    }else if(metros<=0){
                        System.out.println("GAME OVER! La Distancia se redujo a 0!");
                    }else if(balas<=0){
                        System.out.println("GAME OVER! Te quedaste sin balas!");
                    }
                }//fin while
                break;
            case 2:
                metros = rand.nextInt(16)+15;
                balas = 25;
                vida = 25;
                while (balas>0 && metros>0&&vida>0){
                    char resp = 's';
                    while (resp == 's'||resp=='S'){
                    int probabilidad = rand.nextInt(101);
                    System.out.println("El zombie se encuentra a: "+metros+" metros!");
                    System.out.println("El jugador cuenta con "+balas+" balas!");
                    System.out.println("");

                    if(probabilidad<=70){
                        int aleatorio = rand.nextInt(6)+1;
                        int daño = aleatorio;
                        balas = balas-1;
                        vida = vida-daño;
                        metros= metros-0;
                        if (metros<0){
                            metros = 0;
                        }else if (vida<0){
                            vida=0;
                        }else if (balas<0){
                            balas=0;
                        }
                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+daño+"!");
                        System.out.println("");
                        System.out.println("Vida restante del zombie: "+vida);
                        System.out.println("El zombie se encuentra a: "+metros+" metros");
                        System.out.println("");

                    }else{
                        metros=metros-5;
                        balas = balas-1;
                        if (metros<0){
                            metros = 0;
                        }else if (vida<0){
                            vida=0;
                        }else if (balas<0){
                            balas=0;
                        }
                        System.out.println("Ha fallado! El zombie se encuentra a: "+metros+" metros");
                        System.out.println("");
                    }
                    if(vida<=0||metros<=0||balas<=0){
                        resp = 'n'; 
                    }else{
                       System.out.println("Listo para otra ronda? [S/N] ");
                        resp = leer.next().charAt(0);
                        System.out.println("");
                        System.out.println("************************");
                    }
                    }//fin while interno
                    if (vida<=0){
                        System.out.println("YOU WIN! Has logrado vencer al zombie!");
                    }else if(metros<=0){
                        System.out.println("GAME OVER! La Distancia se redujo a 0!");
                    }else if(balas<=0){
                        System.out.println("GAME OVER! Te quedaste sin balas!");
                    }
                }//fin while
                break;
            case 3:
                metros = rand.nextInt(16)+15;
                balas = 25;
                vida = 25;
                while (balas>0 && metros>0&&vida>0){
                    char resp = 's';
                    while (resp == 's'||resp=='S'){
                    int probabilidad = rand.nextInt(101);
                    System.out.println("El zombie se encuentra a: "+metros+" metros!");
                    System.out.println("El jugador cuenta con "+balas+" balas!");
                    System.out.println("");

                    if(probabilidad<=80){
                        int aleatorio = rand.nextInt(6)+1;
                        int daño = aleatorio;
                        balas = balas-1;
                        vida = vida-daño;
                        metros= metros-0;
                        if (metros<0){
                            metros = 0;
                        }else if (vida<0){
                            vida=0;
                        }else if (balas<0){
                            balas=0;
                        }
                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: "+daño+"!");
                        System.out.println("");
                        System.out.println("Vida restante del zombie: "+vida);
                        System.out.println("El zombie se encuentra a: "+metros+" metros");
                        System.out.println("");

                    }else{
                        metros=metros-5;
                        balas = balas-1;
                        if (metros<0){
                            metros = 0;
                        }else if (vida<0){
                            vida=0;
                        }else if (balas<0){
                            balas=0;
                        }
                        System.out.println("Ha fallado! El zombie se encuentra a: "+metros+" metros");
                        System.out.println("");
                    }
                    if(vida<=0||metros<=0||balas<=0){
                        resp = 'n'; 
                    }else{
                       System.out.println("Listo para otra ronda? [S/N] ");
                        resp = leer.next().charAt(0);
                        System.out.println("");
                        System.out.println("************************");
                    }
                    }//fin while interno
                    if (vida<=0){
                        System.out.println("YOU WIN! Has logrado vencer al zombie!");
                    }else if(metros<=0){
                        System.out.println("GAME OVER! La Distancia se redujo a 0!");
                    }else if(balas<=0){
                        System.out.println("GAME OVER! Te quedaste sin balas!");
                    }
                }//fin while
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }//fin switch interno
        
    }//fin fight
    
    public static void Trifuerza(){
        System.out.println("Ingrese un tamaño: ");
        int tamaño = leer.nextInt();
        if(tamaño>=20 && tamaño % 2 ==0){
        for (int i = 0; i < tamaño/2; i++) {
            for (int j = tamaño/2 - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
        for (int i = 0; i < tamaño/2; i++) {
            for (int j = tamaño - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i*2; k++) {
                System.out.print("*");
            }

            System.out.println(); 
        }
    }else{
            System.out.println("El tamaño debe de ser par y mayor que 20");
        }
        System.out.println("");
}//fin tri fuerza
}// fin de la clase
    






