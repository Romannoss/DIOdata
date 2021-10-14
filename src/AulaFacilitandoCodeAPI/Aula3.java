package AulaFacilitandoCodeAPI;

public class Aula3 {

    private static int calcular;

    public static void main(String[] args) {
        Calculo SOMA = ( a, b) -> a+b;
        Calculo SUBT = ( a, b) -> a-b;
        Calculo DIVI = ( a, b) -> a/b;
        Calculo MULT = ( a, b) -> a*b;


        System.out.println(ExecutarOperacao(SOMA, 1, 7));
        System.out.println(ExecutarOperacao(SUBT, 9, 7));
        System.out.println(ExecutarOperacao(DIVI, 14, 7));
        System.out.println(ExecutarOperacao(MULT, 1, 7));

    }

    public static int ExecutarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);

    }

}
//@FunctionalInterface
//interface Calculo{
//    public int calcular(int a, int b);
//}

