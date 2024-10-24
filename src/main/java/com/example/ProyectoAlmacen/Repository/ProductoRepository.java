package com.example.ProyectoAlmacen.Repository;

import com.example.ProyectoAlmacen.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {


    @Query("select p.id, d.descripcion " +
            "from Producto p " +
            "inner join DetalleProducto d on p.id = d.producto")
    List<Object[]> findProductoDescriptions();

    @Query("select p.nombre, p.precio, d.descripcion " +
            "from producto p " +
            "innner join p.detalleProducto d")
    List<Object[]> findNombrePrecioDescripcion();


    @Query("selec p.nombre, p.precio, d.descripcion" +
            "from Producto p "+ "" +
            "inner join DetalleProducto d on p.id = d.producto.id" + "" +
            "order by p.precio ASC")
    List<Object>[] findNombrePrecioDescripcionOrdenados();








}
