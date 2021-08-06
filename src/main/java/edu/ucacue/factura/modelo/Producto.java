package edu.ucacue.factura.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 30)
	private String nombre;
	private String descripcion;
	private String marca;
	private double precio;
	private String stock;
	private String cliente;
	private String local;
	private String direccion;
	private String fecha;
	
	
	
	public Producto(String nombre, String descripcion, String marca, double precio, String stock, String cliente, String local, String direccion, String fecha) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.cliente = cliente;
		this.local = local;
		this.direccion = direccion;
		this.fecha = fecha;
	}
	
	
	public Producto() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String cantidad) {
		this.stock = cantidad;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



}
