package view;

import model.Categoria;
import model.produto;
import repository.ProdutoCollectionRepository;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

    public class ProdutoView {
        public static produto select() {
            produto ret = (produto) JOptionPane.showInputDialog(
                null,
                "Selecione uma produto",
                "Menu",JOptionPane.QUESTION_MESSAGE,
                null,
                ProdutoCollectionRepository.findAll().toArray(),
                1);
            return ret;  }

        public static produto form() {

            Categoria categoria = null;
            do {
                categoria = CategoriaView.select(null);
            } while (categoria == null);

            String nome = "";
            do {
                nome = JOptionPane.showInputDialog("Nome do Produto");
                if (nome.length() < 3)
                    JOptionPane.showMessageDialog(null, "O nome do porduto precisa ter no mínimo 3 digitos");
            } while (nome.equals(""));
            String descricao = "";
            do {
                descricao = JOptionPane.showInputDialog("Descrição do Produto");
                if (descricao.length() < 5)
                    JOptionPane.showMessageDialog(null, "A descrição do porduto precisa ter no mínimo 5 digitos");
            } while (descricao.equals(""));

            double p = 0;

            do {
                try {
                    p = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto"));
                } catch (NumberFormatException e) {
                    p = 0;
                }
                if (p <= 0) JOptionPane.showMessageDialog(null, "Valor inválido");
            } while (p <= 0);

            BigDecimal preco = BigDecimal.valueOf(p);

            produto ret = new produto();
            ret.setNome(nome)
                    .setCategoria(categoria)
                    .setDescricao(descricao)
                    .setPreco(preco).setDatadeCadastro(LocalDateTime.now());
            return ret;
        }
    }


