package mx.itson.brocoli.negocio;
    /**
     * Contiene métodos  para trabajar con cadenas de String.
     * @author Sosa
     */
public class Operacion {
    
    /**
    * Separa una cadena de texto a partir de la expresión guion medio.
    * @param valor: Cadena de texto que será separada a partir de la expresión dada.
    * @return Array de string en donde cada posición representa una división de la cadena de texto.
    
    */
    public String[] separar(String valor){
        String[] elementos = valor.split("-");
        return elementos;
        // Sosa Ramsés
    }
    
}
