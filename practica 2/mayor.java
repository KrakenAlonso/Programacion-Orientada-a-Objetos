import java.util.Scanner;

public class mayor{
    
    public static void main(String[] args){
        Scanner entradas = new Scanner(System.in);
        int i;
        int mayor = 0;
        int numero;
        for(i = 0; i < 10; i++){
            System.out.println("Ingresa el numero:  " + i);
            numero = entradas.nextInt();
            if(numero > mayor){
                mayor = numero;
            }
            else{
                continue;
            }

        }
        System.out.println("El numero mayor es:  " + mayor);
        
        entradas.close();
    }
}