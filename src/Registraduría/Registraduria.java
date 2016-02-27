package Registraduría;
import java.util.Scanner;
/** 
 * @author Emmanuel Vanegas Arias y Mauricio Martinez Estrada
 * @version 1.0
 * @since 27/02/2016
 */
public class Registraduria{
    /**
     * @param args funcion principal del programa, creado con programacion
     * estructurada
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
    
        int num_candidatos=0;
        int num_municipios=0;
        int votos_candidatos[][]=new int[400][400];
        int votos_candidatos2[]=new int[400];
        int l=0;
        
        System.out.print("Ingrese el numero de candidatos (maximo 20): ");
        num_candidatos = sc.nextInt();
        System.out.print("Ingrese el numero de municipios (maximo 20): ");
        num_municipios = sc.nextInt();
        
        for(int i=0;i<num_municipios;i++){                      
            for(int j=0;j<num_candidatos;j++){               
               System.out.print("Ingrese el numero de votos del municipio " + (i+1) + " y del candidato " + (j+1) + ": "); 
               votos_candidatos[i][j] = sc.nextInt();
               votos_candidatos2[l]=votos_candidatos[i][j];
               l++;
            }            
        }
        l=0;
        for(int j=0;j<num_candidatos;j++){
            if(j==0){
                System.out.print("            | ");
            }
            System.out.print("Candidato " + (j+1) + " | "); 
        }
        for(int i=0;i<num_candidatos;i++){
            
            System.out.println(); 
            System.out.print("Municipio " + (i+1) + " |      "); 
            for(int j=0;j<num_municipios;j++){
               //System.out.print("Candidato " + (j+1) + " | ");
               System.out.print(votos_candidatos2[l]+"    |      "); 
               l++;
            }            
        }
        int total_votos=0;
        for(int i=0;i<=l;i++){
            total_votos=(total_votos + votos_candidatos2[i]);            
        }
        System.out.println();
        System.out.println("Total votos: " + total_votos);
        
        int k=0,m=0,n=0,o=0;
        int mayor=0;
        int segundo_mayor=0;        
        int total_candidato[]=new int[25];
        for(int j=0;j<num_candidatos;j++){        
            for(int i=0;i<num_municipios;i++){
                total_candidato[j]=(total_candidato[j] + votos_candidatos[i][j]);
                if(total_candidato[j]>mayor){
                    mayor=total_candidato[j];
                    m=j;                    
                    if(mayor>(total_votos/2)){
                        n=j;
                    }                 
                }
                if(total_candidato[j]>segundo_mayor && total_candidato[j]!=mayor){
                    segundo_mayor=total_candidato[j];
                    o=j;                                   
                }
            }
            System.out.println("Total candidato " + (j+1) + " " + total_candidato[j] + " porcentaje: " + (((100)*(total_candidato[j]))/total_votos));            
        }
        System.out.println("El candidato mas votado es el candidato " + (m+1));
        
        if(mayor>(total_votos/2)){
            System.out.println("El candidato ganador es el candidato" + (n+1));
        }else{
            System.out.println("El candidato con mas votos es" + (m+1));
            System.out.println("El segundo candidato con mas votos es" + (o+1));
        }
        
        sc.next();
    }    
}