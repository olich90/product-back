package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/products")
  public String getAllProducts(Model model) {
    List<Product> products = new ArrayList<>(productService.getAll());
    model.addAttribute("products", products);
    return "product_list";
  }
}
