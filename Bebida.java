abstract class Bebida{
    private int nserie;
    public Bebida(int nserie){
        this.nserie=nserie;
    }
    public int getSerie(){
        return nserie;
    }
    public abstract String beber();
}