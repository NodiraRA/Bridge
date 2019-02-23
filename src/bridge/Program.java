/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author nodira
 */
public abstract class Program {
    protected Developer developer;
    protected Program(Developer developer){
        this.developer=developer;
    }
    public abstract void developProgram();
    
}
