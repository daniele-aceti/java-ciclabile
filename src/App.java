
public class App {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 67, 8, 65};
        Ciclabile array = new Ciclabile(a);
        for( int i = 0; i < 10; i++){
            System.out.println(array.getElementoSuccessivo());

        }
        System.out.println(array.hasAncoraElementi());

        Ciclabile array2 = new Ciclabile();
        array2.addElemento(1);
        System.out.println(array2.getElementoSuccessivo());
        array2.addElemento(2);
        System.out.println(array2.getElementoSuccessivo());
        array2.addElemento(3);
        System.out.println(array2.getElementoSuccessivo());

    }
}
