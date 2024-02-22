package hr.algebra.personmanager.dao

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

public class PersonMigration(startVersion: Int, endVersion: Int) :
    Migration(startVersion, endVersion) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE People ADD COLUMN nickname TEXT")
    }
}