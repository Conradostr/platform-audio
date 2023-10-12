package br.com.alura.platformaudio.models;

public class Audio {
    private String title;
    private double durationInMinuts;
    private int totalReproductions;
    private int likes;
    private int classification;


    public void like(){
        this.likes++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void reproduce(){
        this.totalReproductions++;
    }

    public int getClassification() {
        return classification;
    }

    public int getLikes() {
        return likes;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }
}
