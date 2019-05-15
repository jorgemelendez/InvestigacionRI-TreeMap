public class Arbol {
    Nodo nodoRaiz;

    Arbol(){ }

    public void agregarRaiz(Nodo raiz) {
        this.nodoRaiz = raiz;
    }

    public Nodo getRaiz(){
        return this.nodoRaiz;
    }

    public void printArbol1(Nodo nodo) {
        // Imprime la raiz.
        System.out.print(nodo.documento);

        System.out.print(nodo.primerHijo().documento);
        System.out.print(nodo.siguienteHijo(1).documento);
        System.out.print(nodo.siguienteHijo(2).documento);

        Nodo B = nodo.primerHijo();
        System.out.print(B.primerHijo().documento);
        System.out.print(B.siguienteHijo(1).documento);
        System.out.print(B.siguienteHijo(2).documento);

        Nodo C = nodo.siguienteHijo(1);
        System.out.print(C.primerHijo().documento);
        System.out.print(C.siguienteHijo(1).documento);

        Nodo F = B.siguienteHijo(1);
        System.out.print(F.primerHijo().documento);
        System.out.print(F.siguienteHijo(1).documento);

    }

    public void printArbol2(Nodo nodo) {
        // Imprime la raiz.
        System.out.print(nodo.documento);

        System.out.print(nodo.primerHijo().documento);
        System.out.print(nodo.siguienteHijo(1).documento);
        System.out.print(nodo.siguienteHijo(2).documento);
        System.out.print(nodo.siguienteHijo(3).documento);

        Nodo B = nodo.primerHijo();
        System.out.print(B.primerHijo().documento);
        System.out.print(B.siguienteHijo(1).documento);

        Nodo D = nodo.siguienteHijo(2);
        System.out.print(D.primerHijo().documento);
        System.out.print(D.siguienteHijo(1).documento);

        Nodo E = nodo.siguienteHijo(3);
        System.out.print(E.primerHijo().documento);
        System.out.print(E.siguienteHijo(1).documento);
        System.out.print(E.siguienteHijo(2).documento);

        Nodo F = B.primerHijo();
        System.out.print(F.primerHijo().documento);
        System.out.print(F.siguienteHijo(1).documento);

        Nodo N = F.siguienteHijo(1);
        System.out.print(N.primerHijo().documento);
        System.out.print(N.siguienteHijo(1).documento);
        System.out.print(N.siguienteHijo(2).documento);

    }

}
