
public class Ciclabile {

    private int[] array;

    private int count;

    private int indiceScrittura;

    public Ciclabile(int[] array) {
        this.array = array;
    }

    public Ciclabile(){
        this.array = new int[10];
    }

    public void addElemento(int elemento){
        if(indiceScrittura < array.length){
            this.array[indiceScrittura] = elemento;
            indiceScrittura++;
        }else{
            System.out.println("Elenco completo");
        }
    }

    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            int valore = array[count];
            count++;
            return valore;
        } else {
            return -1;
        }

    }

    public boolean hasAncoraElementi() {
        boolean control = false;
        if (this.count != array.length) {
            control = true;
            return control;
        } else {
            return control;
        }
    }

}
