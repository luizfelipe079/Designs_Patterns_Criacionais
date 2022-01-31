package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.model.IPhone;

public abstract class IphoneFactory
{

    public IPhone orderIphone()
    {
        IPhone device = null;

        device = createIPhone(); // createIPhone() será o factory method

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
