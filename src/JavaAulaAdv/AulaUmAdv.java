package JavaAulaAdv;

import java.util.function.UnaryOperator;

public class AulaUmAdv {

    public static void main(String[] args) {

        UnaryOperator<Integer> CalcularValorVezes3 = valor -> valor * 3;

        int valor = 20;


        System.out.println("O valor de teste eh: " + CalcularValorVezes3.apply(20));

        System.out.println();
    }

}


