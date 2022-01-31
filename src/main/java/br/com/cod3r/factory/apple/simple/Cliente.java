package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.simple.factory.IphoneSimpleFactory;

public class Cliente
{

    public static void main(String[] args)
    {
        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = IphoneSimpleFactory.orderIphone("X", "standard");
        System.out.println(iPhone);

        System.out.println("### Ordering an iPhone 11");
        IPhone iPhone1 = IphoneSimpleFactory.orderIphone("11", "highEnd");
        System.out.println(iPhone1);
    }
}
