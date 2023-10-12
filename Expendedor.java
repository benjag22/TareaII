class Expendedor {
    public static final int COCA=1;
    public static final int SPRITE=2;
    private Deposito coca;
    private Deposito sprite;
    public DepositoM monVu;
    private int precioBebidas;

    public Expendedor(int numBebibas,int precioBebidas) {
        this.precioBebidas = precioBebidas;
        this.coca = new Deposito();
        this.sprite = new Deposito();
        this.monVu = new DepositoM();
        for (int i = 0; i < numBebibas; i++) {
            Bebida b1 = new CocaCola(i);
            Bebida b2 = new Sprite(i);

            coca.addBebida(b1);
            sprite.addBebida(b2);
        }
    }
    public Bebida comprarBebida(Moneda moneda,int selector){
        Bebida b;
        if(moneda==null) {
            return null;
        }
        else {
            switch (selector){
                case 1:
                    b=coca.getBebida();
                    break;
                case 2:
                    b=sprite.getBebida();
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
                if (moneda.getValor() < precioBebidas) {
                    monVu.addMoneda(moneda);
                    if(b==coca.getBebida())
                        coca.addBebida(b);
                    else{
                        sprite.addBebida(b);
                    }
                    return null;
                }
                else{
                    for (int i = 0; i < (moneda.getValor() - precioBebidas) / 100; i++) {
                        monVu.addMoneda(new Moneda100());
                    }
                    return b;
                }
            }
        }
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}