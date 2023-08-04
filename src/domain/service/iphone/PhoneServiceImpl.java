package domain.service.iphone;

import domain.service.PhoneService;

public class PhoneServiceImpl implements PhoneService {

    @Override
    public void ligar() {
       System.out.println("Ligando para Gustavo!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
       System.out.println("Iniciando correio de voz!");
    }
    
}
