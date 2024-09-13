package com.example.myApp.Services;

import java.util.List;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.myApp.Models.Product;
import com.example.myApp.Repositories.ProductRepo;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts(){
       return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile file) throws IOException{
        product.setImageName(file.getOriginalFilename());
        product.setImageType(file.getContentType());
        product.setImageData(file.getBytes());
        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException{
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

    public List<Product> searchProduct(String keyword) {
        return repo.searchProducts(keyword);
    }
}
