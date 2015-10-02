package Pacote1;





public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //MontadoraFactory factory = new ToyotaMontadoraFactory();
    String nome = "Pacote1.ToyotaMontadoraFactory";
    MontadoraFactory factory = MontadoraFactories.obterFabrica(nome);
    
    
    Chassi c1 = factory.criarChassi();
    Motor m1 = factory.criarMotor();
    c1.setMotor(m1);
    c1.getMotor().ignição();
    
    }
    
}
