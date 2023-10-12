public class CocaCola extends Bebida {
    private int nserie;
    public CocaCola(int nserie) {
        super(nserie);
    }
    @Override
    public String sabor() {
        return super.sabor()+"cocacola";
    }
}