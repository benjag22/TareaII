class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m,int cualProducto,Expendedor exp) {
        Producto b = exp.comprarBebida(m, cualProducto);
        if(b==null){
            sonido=null;
            if(m==null){
                vuelto =0;
            }
            else{
                vuelto = exp.getVuelto().getValor();
            }
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
