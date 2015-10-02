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
public class ToyotaMontadoraFactory extends MontadoraFactory{
    
    @Override
    public Chassi criarChassi() {
        return new ToyotaChassi();
    }

    @Override
    public Motor criarMotor() {
        return new ToyotaMotor(); 
    } 
    
}
