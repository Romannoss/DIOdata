package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	Long currentTimeMillis = System.currentTimeMillis();
	System.out.println(currentTimeMillis);

    Date novaData = new Date(currentTimeMillis);

    System.out.println(novaData);

    }
}
