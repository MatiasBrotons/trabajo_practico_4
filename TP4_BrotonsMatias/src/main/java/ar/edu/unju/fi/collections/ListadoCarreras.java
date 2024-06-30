package ar.edu.unju.fi.collections;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Carrera;
public class ListadoCarreras {
	public static List<Carrera> carreras = new ArrayList<Carrera>();
	public static List<Carrera> carrerasDisponibles = new ArrayList<Carrera>();
	public static List<Carrera> listarCarreras() {
		
		return carrerasDisponibles;
	}
	public static Carrera buscarCarreraPorCodigo(String codigo) {
		for (Carrera carrera : carrerasDisponibles) {
			if (carrera.getCodigo().equals(codigo)) {
				return carrera;
		    }
		}
		return null;
	}
	
	public static void modificarCarrera(Carrera carreraModificada) {
		carreraModificada.setEstado(true);
		int i=0;
		for (Carrera carrera : carrerasDisponibles) {
			if (carrera.getCodigo().equals(carreraModificada.getCodigo())) {
				carreras.set(i, carreraModificada);
				carrerasDisponibles.clear();
				for(Carrera carrera1 : carreras) {
					if(carrera1.isEstado()) {
						carrerasDisponibles.add(carrera1);
					}
				}
				break;
			}
			i++;
		}
	}
	public static void eliminarCarrera(String codigo) {
		for (Carrera carrera : carreras) {
			if (carrera.getCodigo().equals(codigo)) { 
				carrera.setEstado(false);				
			    break;
			}
		}
		carrerasDisponibles.clear();
		for(Carrera carrera : carreras) {
			if(carrera.isEstado()) {
				carrerasDisponibles.add(carrera);
			}
		}
	}
	public static void agregarCarrera(Carrera carrera) {
		carrera.setEstado(true);
		carreras.add(carrera);
		carrerasDisponibles.add(carrera);
	}
}