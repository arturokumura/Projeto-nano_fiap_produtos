package repository;
import model.Categoria;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import model.produto;

public class ProdutoCollectionRepository {
    private static List<produto> produtos;

    static {
        produtos = new Vector<>();
    produto kindle = new produto();
    kindle.setCategoria(CategoriaCollectionRepository.findById(1l)).setNome("kindle")
    .setDescricao("e-reader da Amazon")
    .setDataCadastro(LocalDateTime.now())
            .setPreco(BigDecimal.valueOf(899.99));

    produto iphone = new produto();
    iphone.setCategoria(CategoriaCollectionRepository.findById(2l))
            .setNome("Iphone 14 PRO MAX")
    .setDescricao("Aparelho celular de última geração da Apple")
    .setDataCadastro(LocalDateTime.now())
        .setPreco(BigDecimal.valueOf(12999.99));

    Arrays.asList(kindle, iphone).forEach(ProdutoCollectionRepository::save);
}

public static produto save(produto produto) {
    if (!produtos.contains(produto)) {
        produto.setId((long) produtos.size() + 1);
        produtos.add(produto);
        return produto;
    } else {
        return null;
    }
}

public static produto findById(Long id) {
    return produtos.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElse(null);
}
    }
