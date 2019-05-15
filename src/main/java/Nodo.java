import java.util.ArrayList;
import java.util.List;

public class Nodo {
    String documento;
    List<Nodo> hijos = new ArrayList<Nodo>();

    Nodo(String nombreDoc){
        this.documento = nombreDoc;
    }

    public void agregarHijo(Nodo hijo){
        this.hijos.add(hijo);
    }

    public Nodo primerHijo(){
        return this.hijos.get(0);
    }

    public Nodo siguienteHijo(int pos){
        return this.hijos.get(pos);
    }
}
