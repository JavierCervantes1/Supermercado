/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Javier Tareas
 */
public class NoNegativoException extends Exception{
    public NoNegativoException(String msg){
        super(msg);
    }
}
