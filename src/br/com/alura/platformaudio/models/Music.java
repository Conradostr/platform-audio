package br.com.alura.platformaudio.models;

public class Music extends Audio{
    private String album;
    private String Singer;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if(getTotalReproductions() > 2000){
            return 10;
        }else {
            return 8;
        }
    }
}
