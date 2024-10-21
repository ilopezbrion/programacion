import java.util.Scanner;

/**
 * Este programa automatiza un cambio de divisa entre dolares y euros en función seleccione el usuario
 *
 * @author Iván López Brión
 * 14/10/2024
 */
public class Main {
    public static void main(String[] args) { //funcion principal
        double resultado=0;     //declaramos la variable resultado a 0 para inicializarlo
        boolean correcto=false; //declaramos la variable correcto como falso por defecto
        double cantidadecartos;
        int decision;
        do{ //Abrimos un bucle en el que el programa entra de por si para que si no se cumple la condición que queremos todo lo de dentro se vuelva a repetir

            System.out.println("Boas, este programa automatiza un cambio de divisa entre dolares e euros ou biceversa."); //le explicamos al usuario lo que hace el programa y las instrucciones para que funcione
            System.out.println("Se quere sambiar de euros a dolares pulse 1, en caso contrario pulse 2."); //si en funcion a si pulsa 1 o 2 selecciona de que divisa a que otra cambia
            System.out.println("Para recivir unha sorpresa pulse 3"); //si pulsa 3 recive una sorpresa
            Scanner sc= new Scanner(System.in); //Inicializamos y declaramos el scanner para recoger entradas
            decision= sc.nextInt(); //recogemos por teclado la variable decisión
            System.out.println("Por favor agora introduza a cantidade de cartos que procura gastar:"); //Le indicamos al usuario que introduzca la cantidad que quiere cambiar de una divisa a otra
            cantidadecartos= sc.nextDouble(); //Leemos la variable que intica la cantidad de dinero se va a cambiar
            sc.close(); //Cerramos el scanner
            if (cantidadecartos>0){ //si se ha introducido una cantidad de dinero mallor que 0 confirmaremos que correcto es cierto
                correcto = true; //cambiamos el valor de correcto a verdadero
            } else { // si no se cumple la condición
                System.out.println("Por favor introduce un valor con xeito fillo de puta"); //se imprime por pantalla que el valor no tiene sentido
            }

        }while (!correcto); //mientras que correcto sea falso volveremos arriba a donde empieza el bucle (donde el "do")
            switch(decision) { //abrimos un switch para la variable decision
                case 1:     //casi decision=1
                    resultado = (cantidadecartos * 1.11);       //en este caso hacemos que resultado se multiplique por 1,11 para cambiar de euros a dolares

                    break;
                case 2: //caso decision=2
                    resultado = (cantidadecartos * 0.9); //en este caso hacemos que se multiplique por 0.9 para cambiar de dolares a euros
                    break;
                case 3: //si se ha seleccionado que queria una sorpresa
                    System.out.println("Qué coño te esperabas, un sugus? Anda espavila que che vai comer a vida"); //Le preguntamos al usuario que se esperaba
                    break;
                default: //Si no se cumple ninguno de lo scasos entramos directamente aqui
                    System.out.println("hai que ser parvo pa non saber poñer un numero entre 3");
                    break;
            }
            System.out.print("O valor de cambio é = " + resultado); //imprimimos por pantalla el valor de cambio.


    }
}
