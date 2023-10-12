public class Sprite extends Bebida{
    private int nserie;
    public Sprite(int nserie){
        super(nserie);
    }
    @Override
    public String sabor() {
        return super.sabor()+"sprite";
    }
}
