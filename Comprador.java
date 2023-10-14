class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m,int cualProducto,Expendedor exp)throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Producto b = exp.comprarProducto(m, cualProducto);
        if(b==null){
            throw new NoHayProductoException("No hay producto deseado en la maquina");
        }
        if(m==null){
            throw new PagoIncorrectoException("No ingresaste una moneda valida");
        }
        else{
            sonido=b.sabor();
            vuelto=0;
            while(exp.getVuelto()!=null){
                vuelto+=100;
            }
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}
