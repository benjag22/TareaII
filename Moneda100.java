class Moneda100 extends Moneda implements Comparable<Moneda>{
    public Moneda100(){
        super();
    }
    public int getValor() {
        return 100;
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