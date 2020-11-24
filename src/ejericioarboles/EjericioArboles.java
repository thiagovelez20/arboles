
package ejericioarboles;

import javax.swing.JOptionPane;


public class EjericioArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int opciones=0,elementos;
       String nombre;
       
       ArbolBinario arboles = new ArbolBinario();
        do {
            try{
                opciones = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "1. Ingresar un Nodo al Arbol\n"
                                + "2. Recorrer el Arbol InOrden\n"
                                + "3. Recorrer el Arbol PreOrden\n"
                                + "4. Recorrer el Arbol PostOrden\n"
                                + "5. Salir de la Consola"
                                + "Elegir algunas Opciones.....", "Arboles BInarios", JOptionPane.QUESTION_MESSAGE));
                switch(opciones){
                    case 1:
                        elementos = Integer.parseInt(JOptionPane.showInputDialog(null,
                                
                                "Ingresar los Números del Arbol correspondiente", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa un Nombre de Usuario...", "Agregando Nodo",JOptionPane.QUESTION_MESSAGE);
                        
                        arboles.insertarNodo(elementos, nombre);
                        break;
                        
                    case 2:
                        if (!arboles.estavacio()) {
                            arboles.inorden(arboles.raiz);
                        }else
                        {
                            JOptionPane.showInputDialog(null, "El Arbol esta Vacio",
                         "! cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                      break;
                    case 3:
                        if (!arboles.estavacio()) {
                            arboles.preorden(arboles.raiz);
                        }else
                        {
                            JOptionPane.showInputDialog(null, "El Arbol esta Vacio",
                         "! cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4:
                        if (!arboles.estavacio()) {
                            arboles.postorden(arboles.raiz);
                        }else
                        {
                            JOptionPane.showInputDialog(null, "El Arbol esta Vacio",
                         "! cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showInputDialog(null, "Aplicación finalizada",
                         "final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opcion Incorrecto",
                         "! Lo Sentimos !", JOptionPane.INFORMATION_MESSAGE);
                                
                                
                        
                                
                }
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(null, " Error " +n.getMessage());
            }
        } while (opciones!=5);
        
       
       
    }
    
}
