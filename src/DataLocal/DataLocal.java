package DataLocal;

import java.time.LocalDate;

public class DataLocal {

    public static void main(String[] args){

        LocalDate hoje = LocalDate.now();

//        LocalDate ontem = hoje.minusDays(1)
//        para diminuir 1 dia
//        LocalDate amanha = hoje.plusDays(1)
//        para somar um dia
//        System.out.println(ontem);
//        System.out.println(amanha);

        System.out.println(hoje);
    }
}
