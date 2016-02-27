package Avion;
import java.util.Scanner;

/**
 * @author Emmanuel Vanegas Arias y Mauricio Martinez Estrada
 * @since 24/02/2016
 * @version 1.0
 */
public class avion {
        static Scanner sc = new Scanner(System.in);
        
        static long cedula[] = new long[50];
        static long cedula2 ;
        static String nombre[] = new String[50];
        static int clase[] = new int[50];
        static int ubicacion[] = new int[50];
        
        static int num_silla_ec = 42;
        static int num_silla_ej = 8;
        static int num_silla_ec_v = 14;
        static int num_silla_ec_c = 14;
        static int num_silla_ec_p = 14;
        static int num_silla_ej_v = 4;
        static int num_silla_ej_p = 4;
        
        static int silla[] = new int[50];
        static int j=0,k=0,l=0,m=0,n=0,o=0,p=0;

    /**
     * @param args función principal donde se lleva a cabo el proceso de seleccion
     * de sillas de los compradores de un boleto. Se declaran todos los arreglos.
     * El usuario puede saber el numero de sillas disponibles de cada clase y de
     * cada clase y ubicación.
     */
    public static void main(String[] args) {
                
       while(true){
           System.out.println("Digite (1) si desea saber el numero de sillas ejectivas disponibles,"
                + " (2) si desea saber que silla le corresponde, (3) para cancelar un tiquete, "
                + "(4) para saber si dos nombres de pasajeros se repiten o (5) para un nuevo cliente");
        switch(sc.nextInt()){
            case 1:sillas_ej();break;
            case 2:System.out.println("Digite su cedula: ");getSilla(sc.nextLong());break;
            case 3:System.out.println("Digite su cedula: ");cancelar(sc.nextLong());break;
            case 4:nom_iguales();break;
            case 5:break;
        }
        
        for(int i = 0; i < 50; i++){
            System.out.print("[" + (i+1) + "] Digite su cedula: ");
            cedula[i] = sc.nextLong();
            
            System.out.print("Digite su nombre: ");
            nombre[i] = sc.next();
           
            System.out.println("Sillas disponibles en clase económica: " + (num_silla_ec-o));
            System.out.println("Sillas disponibles en clase ejecutiva: " + (num_silla_ej-p));
            System.out.print("Digite (1) si desea viajar en clase economica o (2) en ejecutiva: ");
            clase[i] = sc.nextInt();
            
            if(clase[i] == 1){
                o++;
                System.out.println("Sillas disponibles en ventana: " + (num_silla_ec_v-j));
                System.out.println("Sillas disponibles en centro: " + (num_silla_ec_c-k));
                System.out.println("Sillas disponibles en pasillo: " + (num_silla_ec_p-l));
                System.out.print("Digite (1), (2) o (3); si desea viajar en la ventana, centro o pasillo respectivamente: ");
                ubicacion[i] = sc.nextInt();
                if(ubicacion[i]==1 && j<14){
                    silla[i]=j;
                    j++;
                }
                if(ubicacion[i]==2 && k<14){
                    silla[i]=k;
                    k++;
                }
                if(ubicacion[i]==3 && l<14){
                    silla[i]=l;
                    l++;
                }

            } else {
                p++;
                System.out.println("Sillas disponibles en ventana: " + (num_silla_ej_v-m));
                System.out.println("Sillas disponibles en pasillo: " + (num_silla_ej_p-n));
                System.out.print("Digite (1) o (3); si desea viajar en la ventana o pasillo respectivamente: ");
                ubicacion[i] = sc.nextInt();
                if(ubicacion[i]==1 && m<4){
                    silla[i]=j;
                    m++;
                }
                if(ubicacion[i]==3 && m<4){
                    silla[i]=j;
                    n++;
                }
            }                      
        }
        System.out.println("Digite cedula para conocer informacion: ");
        cedula2 = sc.nextLong();
        for(int i=0;i<50;i++){
            if(cedula2==cedula[i]){
                System.out.println("El pasajero es: " + nombre[i]);
                System.out.println("Numero de cedula: " + cedula[i]);
                if(clase[i]==1){
                    System.out.println("Sentado en clase economica ");
                    if(ubicacion[i]==1)
                        System.out.println("Sentado en el ventana " + (j));
                    if(ubicacion[i]==2)
                        System.out.println("Sentado en el centro " + (k));
                    if(ubicacion[i]==3)
                        System.out.println("Sentado en el pasillo numero " + (l));
                }
                
                if(clase[i]==2){
                    System.out.println("Sentado en clase ejecutiva ");
                    if(ubicacion[i]==1)
                        System.out.println("Sentado en la ventana " + (m));
                    if(ubicacion[i]==3)
                        System.out.println("Sentado en el pasillo " + (n));
                }
                
            }
            
        }
        sc.next();
    }
    }
    
    /**
     * Funcion que imprime el numero de sillas ejecutivas ocupadas
     */
    static void sillas_ej(){
        System.out.println("Hay: " + p + "sillas ejecutivas ocupadas");
    }
    
    /**
     * @param cedul función que a partir de la cedula imprime la especificación de la silla que le corresponde al usuario
     */
    static void getSilla(long cedul){
        int k = 0;
        while(cedula[k] != cedul)
            k++;
        if(clase[k] == 1) System.out.println("Clase económica, ");
        else System.out.println("Clase ejecutiva, ");
        if(ubicacion[k] == 1)System.out.println("ventana, ");
        else if(ubicacion[k] == 2)System.out.println("centro, ");
        else System.out.println("pasillo, ");
        System.out.println("silla: " + silla[k]);
    }
    
    /**
     * @param cedul funcion que a partir de la cedula cancela la reserva asociada
     * a dicha ella
     */
    static void cancelar(long cedul){
        int x = 0;
        while(cedula[x] != cedul)
            x++;
        clase[x] = 0;
        ubicacion[x] = 0;
        silla[x] = 0;
        nombre[x] = "";
        cedula[x] = 0;
        System.out.println("El registro se ha eliminado");
    }
   
    /**
     * Función que busca si dos clientes tienen el mismo nombre
     */
    static void  nom_iguales(){
        for(int i=0; i<50; i++)
            for(int j=0; j<50; j++)
                if(nombre[i].equals(nombre[j]))
                    System.out.println("Existen dos usuarios llamados: " + nombre[i]);
    }   
}