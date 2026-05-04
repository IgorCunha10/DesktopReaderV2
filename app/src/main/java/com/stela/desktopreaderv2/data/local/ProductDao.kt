package com.stela.desktopreaderv2.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.stela.desktopreaderv2.data.model.Product
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {
    @Query("SELECT * FROM product ORDER BY name ASC")
    fun getAllProduct() : Flow<List<Product>>

    @Query("SELECT * FROM product WHERE tagEpc =:epc LIMIT 1 ")
    suspend fun getProductByTag(epc: String) : Product?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Update
    suspend fun updateProduct(product: Product)

}