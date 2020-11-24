
package ejericioarboles;

public class ArbolBinario {
    
    NodoArboles raiz;
    public ArbolBinario()
    {
        raiz=null;
      
    }
    
    // Metodo para ingresar un Nodo en el Arbol
    public void insertarNodo(int d, String nomb)
    {
        NodoArboles nuevo = new NodoArboles(d, nomb);
        if (raiz==null) {
            raiz= nuevo;
            
        }
        else
        {
            NodoArboles auxiliares= raiz;
            NodoArboles padre;
            while(true)
            {
                padre=auxiliares;
                if (d<auxiliares.dato){
                    auxiliares = auxiliares.hijoIzquierdo;
                    if (auxiliares==null) {
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else
                {
                    auxiliares = auxiliares.hijoIzquierdo;
                    if(auxiliares==null)
                    {
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                        
                }
            }
        }
        
    }
    
    // Metodo para saber si el Arbol esta Vacio
    
    public boolean estavacio()
    {
        return raiz==null;
        
    }
    
    // Método para Recorrer el Arbol InOrden
    
    public void inorden(NodoArboles r)
    {
        if (r!=null) {
            inorden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inorden(r.hijoDerecho);
            
        }
    }
    
    // Método para Recorrer el Arbol PreOrden
    
    public void preorden(NodoArboles r)
    {
        if (r!=null) {
            System.out.println(r.dato);
            preorden(r.hijoIzquierdo);
            preorden(r.hijoDerecho);
        }    
    }
    
    // M+étodo para mostrar el Arbol de PostOrden
    
    public void postorden(NodoArboles r)
    {
        if (r!=null) {
            postorden(r.hijoIzquierdo);
            postorden(r.hijoDerecho);
            System.out.println(r.dato);
        }    
    }
}
