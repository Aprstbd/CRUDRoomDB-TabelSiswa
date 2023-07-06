package com.aprisetiabudi.crudroomdb.room
import androidx.room.PrimaryKey
import androidx.room.Entity
import java.sql.Time

@Entity
data class tb_siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nisn: String,
    val nama: String,
    val alamat: String,
    val asalsekolah: String
)
