
public class Ciclabile {

    private int[] array;

    private int count;

    public Ciclabile(int[] array) {
        this.array = array;
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
