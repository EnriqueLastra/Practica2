public class Tickeo {
    Autobus autobus;
    Parada parada;
    Integer suben;
    Integer bajan;
    public Tickeo(){

    }

    public Tickeo(Autobus autobus, Parada parada, Integer suben, Integer bajan) {
        this.autobus = autobus;
        this.parada = parada;
        this.suben = suben;
        this.bajan = bajan;
    }
}

