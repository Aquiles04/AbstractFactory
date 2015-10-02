package Pacote1;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandre.chaves
 */
public class MontadoraFactories {
    
    public static MontadoraFactory obterFabrica(String nomeClasse){
        MontadoraFactory fabrica = null;
        
        try{
            fabrica = (MontadoraFactory) Class.forName(nomeClasse).newInstance();
        }
        catch (Exception ex){
            
        }
         
        return fabrica;       
    }
    
}
