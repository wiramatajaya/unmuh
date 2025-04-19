-- 1 DDL (database DEFINITION LANGUAGE)
-- CREATE TABLE & DATABASE-- 
DROP DATABASE mahasiswa;
CREATE DATABASE mahasiswa;
USE mahasiswa ;
CREATE TABLE jurusan (
kode_jurusan varchar(100) NOT NULL PRIMARY KEY, 
nama_jurusan VARCHAR(25) NOT NULL,
ketua_jurusan VARCHAR(45) NOT NULL
);

CREATE TABLE biodata (
    no_mhs INT PRIMARY KEY,
    kode_jurusan varchar(100) ,
    nama VARCHAR(100) NOT NULL,
    nilai DECIMAL(5,2),
    alamat VARCHAR(255),
    jenis_kelamin ENUM('L', 'P'),
    FOREIGN KEY (kode_jurusan) REFERENCES jurusan(kode_jurusan) ON UPDATE CASCADE
);



-- 2 DML (DATABASE MANIPULATION LANGUAGE)

-- 1 Memasukan Data baru
INSERT INTO jurusan(kode_jurusan,nama_jurusan,ketua_jurusan)
VALUES
("KD01","Sistem Informasi","Harnaningrum,S.Si"),
("KD02","Teknik Informatika","EnnySela,S.Kom.,M.Kom"),
("KD03","Teknik Komputer","Berta Bednar,S.Si,M.T.");

INSERT INTO biodata(no_mhs,kode_jurusan,nama,nilai,alamat,jenis_kelamin)
VALUES
(210089,"KD01","Rina Gunawan",3,"Denpasar","P"),
(210090,"KD03","Gani Suprapto",3.5,"Singaraja","L"),
(210012,"KD02","Alexandra",3,"Nusa Dua","L"),
(210099,"KD02","Nadine",3.2,"Gianyar","P"),
(210009,"KD01","Rizal samurai",3.7,"Denpasar","L");



-- 2 memasukan data baru
INSERT INTO jurusan(kode_jurusan,nama_jurusan,ketua_jurusan) VALUES ("KD04","Teknik Sipil","Harnaningrum,S.Si");

-- 3 Upadate data
UPDATE jurusan SET kode_jurusan = "KM01" WHERE kode_jurusan = "KD01";
UPDATE biodata SET nama = "Rina Gunawan Astuti", no_mhs = 210098, nilai = 3.3   WHERE no_mhs= 210089;










