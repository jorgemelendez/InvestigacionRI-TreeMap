public class LlenarArbol {
    Arbol arbol;

    LlenarArbol(Arbol arbol){
        this.arbol = arbol;
    }


    public void llenarArbol1(){
        Nodo raiz = new Nodo("A");
        this.arbol.agregarRaiz(raiz);

        Nodo raizArbol = this.arbol.getRaiz();

        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");

        raiz.agregarHijo(B);
        raiz.agregarHijo(C);
        raiz.agregarHijo(D);

        Nodo E = new Nodo("E");
        Nodo F = new Nodo("F");
        Nodo G = new Nodo("G");

        B.agregarHijo(E);
        B.agregarHijo(F);
        B.agregarHijo(G);

        Nodo J = new Nodo("J");
        Nodo K = new Nodo("K");

        F.agregarHijo(J);
        F.agregarHijo(K);

        Nodo H = new Nodo("H");
        Nodo I = new Nodo("I");

        C.agregarHijo(H);
        C.agregarHijo(I);
    }


    public void llenarArbol2(){
        Nodo A = new Nodo("A");
        Nodo B = new Nodo("B");
        Nodo C = new Nodo("C");
        Nodo D = new Nodo("D");
        Nodo E = new Nodo("E");
        Nodo F = new Nodo("F");
        Nodo G = new Nodo("G");
        Nodo H = new Nodo("H");
        Nodo I = new Nodo("I");
        Nodo J = new Nodo("J");
        Nodo K = new Nodo("K");
        Nodo L = new Nodo("L");
        Nodo M = new Nodo("M");
        Nodo N = new Nodo("N");
        Nodo O = new Nodo("O");
        Nodo P = new Nodo("P");
        Nodo Q = new Nodo("Q");

        this.arbol.agregarRaiz(A);

        A.agregarHijo(B);
        A.agregarHijo(C);
        A.agregarHijo(D);
        A.agregarHijo(E);

        B.agregarHijo(F);
        B.agregarHijo(G);

        D.agregarHijo(H);
        D.agregarHijo(I);

        E.agregarHijo(J);
        E.agregarHijo(K);
        E.agregarHijo(L);

        F.agregarHijo(M);
        F.agregarHijo(N);

        N.agregarHijo(O);
        N.agregarHijo(P);
        N.agregarHijo(Q);
    }



}
