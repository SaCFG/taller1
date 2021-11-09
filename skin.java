package t1;

public class skin {
	private String pj;
	private String nombreSkin;
	private String calidad;
	
	public skin(String pj, String nombreSkin, String calidad) {
		this.pj = pj;
		this.nombreSkin = nombreSkin;
		this.calidad = calidad;
	}

	public String getPj() {
		return pj;
	}

	public void setPj(String pj) {
		this.pj = pj;
	}

	public String getNombreSkin() {
		return nombreSkin;
	}

	public void setNombreSkin(String nombreSkin) {
		this.nombreSkin = nombreSkin;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	
}
