public class Pila<Y>{
    private Y[] pila;
    private int tope;

    public Pila(){
        pila=(Y[])new Object[10];
        tope=-1;
    }

    public boolean pilaLlena(){
        return pila.length<=tope;
    }

    public void push(Y dato){
        if(!pilaLlena()){
            tope++;
            pila[tope]=dato;
        }
    }

    public boolean pilaVacia(){
        return tope==-1;
    }

    public Y pop(){
        if(!pilaVacia()){
            Y temp=pila[tope];
            tope--;
            return temp;
        }else{
            return null;
        }
    }
}
