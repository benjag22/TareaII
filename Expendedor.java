class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    public DepositoM<Moneda> monVu;
    public Deposito<Dulces> snickers;
    public Deposito<Dulces> super8;
    public Expendedor(int numBebibas,int numDulces) {
        this.coca = new Deposito<>();
        this.sprite = new Deposito<>();
        this.monVu = new DepositoM<>();
        this.snickers= new Deposito<>();
        this.super8 = new Deposito<>();
        for (int i = 0; i < numBebibas; i++) {
            coca.addProducto(new CocaCola(i));
            sprite.addProducto(new Sprite(10+i));
            fanta.addProducto(new Fanta(20+i));
        }
        for(int i=0; i<numDulces;i++){
            snickers.addProducto(new Snickers(30+i));
            super8.addProducto(new Super8(40+i));
        }
    }
    public Producto comprarProducto(Moneda moneda,int selector){
        Producto b=null;
        if(moneda==null) {
            return null;
        }
        else {
            switch (selector){
                case 1:
                    b=coca.getProducto();
                    break;
                case 2:
                    b=sprite.getProducto();
                    break;
                case 3:
                    b=fanta.getProducto();
                    break;
                case 4:
                    b=snickers.getProducto();
                    break;
                case 5:
                    b=super8.getProducto();
                    break;
                default:
                    b= null;
                    break;
            }
            if (b == null) {
                monVu.addMoneda(moneda);
                return null;
            }
            else {
                if ((moneda.getValor() < TipoProductos.COCACOLA.getPrecio()) || (moneda.getValor()<precioDulces)) {
                    monVu.addMoneda(moneda);
                    if(b==coca.getProducto()) {
                        coca.addProducto((CocaCola)b);
                    }
                    else if(b==sprite.getProducto()){
                        sprite.addProducto((Sprite)b);
                    }
                    else if(b==fanta.getProducto()){
                        fanta.addProducto((Fanta)b);
                    }
                    else if(b==snickers.getProducto()){
                        snickers.addProducto((Snickers)b);
                    }
                    else if(b==super8.getProducto()){
                        super8.addProducto((Super8)b);
                    }
                    return null;
                }
                else{
                    if(selector==1||selector==2||selector==3) {
                        for (int i = 0; i < (moneda.getValor() - precioBebidas) / 100; i++) {
                            monVu.addMoneda(new Moneda100());
                        }
                        return b;
                    }
                    else{
                        for (int i = 0; i < (moneda.getValor() - precioDulces) / 100; i++) {
                            monVu.addMoneda(new Moneda100());
                        }
                        return b;
                    }
                }
            }
        }
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}