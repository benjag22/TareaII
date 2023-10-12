public class Snickers extends Dulces{
    private int nserie;
    public Snickers(int nserie){
        super(nserie);
    }
    @Override
    public String sabor() {
        return super.sabor()+"snicker";
    }
}
