import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> deposito;
    public Deposito(){
        deposito = new ArrayList<Bebida>();
    }
    public Bebida addBebida(Bebida bebida){
        deposito.add(bebida);
        return bebida;
    }
    public Bebida getBebida(){
        if(deposito.size()==0){
            return null;
        }
        else{
            return deposito.remove(0);
        }
    }
}
