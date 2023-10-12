class Expendedor {
    public static final int COCA=1;
    public static final int SPRITE=2;
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    public DepositoM<Moneda> monVu;
    public Deposito<Dulces> snickers;
    public Deposito<Dulces> super8;
    private int precioBebidas;
    private int precioDulces;

    public Expendedor(int numBebibas,int precioBebidas,int numDulces,int precioDulces) {
        this.precioBebidas = precioBebidas;
        this.coca = new Deposito<>();
        this.sprite = new Deposito<>();
        this.monVu = new DepositoM<>();
        this.snickers= new Deposito<>();
        this.super8 = new Deposito<>();
        for (int i = 0; i < numBebibas; i++) {
            Bebida b1 = new CocaCola(i);
            Bebida b2 = new Sprite(i);
            Bebida b3 = new Fanta(i);

            coca.addProducto(b1);
            sprite.addProducto(b2);
            fanta.addProducto(b3);
        }
        for(int i=0; i<numDulces;i++){
            Dulces d1 = new Snickers(i);
            Dulces d2 = new Super8(i);
            snickers.addProducto(d1);
            super8.addProducto(d2);
        }
    }
    public Producto comprarBebida(Moneda moneda,int selector){
        Producto b;
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
                if ((moneda.getValor() < precioBebidas) || (moneda.getValor()<precioDulces)) {
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