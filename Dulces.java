abstract class Dulces implements Producto{
    private int nserie;
    public Dulces(int nserie){
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
