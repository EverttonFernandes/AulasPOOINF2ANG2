package AulaPraticaTratamentoExcecoes131125;

public class Carro {
    private boolean temBateria;

    public Carro(boolean temBateria) {
        this.temBateria = temBateria;
    }

    public void ligarCarroComExcessaoPersonalizada(){
        if (!this.temBateria){
            throw new SemBateriaException("Carro sem bateria. Nao e possivel ligar.");
        } else {
            System.out.println("Carro ligado com sucesso!");
        }
    }
}
