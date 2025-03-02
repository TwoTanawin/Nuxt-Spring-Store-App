package com.twotanwin.spring_boot_store_api.services

import com.twotanwin.spring_boot_store_api.models.Product
import com.twotanwin.spring_boot_store_api.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ProductService (private val productRepository: ProductRepository) {

    fun getAllProduct(): List<Product> = productRepository.findAll();

    fun getProductById(id:Int): Optional<Product> = productRepository.findById(id);

    fun createProduct(product: Product): Product = productRepository.save(product);

    fun updateProduct(id:Int, updateProduct: Product): Product{
        return if(productRepository.existsById(id)){
            updateProduct.id = id
            productRepository.save(updateProduct)
        }
        else{
            throw RuntimeException("Product not found with id: $id")
        }
    }

    fun deleteProduct(id:Int){
        if(productRepository.existsById(id)){
            productRepository.deleteById(id)
        }
        else{
            throw RuntimeException("Product not found with id: $id")
        }
    }
}