package Main;

import Simple_factory.FabricaMijlocTransport;
import Simple_factory.MijlocTransport;
import Simple_factory.TipMijlocTransport;
import Singleton.Singleton;

public class Main {
    public static void main(String[] args)
    {
        //SINGLETON
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println(s1);
        System.out.println(s2);

        //SIMPLE FACTORY

        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz, "9999");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai, "3324234");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz, "234234234");

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());
    }
}
