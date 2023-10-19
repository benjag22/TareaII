class Moneda1500 extends Moneda implements Comparable<Moneda> {
    public Moneda1500(){
        super();
    }
    public int getValor(){
        return 1500;
    }

    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
    @Override
    public String toString() {
        return "Numero de serie: " + super.toString() + ", Su valor es: " + getValor();
    }
}