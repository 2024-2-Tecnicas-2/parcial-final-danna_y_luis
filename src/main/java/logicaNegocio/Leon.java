package logicaNegocio;


    class Leon extends Animal {
    // Constructor que asigna el hábitat terrestre
    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
    }

    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }
}

