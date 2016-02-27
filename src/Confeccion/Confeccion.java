/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 **/
package Confeccion;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Confeccion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long codigo[] = new long[50];
        String descripcion[] = new String[50];
        int precio[] = new int[50];
        int productos=0;
        int ventas=0;
        
        String vendedor_nombre[]=new String[50];
        long vendedor_id[]=new long[50];
        int vendedor_mas_venta=0;
        
        int cantidad[]=new int[50];
        int pago[]=new int[50];
        
        String fecha[]=new String[50];
        
        int venta_codigo[]=new int[50];
        int venta_cantidad[]=new int[50];
        int venta_pago[]=new int[50];
        int venta_mayor_cantidad=0;
        
        long precio_final[]=new long[50];
        
        System.out.println("Cuantos productos va a ingresar? "); 
        productos = sc.nextInt();
        for(int i=0;productos>i;i++){
            System.out.println("Ingrese datos de los productos. ");        
            System.out.print("Ingrese el codigo del producto: ");
            codigo[i] = sc.nextLong();
            System.out.print("Ingrese la descripcion del producto: ");
            descripcion[i] = sc.next();
            System.out.print("Ingrese el precio unitario del producto: ");
            precio[i] = sc.nextInt();
        }
        System.out.println("Cuantos ventas va a ingresar? "); 
        ventas = sc.nextInt();
        for(int i=0;i<ventas;i++){
            System.out.println("Ingrese la fecha (dia mes año hora) ");
            fecha[i] = sc.next();
            System.out.println("Ingrese el id del vendedor ");
            vendedor_id[i] = sc.nextLong();
            System.out.println("Ingrese el nombre del vendedor (id nombre apellido)");
            vendedor_nombre[i] = sc.next();
            System.out.println("Ingrese el codigo del producto ");
            venta_codigo[i] = sc.nextInt();
            System.out.println("Ingrese la cantidad del producto ");
            venta_cantidad[i] = sc.nextInt();
            System.out.println("Ingrese la forma de pago (Efectivo (0), Tarjeta de debito (1) o Tajeta de credito (2)");
            venta_pago[i] = sc.nextInt();
        }
        
       for(int i=0;i<ventas;i++){           
           if(venta_cantidad[i]>venta_mayor_cantidad){
               venta_mayor_cantidad=venta_cantidad[i];
               vendedor_mas_venta=i;
           }
       }
       System.out.println("El vendedor con mayor cantidad de ventas es " + vendedor_nombre[vendedor_mas_venta] + " con el id " + vendedor_id[vendedor_mas_venta]);
       
       for(int i=0;i<ventas;i++){
           if(venta_pago[i]==1){
               precio_final[i]=(precio[i]*venta_cantidad[i]);
               System.out.println("Precio final: " + precio_final[i] + " Id del vendedor " + vendedor_id[i]);
               
           }
       }
       System.out.println("Ingrese el id del vendedor");
           
       System.out.println("Ingrese el codigo de producto que desea conocer ");
       
       int id_vendedor=0;
       int codigo_producto=0;
       
       for(int i=0;i<ventas;i++){           
           if(id_vendedor==vendedor_id[i]){
               if(codigo_producto==venta_codigo[i]){
                   System.out.print("El vendedor fue " + vendedor_nombre[i]);
                   System.out.print("El id del vendedor es " + vendedor_id[i]);
                   System.out.print("La fecha de la venta fue " + fecha[i]);
                   System.out.print("El vendedor fue " + vendedor_nombre[i]);
                   precio_final[i]=(precio[i]*venta_cantidad[i]);
                   System.out.println("Precio final: " + precio_final[i]);
                   System.out.println("cantidad del producto" + venta_cantidad[i]);
                   System.out.println("Forma de pago: " + venta_pago[i]);
               }else{
                   System.out.println("El vendedor no vendio ese producto ");         
               }
           }else{
               System.out.println("Id no correspode a ningun vendedor");           
           }
       }
       
       long venta_total=0;
       for(int i=0;i<ventas;i++){  
           precio_final[i]=(precio[i]*venta_cantidad[i]);
           venta_total=(venta_total+precio_final[i]);
       }
       System.out.println("El monto total es de " + venta_total);
       
       long mayor=0;
       int posicion=0;
       for(int i=0;i<ventas;i++){
           precio_final[i]=(precio[i]*venta_cantidad[i]);
           if(venta_pago[i]==2){
               if(precio_final[i]>mayor){
                   mayor=precio_final[i];
                   posicion=i;
               }
           }
       }
       System.out.print("El vendedor fue " + vendedor_nombre[posicion]);
       System.out.print(". El id del vendedor es " + vendedor_id[posicion]);
       System.out.print(". La fecha de la venta fue " + fecha[posicion]);
       System.out.println(". El vendedor fue " + vendedor_nombre[posicion]);
       System.out.println("Precio final: " + precio_final[posicion]);
       System.out.println("Cantidad del producto" + venta_cantidad[posicion]);
       System.out.println("Forma de pago: " + venta_pago[posicion]);       
        
        sc.next();        
    }    
}