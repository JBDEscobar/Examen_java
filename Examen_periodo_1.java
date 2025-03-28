import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Examen_periodo_1 {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("[1]x+3x");
        System.out.println("[2]2x-5");
        System.out.println("[3]2/x+x^2");
        System.out.println("[4]x+2x+3x");
        System.out.print(" cual quieres ? :  ");
        int opciones = menu.nextInt();

        switch (opciones) {
            case 1:
            System.out.println("Valor de x:  ");
            opciones = menu.nextInt();
            int respuesta1 = opciones*3+opciones;
            System.out.println("Respuesta:  "+respuesta1);

                
                break;
                case 2:
                System.out.println("Valor de x:  ");
                 opciones = menu.nextInt();
                 double respuesta2 = opciones*2-5;
                 System.out.println("Respuesta:  "+respuesta2);
            

                
                break;
                case 3:
                System.out.println("Valor de x:  ");
                 opciones = menu.nextInt();
                 double respuesta3 = (opciones/2)+opciones*2;
                 System.out.println("Respuesta:  "+respuesta3);

                
                break;
                case 4:
                System.out.println("Valor de x:  ");
                 opciones = menu.nextInt();
                 double respuesta4 = (opciones*2+opciones*3)+opciones;
                 System.out.println("Respuesta:  "+respuesta4);

                
                break;
                
                
                
                
                
        
            default:
                break;
        }
        // Le puse un switch mas que todo para mantener un orden y que se  vea ordenado
        
        System.out.println("___---------------------------------");
                
                

                
                do {
                    System.out.println("[1]Calcular Promedio");
                System.out.println("[2]Saludar por tu nombre");
                System.out.println("[3]Di hola mundo");
                System.out.print("[4]salir:  ");
                opciones = menu.nextInt();

                    switch (opciones) {
                        case 1:
                        System.out.print("Promedio: ");
                        opciones = menu.nextInt();
                        double resultado = (opciones+opciones)/opciones;
                        System.out.println("resultado:  "+resultado);

                            
                            break;
                            case 2:
                            opciones = menu.nextInt();

                           
                             
                            System.out.println("Hola Rockema" + opciones); 


                            break;
                            case 3:
                            System.out.println("Hola Mundo");
                            break;
                            case 4: 
                            System.out.println("Salir");
                            break;

                    
                        default:
                            break;
                    }
                    
                } while (opciones != 4);

             


              
    }

}


    