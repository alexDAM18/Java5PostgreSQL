package clases;
// Generated 15 nov. 2018, 20:05:46 by Hibernate Tools 5.2.11.Final

/**
 * Practiques generated by hbm2java
 */
public class Practiques implements java.io.Serializable {

	private PractiquesId id;
	private Alumne alumne;
	private Vehicle vehicle;
	private Short km;
	private Float val;

	public Practiques() {
	}

	public Practiques(PractiquesId id, Alumne alumne) {
		this.id = id;
		this.alumne = alumne;
	}

	public Practiques(PractiquesId id, Alumne alumne, Vehicle vehicle, Short km, Float val) {
		this.id = id;
		this.alumne = alumne;
		this.vehicle = vehicle;
		this.km = km;
		this.val = val;
	}

	public PractiquesId getId() {
		return this.id;
	}

	public void setId(PractiquesId id) {
		this.id = id;
	}

	public Alumne getAlumne() {
		return this.alumne;
	}

	public void setAlumne(Alumne alumne) {
		this.alumne = alumne;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Short getKm() {
		return this.km;
	}

	public void setKm(Short km) {
		this.km = km;
	}

	public Float getVal() {
		return this.val;
	}

	public void setVal(Float val) {
		this.val = val;
	}

}
