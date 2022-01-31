package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.Iphone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IphoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IphoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Cliente
{

    public static void main(String[] args)
    {
        IphoneFactory genXFactory = new IphoneXFactory();
        IphoneFactory gen11Factory = new Iphone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = genXFactory.orderIphone("standard");
        System.out.println(iPhone);

        System.out.println("### Ordering an iPhone 11");
        IPhone iPhone1 = gen11Factory.orderIphone("highEnd");
        System.out.println(iPhone1);
    }
}
