package ejercicio4;

public class Disco {

	/**
	 * Guarda el código del disco
	 */
	private String codigo = "LIBRE";

	/**
	 * Guarda el autor del disco
	 */
	private String autor;

	/**
	 * Guarda el título del disco
	 */
	private String titulo;

	/**
	 * Guarda el género de música del disco
	 */
	private String genero;

	/**
	 * Guarda el tiempo de duración del disco
	 */
	private int duracion;

	/**
	 * Constructor por defecto
	 */
	public Disco() {

	}

	/**
	 * Constructor que asigna valor a código, autor, título, género y duración del
	 * disco
	 * 
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param genero
	 * @param duracion
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 * Constructor copia de Disco
	 * 
	 * @param disco
	 */
	public Disco(Disco disco) {
		this.codigo = disco.codigo;
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.genero = disco.genero;
		this.duracion = disco.duracion;
	}

	/**
	 * Devuelve el código del disco
	 * 
	 * @return el código
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Modifica el valor del código
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Devuelve el autor del disco
	 * 
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Modifica el valor del autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Devuelve el título del disco
	 * 
	 * @return el título
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Modifica el valor del título
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el género del disco
	 * 
	 * @return el género
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Modifica el valor del género del disco
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Devuelve el tiempo de duración del disco
	 * 
	 * @return la duración
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Modifica el valor de la duración
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * Devuelve los valores de todos los atributos del disco
	 */
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}

}
