package org.d3if0010.hitungbmi.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BmiDao {
    @Insert
    fun insert(bmi: BmiEntity)
<<<<<<< HEAD
    @Query("SELECT * FROM bmi ORDER BY id DESC")
    fun getLastBmi(): LiveData<List<BmiEntity>>
    @Query("DELETE FROM bmi")
    fun clearData()
=======
    @Query("SELECT * FROM bmi ORDER BY id DESC LIMIT 1")
    fun getLastBmi(): LiveData<BmiEntity?>
>>>>>>> 2d8da1e... 3.3.Membuat database dengan Room
}