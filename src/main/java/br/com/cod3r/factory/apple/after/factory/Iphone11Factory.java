package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;

public class Iphone11Factory extends IphoneFactory
{

    protected IPhone createIPhone()
    {
        return new IPhone11();
    }

}
