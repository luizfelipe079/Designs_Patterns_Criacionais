package br.com.cod3r.factory.apple.halfSimple.factory;


import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;

public class Iphone11Factory extends IphoneFactory
{
    public IPhone createIphone(String level)
    {
        if (level.equals("standard"))
        {
            return new IPhone11();
        } else if(level.equals("highEnd"))
        {
            return new IPhone11Pro();
        } else
        {
            return null;
        }
    }
}
