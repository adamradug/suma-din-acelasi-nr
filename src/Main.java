
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int citire, contor=1, catulFinal=0;
        int catul, restul, restul2=0, catul2=0, suma = 0;


        Scanner obiect = new Scanner(System.in);

        System.out.println("Introduceti numere de la tastatura. Aplicatia se opreste apasand cifra zero");

       do {

           citire = obiect.nextInt();

        restul = citire % 10;

        System.out.println("Restul este= " +restul);

           catul = citire / 10;

           System.out.println("Catul este= " +catul);

           if ( catul <= 0){
               restul = 0;

               catul = 0;
           }


           else if (catul > 0) {

               if ( catul / 10 <= 0){
                   catulFinal = catul;
               }

               else {

                   for (int i = 0; i <= contor; i++) {

                       catul = catul / 10;

                       contor = catul;

                      // System.out.println(" Afisare rest din for= " + restul);

                       if (catul < 10) {
                           catulFinal = catul;
                           contor = 0;
                       }else{
                           catulFinal = catul;
                       }
                   }
               }

                    //System.out.println("Contor= " + contor);

            }

//            else {
//
//                suma = suma;
//            }

            suma = suma + restul+ catulFinal;


        System.out.println("Suma = " + suma);
           System.out.println("");

       } while( citire != 0);

        System.out.println("Suma finala= " + suma);

    }
}
