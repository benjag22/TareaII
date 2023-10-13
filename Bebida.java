abstract class Bebida implements Producto{
    private int nserie;
    public Bebida(int nserie){
        this.nserie=nserie;
    }
    @Override
    public int getSerie() {
        return nserie;
    }

    @Override
    public String sabor() {
        return "Sabor a: ";
    }
}