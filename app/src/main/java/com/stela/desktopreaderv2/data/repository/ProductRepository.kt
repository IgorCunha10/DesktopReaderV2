package com.stela.desktopreaderv2.data.repository

import com.stela.desktopreaderv2.data.local.ProductDao
import com.stela.desktopreaderv2.data.model.Product
import kotlinx.coroutines.flow.Flow

class ProductRepository(private val dao: ProductDao) {

    fun getAllProducts(): Flow<List<Product>> = dao.getAllProduct()
    suspend fun getProductByTag(epc: String): Product? = dao.getProductByTag(epc)
    suspend fun insertProduct(product: Product) = dao.insertProduct(product)
    suspend fun deleteProduct(product: Product) = dao.deleteProduct(product)
    suspend fun updateProduct(product: Product) = dao.updateProduct(product)

}