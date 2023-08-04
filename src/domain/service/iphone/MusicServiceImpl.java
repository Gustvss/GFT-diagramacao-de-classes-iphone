package domain.service.iphone;

import domain.service.MusicService;

public class MusicServiceImpl implements MusicService{

    @Override
    public void tocarMusica() {
       System.out.println("Tocando música!");
    }

    @Override
    public void pausarMusica() {
       System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
    
}
