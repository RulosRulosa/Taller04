package Main;

public class Desastres {

	private String Desastre;
	private int IntensidadLocal;
	private int IntensidadGlobal;
	private String Lugar;
	private String Fecha;

	public Desastres(String desastre, int intensidadLocal, int intensidadGlobal, String lugar, String fecha) {
		Desastre = desastre;
		IntensidadLocal = intensidadLocal;
		IntensidadGlobal = intensidadGlobal;
		Lugar = lugar;
		Fecha = fecha;
	}

	public String getDesastre() {
		return Desastre;
	}

	public void setDesastre(String desastre) {
		Desastre = desastre;
	}

	public int getIntensidadLocal() {
		return IntensidadLocal;
	}

	public void setIntensidadLocal(int intensidadLocal) {
		IntensidadLocal = intensidadLocal;
	}

	public int getIntensidadGlobal() {
		return IntensidadGlobal;
	}

	public void setIntensidadGlobal(int intensidadGlobal) {
		IntensidadGlobal = intensidadGlobal;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}
}