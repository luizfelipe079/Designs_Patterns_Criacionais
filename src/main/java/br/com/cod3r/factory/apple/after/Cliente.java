package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.*;
import br.com.cod3r.factory.apple.model.IPhone;

public class Cliente
{

    public static void main(String[] args)
    {
        IphoneFactory iphoneXFactory = new IphoneXFactory();
        IphoneFactory iphone11Factory = new Iphone11Factory();
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();
        IphoneFactory iphoneXSMaxFactory = new IphoneXSMaxFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = iphoneXFactory.orderIphone();
        System.out.println(iPhone);

        System.out.println("\n\n### Ordering an iPhone XS Max");
        IPhone iphone2 = iphoneXSMaxFactory.orderIphone();
        System.out.println(iphone2);

        System.out.println("\n\n### Ordering an iPhone 11");
        IPhone iphone3 = iphone11Factory.orderIphone();
        System.out.println(iphone3);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone4 = iphone11ProFactory.orderIphone();
        System.out.println(iphone4);
    }
}
