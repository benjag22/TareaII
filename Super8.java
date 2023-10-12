public class Super8 extends Dulces{
    private int nserie;
    public Super8(int nserie){
        super(nserie);
    }
    @Override
    public String sabor() {
        return super.sabor()+"super8";
    }
}