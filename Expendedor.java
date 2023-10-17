class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    public Deposito<Moneda> monVu;
    public Deposito<Dulces> snickers;
    public Deposito<Dulces> super8;
    public Expendedor(int numProductos) {
        this.coca = new Deposito<>();
        this.sprite = new Deposito<>();
        this.monVu = new Deposito<>();
        this.snickers= new Deposito<>();
        this.super8 = new Deposito<>();
        this.fanta= new Deposito<>();
        for (int i = 0; i < numProductos; i++) {
            coca.addElemento(new CocaCola(i));
            sprite.addElemento(new Sprite(10+i));
            fanta.addElemento(new Fanta(20+i));
            snickers.addElemento(new Snickers(30+i));
            super8.addElemento(new Super8(40+i));
        }
    }
    public Producto comprarProducto(Moneda moneda,int selector) throws PagoInsuficienteException,PagoIncorrectoException{
        Producto b=null;
        if(moneda==null) {
            throw new PagoIncorrectoException("Error: Pago Incorrecto");
        }
        else {
            switch (selector){
                case 1:
                    b=coca.getElemento();
                    break;
                case 2:
                    b=sprite.getElemento();
                    break;
                case 3:
                    b=fanta.getElemento();
                    break;
                case 4:
                    b=snickers.getElemento();
                    break;
                case 5:
                    b=super8.getElemento();
                    break;
                default:
                    b= null;
                    break;
            }
            if (b == null) {
                monVu.addElemento(moneda);
                return null;
            }
            else {
                if ((b instanceof CocaCola) && (moneda.getValor() < TipoProductos.COCACOLA.getPrecio())) {
                    coca.addElemento((Bebida)b);
                    throw new PagoInsuficienteException("Error:Pago Insuficiente");
                }

                 if ((moneda.getValor() < TipoProductos.SPRITE.getPrecio()) && (b instanceof Sprite)) {
                    sprite.addElemento((Sprite)b);
                     throw new PagoInsuficienteException("Error:Pago Insuficiente");
                }

                else if ((moneda.getValor() < TipoProductos.FANTA.getPrecio()) && (b instanceof Fanta)){
                    fanta.addElemento((Fanta)b);
                     throw new PagoInsuficienteException("Error:Pago Insuficiente");
                }

                else if ((moneda.getValor() < TipoProductos.SNICKER.getPrecio()) && (b instanceof Snickers)){
                    snickers.addElemento((Snickers)b);
                     throw new PagoInsuficienteException("Error:Pago Insuficiente");
                }

                else if ((moneda.getValor() < TipoProductos.SUPER8.getPrecio()) && (b instanceof Super8)){
                    super8.addElemento((Super8)b);
                     throw new PagoInsuficienteException("Error:Pago Insuficiente");
                }

                else {
                    if(selector==1) {
                        for (int i = 0; i < (moneda.getValor() - TipoProductos.COCACOLA.getPrecio()) / 100; i++) {
                            monVu.addElemento(new Moneda100());
                        }
                        return b;
                    }
                    else if(selector==2) {
                        for (int i = 0; i < (moneda.getValor() - TipoProductos.SPRITE.getPrecio()) / 100; i++) {
                            monVu.addElemento(new Moneda100());
                        }
                        return b;
                    }
                    else if(selector==3) {
                        for (int i = 0; i < (moneda.getValor() - TipoProductos.FANTA.getPrecio()) / 100; i++) {
                            monVu.addElemento(new Moneda100());
                        }
                        return b;
                    }
                    else if(selector==4) {
                        for (int i = 0; i < (moneda.getValor() - TipoProductos.SNICKER.getPrecio()) / 100; i++) {
                            monVu.addElemento(new Moneda100());
                        }
                        return b;
                    }
                    else{
                        for (int i = 0; i < (moneda.getValor() - TipoProductos.SUPER8.getPrecio()) / 100; i++) {
                            monVu.addElemento(new Moneda100());
                        }
                        return b;
                    }
                }
            }
        }
    }
    public Moneda getVuelto(){
        return monVu.getElemento();
    }
}