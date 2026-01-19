import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;
import model.Categoria;
import model.produto;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Categoria categoria = new Categoria();

        categoria.setId(1l);;
        categoria.setName("Eletronicos");

        produto produto = new produto();
        produto.setId(1l);
        produto.setName("Kindle");
        produto.setDescricao("e-reader");
        produto.setDatadeCadastro(LocalDateTime.now());
        produto.setCategoria(categoria);
        produto.setPreco(BigDecimal.valueOf(800));

        System.out.println("Categoria " + categoria);
        System.out.println("Produto " + produto);
    }
}