
public class Fila {
    private static class Celula {
        Object item;
        Celula prox;
    }
    private Celula fundo, topo;
    Celula prox;
    private int tam;

    public Fila() {
        this.topo = null;
        this.tam = 0;
    }

    public boolean vazia() {
        return (this.topo == null);
    }

    public void push(Object x, int i) {
        Celula aux = this.topo;
        this.topo = new Celula();
        this.topo.item = x;
        this.topo.prox = aux;

        this.fundo = this.topo.prox;
        this.tam++;
    }

    public Object pop() throws Exception {
        if (this.vazia()) {
            throw new Exception("Fila vazia!");
        }
        Object item = null;
        try {
            item = this.fundo.item;
            this.topo = this.fundo;
            this.fundo = this.fundo.prox;
        } catch (Exception e) {
            this.topo = null;
        }
        this.tam--;
        return item;
    }

    public void imprimir() {
        Celula teste = this.topo;
        try {
            while (teste.item != null) {
                try {
                    System.out.println(teste.item);
                    teste = teste.prox;
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {

        }
    }
}