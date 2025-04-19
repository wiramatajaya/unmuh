-- Membuat database Bernama Mahasiswa
create database mahasiswa;


use mahasiswa ;

-- membuat Table Jurusan
CREATE TABLE jurusan (
kode_jurusan varchar(100) NOT NULL PRIMARY KEY, -- kolom kode-jurusan  NOT NULL(tidak boleh kosong), PRIMARY KEY(harus unik)
nama_jurusan VARCHAR(25) NOT NULL,--kolom nama_jurusan varchar(25)(menulis karakter dengan batas maksimal 25)
ketua_jurusan VARCHAR(45) NOT NULL
);

CREATE TABLE biodata (
    no_mhs INT PRIMARY KEY,
    kode_jurusan varchar(100) ,
    nama VARCHAR(100) NOT NULL,
    nilai DECIMAL(5,2),
    alamat VARCHAR(255),
    jenis_kelamin ENUM('L', 'P'),
    FOREIGN KEY (kode_jurusan) REFERENCES jurusan(kode_jurusan)
);






-- drop database mahasiswa;