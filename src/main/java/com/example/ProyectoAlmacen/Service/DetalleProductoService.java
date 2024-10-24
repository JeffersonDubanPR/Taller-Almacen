package com.example.ProyectoAlmacen.Service;

import com.example.ProyectoAlmacen.Repository.DetalleProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleProductoService {

    @Autowired
    private DetalleProductoRepository detalleProductoRepository;

}
