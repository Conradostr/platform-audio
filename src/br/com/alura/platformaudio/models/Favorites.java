package br.com.alura.platformaudio.models;

public class Favorites {
    public void includs(Audio audio){
        if(audio.getClassification() > 9){
            System.out.println("Sucesso total");
        }else {
            System.out.println("Uma boa opção");
        }
    }
}
