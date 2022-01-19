package lambdas;

//interface funcional tem apenas um único método
@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String muitoLegal() {
        return "muito legal";
    }
}
