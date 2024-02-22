package hr.algebra.personmanager.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonDao {
    @Query("select * from People")
    fun getPeople(): MutableList<Person>

    @Query("select * from People where _id=:id")
    fun getPerson(id: Long): Person?

    @Insert
    fun insert(person: Person)
    @Update
    fun update(person: Person)
    @Delete
    fun delete(person: Person)

}