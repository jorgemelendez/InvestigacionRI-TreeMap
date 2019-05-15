public class Main {

    public static void main(String args[]) {
        Arbol arbol1 = new Arbol();
        LlenarArbol llenarArbol = new LlenarArbol(arbol1);
        llenarArbol.llenarArbol1();
        // Imprime arbol por nivele de forma muy charral.
        arbol1.printArbol1(arbol1.getRaiz());

        System.out.println();
        Arbol arbol2 = new Arbol();
        LlenarArbol llenarArbol2 = new LlenarArbol(arbol2);
        llenarArbol2.llenarArbol2();
        arbol2.printArbol2(arbol2.getRaiz());

    }

}
