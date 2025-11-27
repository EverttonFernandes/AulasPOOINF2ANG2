package AulaPraticaSimuladoProvaPratica271125.simuladoacai;

public class AcaiPequeno extends Acai implements Adicionavel {

    public AcaiPequeno(String nomeDoTamanho, double precoBase) {
        super(nomeDoTamanho, precoBase);
    }

    @Override
    public void adicionarSabor(Sabor sabor) {
        if (this.listaSabores.size() >= 3) {
            throw new LimiteSaborAdicionalExcedidoException("Limite de sabores adicionais excedido para Açaí Pequeno.");
        } else {
            this.listaSabores.add(sabor);
            System.out.println("Sabor adicionado com sucesso: " + sabor.getNomeSabor());
        }
    }

}
