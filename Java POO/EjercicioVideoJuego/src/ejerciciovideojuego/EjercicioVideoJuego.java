package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideoJuego {

    public static void main(String[] args) {
        
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123, "PES 2023", "Nintendo 64",
                4, "Deportes");
        VideoJuego video2 = new VideoJuego(456, "Mario Bros", "Nintendo 64",
                2, "Arcade");
        VideoJuego video3 = new VideoJuego(789, "Resident Evil", "PS2",
                1, "Shooter");
        VideoJuego video4 = new VideoJuego(101, "X-men", "PC",
                4, "Arcade");
        VideoJuego video5 = new VideoJuego(102, "Mario Kart", "Nintendo 64",
                4, "Autos");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        //RECORRER LISTA
        
        for (VideoJuego video:listaVideojuegos){ //por cada video juego de la lista de video juego voy a hacer lo siguiente
            System.out.println("Titulo: " +video.getTitulo()+ " Consola: " +video.getConsola()+ " Cantidad de jugadores: "
             +video.getCantJugadores());
            
        }
        
        //CAMBIO DE NOMBRE Y JUGADORES
        
        video3.setTitulo("Resident Evil 5");
        video3.setCantJugadores(2);
        
        video4.setTitulo("X-men Legends 2");
        video4.setCantJugadores(2);
        
        //MOSTRAR SOLO EL NOMBRE DE LOS QUE TENGAN DE CONSOLA NINTENDO 65
        
        for (VideoJuego video:listaVideojuegos) {
            if (video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }
        
                
        
        
        
        
    }
    
}
