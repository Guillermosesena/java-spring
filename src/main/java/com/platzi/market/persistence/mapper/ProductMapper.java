package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source="idProducto", target = "productId"),
            @Mapping(source="nombre", target = "name"),
            @Mapping(source="idCategoria", target = "categoryId"),
            @Mapping(source="precioVenta", target = "price"),
            @Mapping(source="cantidadStock", target= "stock"),
            @Mapping(source="estado", target= "active"),
            @Mapping(source="categoria", target= "category")
    })
    Product toProduct(Producto producto);
    //Indica que el siguiente hará el mismo mapeo
    List<Product> toProducts(List<Producto> productos);

    @InheritConfiguration
    @Mapping(target =  "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
