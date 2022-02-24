package colecoes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lista {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessar pelo índice

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));
        System.out.println(lista.remove(new Usuario("Manu")));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        System.out.println("Tem? " + lista.contains(u1));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

        List<String> teste = new ArrayList<>();
        teste.add("opa");
        teste.add("opa2");
        teste.add("opa3");

        removeLista(teste);
        verificaLista(teste);

        String testeStr = "opa";
        System.out.println(testeStr.indexOf("gh"));

    }

    public static void removeLista(List<String> lista) {
        lista.remove(1);
    }

    public static void verificaLista(List<String> lista) {
        System.out.println(lista.get(1));
    }
}
