package classroom;

public enum Tipo {
	DISCIPLINAR(10,"Disciplinar"),FUNDAMENTACION(20,"Fundamentacion"),ELECTIVA(30,"electiva");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
}
