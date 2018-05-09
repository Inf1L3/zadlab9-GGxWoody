/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author student
 */
public class AutoBox<T> {
    public T auto;

    public AutoBox(T auto) {
        this.auto = auto;
    }
    
    public T getAuto(){
        return auto;
    }
}
