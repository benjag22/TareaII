import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> deposito;

    public Deposito() {
        deposito= new ArrayList<>();
    }

    public void addElemento(T elemento) {
        deposito.add(elemento);
    }

    public T getElemento() {
        if (deposito.isEmpty()) {
            return null;
        } else {
            return deposito.remove(0);
        }
    }
}