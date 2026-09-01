import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PruebaPila{

    public String invierteCadena(String cadena){
        Pila<String> pilaCadena=new Pila<String>();
        String nuevaCadena="";

        for(int i=0;i<cadena.length();i++){
            pilaCadena.push(String.valueOf(cadena.charAt(i)));
        }

        while(!pilaCadena.pilaVacia()){
            nuevaCadena+=pilaCadena.pop();
        }

        return nuevaCadena;
    }

    public boolean revisarSintaxis(String cadena){
        Pila<Character> pilaCadena=new Pila<>();
        int verifica=0;
        for(int i=0;i<cadena.length();i++){
            switch(cadena.charAt(i)){
                case ')':
                    if(!pilaCadena.pilaVacia() && pilaCadena.pop()==cadena.charAt(i)-1){
                         verifica++;
                    }else{
                        return false;
                    }
                    break;
                case ']','}':
                    if(!pilaCadena.pilaVacia() && pilaCadena.pop()==cadena.charAt(i)-2){
                        verifica++;
                    }else{
                        return false;
                    }
                    break;
                case '(','[','{':
                    if(!pilaCadena.pilaLlena()){
                        pilaCadena.push(cadena.charAt(i));
                    }
                    break;
            }
        }
        return verifica >= 3;
    }

    public Pila<Integer> ordenarNumsPila(int[] cadenaNums){
        Pila<Integer> pila1=new Pila<>();
        Pila<Integer> pila2=new Pila<>();
        for (int num:cadenaNums){
            pila1.push(num);
        }
        pila2.push(pila1.pop());
        while(!pila1.pilaVacia()){
            int tempPila1=pila1.pop();
            int tempPila2=pila2.pop();
            pila2.push(tempPila2);
            while (!pila2.pilaVacia() && tempPila1>tempPila2){
                pila1.push(pila2.pop());
                if(!pila2.pilaVacia()){
                    tempPila2=pila2.pop();
                    pila2.push(tempPila2);
                }
            }
            pila2.push(tempPila1);

        }
        //Unicamente para ver que el contenido esté bien
        while(!pila2.pilaVacia()){
            int numTemp=pila2.pop();
            pila1.push(numTemp);
            System.out.print(numTemp+" ");
        }
        while(!pila1.pilaVacia()){
            pila2.push(pila1.pop());
        }
        return pila2;
    }
}