package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IphoneFactory
{

    protected IPhone createIPhone()
    {
        return new IPhoneXSMax();
    }

}
