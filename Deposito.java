import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Deposito<T extends Producto> {
    private List<T> deposito;

    public Deposito() {
        deposito=new ArrayList<>();
    }

    public T addProducto(T producto) {
        deposito.add(producto);
        return producto;
    }

    public T getProducto() {
        if (deposito.isEmpty()) {
            return null;
        } else {
            return deposito.remove(0);
        }
    }
}

