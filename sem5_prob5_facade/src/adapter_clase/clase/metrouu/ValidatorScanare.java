package adapter_clase.clase.metrouu;

public class ValidatorScanare implements ValidatorMetrou{
    @Override
    public void valideazaBiletMetrou() {
        System.out.println("Biletul de metrou a fost validat");
    }

    @Override
    public void valideazaAbonamentMetrou() {
        System.out.println("Abonamentul de metrou a fost validat");
    }

    @Override
    public void valideazaBiletDouaCalatorii() {
        System.out.println("Biletul de metrou cu doua calatorii a fost validat");
    }
}
