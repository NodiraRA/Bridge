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
public class BankSystem extends Program{

    public BankSystem(Developer developer) {
        super(developer);
    }
    
  

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
    
}
