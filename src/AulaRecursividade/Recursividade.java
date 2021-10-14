package AulaRecursividade;

public class Recursividade {

    public static void main(String[] args) {
        System.out.println(fatorialA(7));
    }
    public static double fatorialA(double valor){
        return Recursividade1(valor, 1);
    }
    public static double Recursividade1(double valor, double numero) {

        if (valor == 0) {
            return numero;
        }
        return Recursividade1(valor-1, numero*valor);
    }
}
