package service;

import org.springframework.stereotype.Service;
import repository.ProductRepository;
import model.Product;

import java.util.List;

@Service
public class ProductService {
  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> getAll() {
    return productRepository.findAll();
  }

  public void save(Product product) {
    productRepository.save(product);
  }

  public void deleteById(Long id) {
    productRepository.deleteById(id);
  }
}
