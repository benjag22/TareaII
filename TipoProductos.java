public enum TipoProductos {
    COCACOLA(600),
    SPRITE(500),
    FANTA(700),
    SNICKER(200),
    SUPER8(300);
    private int precio;
    TipoProductos(int precio){
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }
}
