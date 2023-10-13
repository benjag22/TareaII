
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2);
        Moneda m;
        Comprador c;
        //compra exitosa para cada producto//
        m = new Moneda1000();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,4,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,5,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        //deberia ser PagoIncorrectoException(aun no lo es)//
        m=null;
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m=null;
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m=null;
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m=null;
        c = new Comprador(m,4,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m=null;
        c = new Comprador(m,5,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        //*deberia ser PagoInsuficienteException(aun no lo es)//
        m = new Moneda100();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m,4,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m,5,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        //compra exitosa para cada producto//
        m = new Moneda1000();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,4,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m,5,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        //deberia ser NoHayProductoException(aun no lo es)//
        m = new Moneda1500();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1500();
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1500();
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1500();
        c = new Comprador(m,4,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda1500();
        c = new Comprador(m,5,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());


    }
}