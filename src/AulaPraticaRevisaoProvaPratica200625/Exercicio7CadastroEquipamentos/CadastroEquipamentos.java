package AulaPraticaRevisaoProvaPratica200625.Exercicio7CadastroEquipamentos;

import java.util.ArrayList;
import java.util.List;

public class CadastroEquipamentos {
    private List<Equipamento> listaDeEquipamentos = new ArrayList<>();

    public void adicionarEquipamento(Equipamento equipamento) {
        listaDeEquipamentos.add(equipamento);
    }

    public void listarTodos() {
        System.out.println("##########################################");
        System.out.println("LISTAR TODOS OS EQUIPAMENTOS DA LISTA");
        for (Equipamento equipamento : this.listaDeEquipamentos) {
            System.out.println("Nome equipamento: " + equipamento.getNome());
            System.out.println("Codigo Patrimonio: " + equipamento.getCodigoPatrimonio());
            if (equipamento.getSetor() != null) {
                System.out.println("Setor do equipamento: " + equipamento.getSetor());
            }
        }
        System.out.println("##########################################");
    }

    // Outra forma de buscar o código do equipamento retornando um método (porém é necessário fazer a lógica no main)
//    public String buscarEquipamentoPeloCodigo(String codigoDoEquipamento) {
//        for (Equipamento equipamento : this.listaDeEquipamentos) {
//            if (codigoDoEquipamento.equals(equipamento.getCodigoPatrimonio())) {
//
//                return equipamento.getNome();
//            }
//        }
//        return null;
//    }

    public void buscarEquipamentoPeloCodigo(String codigoDoEquipamento) {
        System.out.println("##########################################");
        System.out.println("BUSCANDO EQUIPAMENTO PELO CÓDIGO DO PATRIMÔNIO");
        boolean existeOEquipamento = false;
        for (Equipamento equipamento : this.listaDeEquipamentos) {
            if (codigoDoEquipamento.equals(equipamento.getCodigoPatrimonio())) {
                existeOEquipamento = true;
                System.out.println("Equipamento encontrado: " + equipamento.getNome());
                break;
            }
        }
        if (existeOEquipamento == false) {
            System.out.println("O equipamento não encontrado!");
        }
    }

    public void atualizarSetor(String codigoDoEquipamento, String novoSetor) {
        System.out.println("##########################################");
        System.out.println("ATUALIZANDO SETOR DO EQUIPAMENTO AO QUAL FOI INFORMADO PELO CODIGO DO PATRIMÔNIO");
        boolean existeOEquipamento = false;
        for (Equipamento equipamento : this.listaDeEquipamentos) {
            if (codigoDoEquipamento.equals(equipamento.getCodigoPatrimonio())) {
                existeOEquipamento = true;
                System.out.println("Setor atualizado");
                equipamento.setSetor(novoSetor);
                break;
            }
        }
        if (existeOEquipamento == false) {
            System.out.println("Setor não atualizado!");
        }
    }

    public void removerPorCodigo(String codigoPatrimonio, String nome) {
        System.out.println("##########################################");
        boolean excluiuOEquipamentoPeloCodigo = this.listaDeEquipamentos.removeIf(equipamento -> equipamento.getCodigoPatrimonio().equals(codigoPatrimonio));
        if (excluiuOEquipamentoPeloCodigo) {
            System.out.println("EQUIPAMANETO " + nome + " EXCLUIDO COM SUCESSO!");
        } else {
            System.out.println("EQUIPAMANETO NÃO ENCONTRADO PARA SER EXCLUIDO!");
        }
    }
}
