package com.montway.start.framework.db.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.montway.start.framework.db.model.TodoEntity

@Dao
interface TodoDao {

    @Upsert
    suspend fun create(vararg lists: TodoEntity)

    @Query("""
        SELECT * FROM todo WHERE id = :id
    """)
    suspend fun getTodoById(id: String): TodoEntity
//
//    @Query(
//        """
//        SELECT * FROM algodoeira WHERE organizacaoId = :organizacaoId AND id IN (:ids) AND isDeleted = 0 ORDER BY nome
//    """
//    )
//    fun getAlgodoeirasByIds(organizacaoId: String, ids: List<String>): Flow<List<AlgodoeiraEntity>>

}