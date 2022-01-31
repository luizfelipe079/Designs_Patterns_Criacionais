package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class Iphone11ProFactory extends IphoneFactory
{

    protected IPhone createIPhone()
    {
        return new IPhone11Pro();
    }

}
