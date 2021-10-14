package AulaFacilitandoCodeAPI;

public class Aula2 {
    public static void main(String[] args) {
        Calculo soma = ( a, b) -> a+b;
        System.out.println(ExecutarOperacao(soma, 1, 7));
    }

    public static int ExecutarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);

    }

}

interface Calculo{
    public int calcular(int a, int b);
}
