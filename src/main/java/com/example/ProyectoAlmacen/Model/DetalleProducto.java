package com.example.ProyectoAlmacen.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

public class DetalleProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String caracteristicas;

    @OneToOne
    @JoinColumn(name = "Producto_id")
    @JsonBackReference
    private Producto producto;



    public DetalleProducto() {

    }

    public DetalleProducto(Long id, String descripcion, String caracteristicas, Producto producto) {
        this.id = id;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", producto=" + producto +
                '}';
    }
}
