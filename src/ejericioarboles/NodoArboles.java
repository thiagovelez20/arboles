
package ejericioarboles;


public class NodoArboles {
    
    int dato;
    String nombre;
    NodoArboles hijoIzquierdo, hijoDerecho;
    
    public NodoArboles(int d, String nomb){
        this.dato=d;
        this.nombre=nomb;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
      
    }
    
    public String toString()
    {
        return nombre + "Los datos son: " + dato;
    }
    
}
