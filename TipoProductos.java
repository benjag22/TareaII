public enum TipoProductos {
    COCACOLA(100),
    SPRITE(500),
    FANTA(600),
    SNICKER(200),
    SUPER8(100);
    private int precio;
    TipoProductos(int precio){
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }
}
