package com.example.ProyectoAlmacen.Repository;

import com.example.ProyectoAlmacen.Model.DetalleProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleProductoRepository extends JpaRepository<DetalleProducto, Long> {

}
