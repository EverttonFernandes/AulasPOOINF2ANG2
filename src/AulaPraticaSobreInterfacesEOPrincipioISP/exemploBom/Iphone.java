package AulaPraticaSobreInterfacesEOPrincipioISP.exemploBom;

import AulaPraticaSobreInterfacesEOPrincipioISP.DispositivoEletronico;

public class Iphone extends DispositivoEletronico implements LigarBluetooh, DesligarWifi, LigarWifi {
    @Override
    public void ligarBluetooth() {
        System.out.println("Bluetooth do iPhone ligado.");
    }

    @Override
    public void desligarWiFi() {
        System.out.println("WiFi do iPhone desligado.");
    }

    @Override
    public void ligarWiFi() {
        System.out.println("WiFi do iPhone ligado.");
    }

    @Override
    protected void ligar() {
        System.out.println("Ligando o iPhone...");
    }

    @Override
    protected void desligar() {
        System.out.println("Desligando o iPhone...");
    }

    @Override
    protected void volume() {
        System.out.println("Ajustando o volume do iPhone...");
    }
}
