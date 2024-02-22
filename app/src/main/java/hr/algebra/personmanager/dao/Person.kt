package hr.algebra.personmanager.dao

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "People")
data class Person(
    @PrimaryKey(autoGenerate = true)
    var _id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var nickname: String? = null,
    var picturePath: String? = null,
    var birthDate: LocalDate = LocalDate.now()
) {
    override fun toString() = when(nickname.isNullOrEmpty())
    {
        true -> "$firstName $lastName"
        false -> "$firstName '$nickname' $lastName"
    }
}