import br.com.alura.platformaudio.models.Favorites;
import br.com.alura.platformaudio.models.Music;
import br.com.alura.platformaudio.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music atos2 = new Music();
        atos2.setTitle("Atos 2");
        atos2.setSinger("Gabriela Rocha");

        for (int i = 0; i < 3000; i++) {
            atos2.reproduce();
        }

        for (int i = 0; i < 5000; i++) {
            atos2.like();
        }

        Podcast inteligenciaLtda = new Podcast();
        inteligenciaLtda.setTitle("EP 538");
        inteligenciaLtda.setPresenter("Vilela");

        for (int i = 0; i < 5000; i++) {
            inteligenciaLtda.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            inteligenciaLtda.like();
        }

        Favorites myFavorites = new Favorites();

        myFavorites.includs(atos2);
        myFavorites.includs(inteligenciaLtda);
    }
}