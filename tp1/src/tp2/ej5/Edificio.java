package tp2.ej5;

import java.util.ArrayList;

public class Edificio {
    private ArrayList<Vivienda> viviendas;

    public Edificio() {
        this.viviendas = new ArrayList<>();
    }

    public void agregarVivienda(Vivienda vivienda) {
        this.viviendas.add(vivienda);
    }

    public void mostrarEdificio() {
        for (Vivienda vivienda : this.viviendas) {
            vivienda.mostrarVivienda();
        }
    }
    public void realizarMudanza(int pisoOrigen, char deptoOrigen, int pisoDestino, char deptoDestino) {
        Vivienda viviendaOrigen = null;
        Vivienda viviendaDestino = null;
        for (Vivienda vivienda : this.viviendas) {
            if (vivienda.getDireccion().getPiso() == pisoOrigen && vivienda.getDireccion().getDepto() == deptoOrigen) {
                viviendaOrigen = vivienda;
                viviendaDestino = new Vivienda(new Direccion(vivienda.getDireccion().getCalle(), vivienda.getDireccion().getAltura(), pisoDestino, deptoDestino));
            }
        }
        if (viviendaOrigen != null && viviendaDestino != null) {
            for (Persona persona : viviendaOrigen.getPersonas()) {
                viviendaDestino.agregarPersona(persona);
            }
            for (Mueble mueble : viviendaOrigen.getMuebles()) {
                viviendaDestino.agregarMueble(mueble);
            }

            System.out.println("SE HA REALIZADO LA MUDANZA");
            this.viviendas.remove(viviendaOrigen);
            this.viviendas.add(viviendaDestino);
        }
    }

}
