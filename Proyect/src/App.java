import net.salesianos.Guerrero;
import net.salesianos.Mago;

public class App {
    public static void main(String[] args) throws Exception {
        
        Guerrero aragorn = new Guerrero("Aragorn", 100);

        Mago maguito = new Mago("Gandalf", 80);

        aragorn.mostrarInfo();
        maguito.mostrarInfo();

        aragorn.atacar();
        maguito.lanzarHechizo();
    }
}
