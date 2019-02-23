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
public class ProgramCreator {

    
    public static void main(String[] args) {
       Program [] programs={
           new BankSystem(new CppDeveloper()),
           new StockExchange(new JavaDeveloper())
       };
       for(Program program: programs){
           program.developProgram();
       }
    }
    
}
