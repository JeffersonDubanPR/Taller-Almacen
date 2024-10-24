package com.example.ProyectoAlmacen.Service;


import com.example.ProyectoAlmacen.Model.Producto;
import com.example.ProyectoAlmacen.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@Service
public class ProductoService {


    @Autowired
    private ProductoRepository productoRepository;

    public Producto save(Producto producto){
        return productoRepository.save(producto);

    }

    public Optional<Producto> findById(Long id){
        return productoRepository.findById(id);
    }

    public Producto update(Producto producto, Long id){
        if(productoRepository.existsById(id)){
            producto.setId(id);
            return productoRepository.save(producto);
        }
        return null;

    }

    public void deleteById(Long id) {
        if(productoRepository.existsById(id))
            productoRepository.deleteById(id);
    }


    public List<Producto> findAll() {
        return productoRepository.findAll();


    }


    public List<Object[]> obtenerDescripcionesDeProductos() {
        return productoRepository.findProductoDescriptions();

    }

    public List<Object[]> obtenerNombrePrecioDescripcion() {
        return productoRepository.findNombrePrecioDescripcion();

    }

    public List<Object[]> obtenerNombrePrecioDescripcionOrdenados() {
        return Collections.singletonList(productoRepository.findNombrePrecioDescripcionOrdenados());    }
}

