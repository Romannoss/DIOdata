package AulaLambda;

import java.util.function.Function;

public class AulaLambda {
    public static void main(String[] args) {
        Function1 ColocarPrefixo = valor -> "Sr."+valor;
        System.out.println(ColocarPrefixo.gerar("Giovanni"));
    }
}

@FunctionalInterface
interface Function1{

    String gerar(String valor);
}
