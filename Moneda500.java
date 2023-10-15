class Moneda500 extends Moneda implements Comparable<Moneda>{
    public Moneda500(){
        super();
    }
    public int getValor() {
        return 500;
    }

    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(),otraMoneda.getValor());
    }
}