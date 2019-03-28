package mx.ihsa.primefaces;

import java.util.Random;

import javax.inject.Named;

@Named
public class ImagenesBean {
	
    private String []imagenes = {"https://www.tecgurus.net/assets/banners/microservicios-con-java.jpg",
            "https://www.tecgurus.net/assets/banners/guruday-app-movil-ionic.jpg",
            "https://www.tecgurus.net/assets/banners/react-native-desde-cero.jpg",
            "https://www.tecgurus.net/assets/banners/linux-servidores.jpg",
            "https://www.tecgurus.net/assets/banners/angular-desde-cero.jpg",
            "https://www.tecgurus.net/assets/banners/node-js-desde-cero.jpg",
            "https://www.tecgurus.net/assets/banners/diplomado-full-stack-developer.jpg",
            "https://www.tecgurus.net/assets/banners/analisis-de-la-seguridad-de-ti.jpg",
            "https://www.tecgurus.net/assets/banners/rastreo-de-intrusiones-a-t-i.jpg"};
   
    public String getRandomCurso() {
        int imagen = new Random().nextInt(imagenes.length);
        return imagenes[imagen];
    }
	
}
