package logicaNegocio;

public class Main {

    public static void main(String[] args) {
    Leon leon = new Leon();
    Delfin delfin= new Delfin();
    Perro perro = new Perro();
    
    
        System.out.println("Leon");
        System.out.println("Sonido:"+ leon.emitirSonido());
        System.out.println("Dieta:"+ leon.obtenerDieta());
        System.out.println("Habitat:"+ leon.getHabitat());
        System.out.println();
        
        System.out.println("delfin");
        System.out.println("Sonido:"+ delfin.emitirSonido());
        System.out.println("Dieta:"+ delfin.obtenerDieta());
        System.out.println("Habitat:"+ delfin.getHabitat());
        System.out.println();
        
        System.out.println("perro");
        System.out.println("Sonido:"+ perro.emitirSonido());
        System.out.println("Dieta:"+ perro.obtenerDieta());
        System.out.println("Habitat:"+ perro.getHabitat());
        System.out.println();
        
        
    }

}
