package AulaRecursividade;

public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println(fatorial1(5));

    }

    public static int fatorial1(int value) {
        if ( value == 1){
            return value;
        }
        else {
            return value * fatorial1(value -1);
        }
    }
}
