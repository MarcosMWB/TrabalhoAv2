import java.util.ArrayList;

public class ListaDeObjetos<E> {
    private ArrayList<E> lista;
    private int corrente = -1;

    public ListaDeObjetos(int tam) {
        this.lista = new ArrayList(tam);
    }

    public boolean adicionar(E obj) {
        return this.lista.add(obj);
    }

    public int tamanho() {
        return this.lista.size();
    }

    public boolean remover(int numero) {
        int n = this.localizar(numero);
        if (n == -1) {
            return false;
        } else {
            this.lista.remove(n);
            return true;
        }
    }

    public E recuperar(int numero) {
        int n = this.localizar(numero);
        return n == 1 ? null : this.lista.get(n);
    }

    public boolean vazia() {
        return this.lista.isEmpty();
    }

    private int localizar(int numero) {
        Integer num = new Integer(numero);

        for(int i = 0; i < this.lista.size(); ++i) {
            if (this.lista.get(i).equals(num)) {
                return i;
            }
        }

        return -1;
    }

    public E recuperarPrimeiro() {
        if (this.lista.isEmpty()) {
            return null;
        } else {
            this.corrente = 0;
            return this.lista.get(this.corrente);
        }
    }

    public E recuperarProximo() {
        if (this.corrente == -1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            ++this.corrente;
            if (this.corrente < this.lista.size()) {
                return this.lista.get(this.corrente);
            } else {
                this.corrente = -1;
                return null;
            }
        }
    }
}
