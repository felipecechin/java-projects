package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("blusa", 45.3, "Roupa");
        Produto p2 = new Produto("arroz", 47, "Comida");
        Produto p3 = new Produto("feijão", 23.2, "Comida");

        List<Produto> produtoList = Arrays.asList(p1, p2, p3);

        Predicate<Produto> categoria = p -> p.categoria.equals("Comida");
        Predicate<Produto> preco = p -> p.preco > 25;

        Function<Produto, String> produto = p -> "Produto " + p.nome + " de preço " + p.preco;

        produtoList.stream().filter(categoria).filter(preco).map(produto).forEach(System.out::println);
    }
}
