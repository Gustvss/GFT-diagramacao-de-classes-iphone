package domain.service.iphone;

import domain.service.InternetService;

public class InternetServiceImpl implements InternetService {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de navegação!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página de navegação!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina de navegação!");
    }
    
}
