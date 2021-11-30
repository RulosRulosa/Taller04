package Main;

import java.util.ArrayList;

public class PDesaparecida {

	ArrayList<String> BBDD = new ArrayList<String>();

	private boolean EstadoDE;
	private String EstadoVM;

	public PDesaparecida(boolean estadoDE, String estadoVM) {
		EstadoDE = estadoDE;
		EstadoVM = estadoVM;
	}

	public boolean isEstadoDE() {
		return EstadoDE;
	}

	public void setEstadoDE(boolean estadoDE) {
		EstadoDE = estadoDE;
	}

	public String getEstadoVM() {
		return EstadoVM;
	}

	public void setEstadoVM(String estadoVM) {
		EstadoVM = estadoVM;
	}
	public static void imprimirArray(ArrayList<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("n.-" + (i + 1) + " " + arr.get(i));
		}
		System.out.println("------------------------------");
	}

}