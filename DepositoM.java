import java.util.ArrayList;

class DepositoM{
    private ArrayList<Moneda> depositomonedas;
    public DepositoM(){
        depositomonedas = new ArrayList<Moneda>();
    }
    public Moneda addMoneda(Moneda moneda){
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