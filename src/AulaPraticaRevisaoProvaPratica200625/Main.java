package AulaPraticaRevisaoProvaPratica200625;

public class Main {
    public static void main(String[] args) {
        Equipamento alicate = new Equipamento("Alicate", "2121313");
        Equipamento cerrote = new Equipamento("Cerrote", "1212121");
        Equipamento martelo = new Equipamento("Martelo", "8888842");
        Equipamento parafuso = new Equipamento("Parafuso", "11111");

        CadastroEquipamentos cadastroEquipamentos = new CadastroEquipamentos();

        cadastroEquipamentos.adicionarEquipamento(alicate);
        cadastroEquipamentos.adicionarEquipamento(cerrote);
        cadastroEquipamentos.adicionarEquipamento(martelo);
        cadastroEquipamentos.adicionarEquipamento(parafuso);

        cadastroEquipamentos.buscarEquipamentoPeloCodigo(alicate.getCodigoPatrimonio());
        cadastroEquipamentos.atualizarSetor(alicate.getCodigoPatrimonio(), "Almoxarifado");
        cadastroEquipamentos.atualizarSetor(parafuso.getCodigoPatrimonio(), "Almoxarifado");
        cadastroEquipamentos.atualizarSetor(cerrote.getCodigoPatrimonio(), "Almoxarifado");
        cadastroEquipamentos.removerPorCodigo(martelo.getCodigoPatrimonio(), martelo.getNome());
        cadastroEquipamentos.listarTodos();
    }
}
