public class Fanta extends Bebida{
    private int nserie;
    public Fanta(int nserie){
        super(nserie);
    }
    @Override
    public String sabor() {
        return super.sabor()+"fanta";
    }
}
