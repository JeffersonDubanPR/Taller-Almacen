package com.example.ProyectoAlmacen.Controller;

import com.example.ProyectoAlmacen.Service.DetalleProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detallesopcional")
public class DetalleProductoController {
    @Autowired
    private DetalleProductoService detalleProductoService;

}
