import java.util.ArrayList;
import java.util.List;

class DepositoM<T extends Moneda>{
    private List<T>depositomonedas;
    public DepositoM(){
        depositomonedas = new ArrayList<>();
    }
    public Moneda addMoneda(T moneda){
        depositomonedas.add(moneda);
        return moneda;
    }
    public Moneda getMoneda(){
        if(depositomonedas.size()==0){
            return null;
        }
        else{
            return depositomonedas.remove(0);
        }
    }

}