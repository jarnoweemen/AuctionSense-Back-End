package org.auctionsense.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.auctionsense.domain.Product;
import org.auctionsense.service.ProductService;

import io.smallrye.mutiny.Uni;

@Path("/api/all/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {
    @Inject
    ProductService productService;

    @GET
    @Path("/category_name={name}")
    public Uni<List<Product>> allProductsByCategory(String name)
    {
        return productService.allProductsByCategory(name);
    }

}
