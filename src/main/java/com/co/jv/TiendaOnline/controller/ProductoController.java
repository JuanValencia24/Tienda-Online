package com.co.jv.TiendaOnline.controller;

import com.co.jv.TiendaOnline.dto.CategoriaDTO;
import com.co.jv.TiendaOnline.dto.EstadoDTO;
import com.co.jv.TiendaOnline.dto.ProductoDTO;
import com.co.jv.TiendaOnline.dto.ProductoDTOPlantilla;
import com.co.jv.TiendaOnline.entity.Categoria;
import com.co.jv.TiendaOnline.entity.Estado;
import com.co.jv.TiendaOnline.entity.Producto;
import com.co.jv.TiendaOnline.mapper.ProductoMapper;
import com.co.jv.TiendaOnline.service.CategoriaService;
import com.co.jv.TiendaOnline.service.EstadoService;
import com.co.jv.TiendaOnline.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping(path = "api/")
public class ProductoController {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private EstadoService estadoService;

    @Autowired
    private ProductoService productoService;
    @Autowired
    private ProductoMapper mapper;

    @GetMapping("/registro/producto")
    public String verResgistroProducto(Model model, ProductoDTOPlantilla productoDTOPlantilla){
        List<Categoria> categorias = categoriaService.getAll();
        List<Estado> estados = estadoService.getAll();
        model.addAttribute("estados", estados);
        model.addAttribute("categorias",categorias);
        return "crear_producto";
    }

    @PostMapping("/registro/producto/post")
    public String guardarProducto(@Valid ProductoDTOPlantilla productoDTOPlantilla, BindingResult errores){
        if (errores.hasErrors()){
           return "crear_producto";
        }
        ProductoDTO productoDTO = new ProductoDTO();
        CategoriaDTO categoriaDTO= new CategoriaDTO();
        EstadoDTO estadoDTO = new EstadoDTO();
        Producto producto = new Producto();
        Categoria categoria= new Categoria();
        Estado estado = new Estado();

        //categoria = categoriaService.buscarPorId(productoDTOPlantilla.getCategoria());
        //estado = estadoService.buscarPorId(productoDTOPlantilla.getEstado());

        estadoDTO.setId(productoDTOPlantilla.getEstado());
        categoriaDTO.setId(productoDTOPlantilla.getCategoria());
        productoDTO.setNombre(productoDTOPlantilla.getNombre());
        productoDTO.setStock(productoDTOPlantilla.getStock());
        productoDTO.setPrecio(productoDTOPlantilla.getPrecio());
        productoDTO.setDescripcion(productoDTOPlantilla.getDescripcion());
        productoDTO.setFechaCreacion(LocalDateTime.now());
        productoDTO.setEstado(estadoDTO);
        productoDTO.setCategoria(categoriaDTO);



        System.out.println("producto: "+productoDTO);
      productoService.save(mapper.productoDTOToProducto(productoDTO));

       return "redirect:/api/registro/categoria";
    }


}
