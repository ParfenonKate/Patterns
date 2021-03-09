package com.company;

public class EncapsulationEffect implements Effect{
    @Override
    public void brewСoffee() {
        System.out.println( "ПВы теряете желание делиться ходом\n" +
                "выполнения работы с остальными;");
    }
}
