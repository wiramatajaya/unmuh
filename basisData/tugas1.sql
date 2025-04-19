-- create database mahasiswa;

-- use mahasiswa ;

-- CREATE TABLE jurusan (
-- kode_jurusan varchar(100) NOT NULL PRIMARY KEY,
-- nama_jurusan VARCHAR(25) NOT NULL,
-- ketua_jurusan VARCHAR(45) NOT NULL
-- );

-- CREATE TABLE biodata (
--     no_mhs INT PRIMARY KEY,
--     kode_jurusan varchar(100) ,
--     nama VARCHAR(100) NOT NULL,
--     nilai DECIMAL(5,2),
--     alamat VARCHAR(255),
--     jenis_kelamin ENUM('L', 'P'),
--     FOREIGN KEY (kode_jurusan) REFERENCES jurusan(kode_jurusan)
-- );

-- INSERT INTO jurusan(kode_jurusan,nama_jurusan,ketua_jurusan) VALUES
-- ("KD01","Sistem Informasi","Harnaningrum,S.Si"),
-- ("KD02","teknik Informatika","EnnySela,S.Kom.,M.Kom"),
-- ("KD03","Teknik Komputer","Berta Bednar,S.Si,M.T.");

INSERT INTO biodata(no_mhs,kode_jurusan,nama,nilai,alamat,jenis_kelamin)
values
("210089","KD01","Rina Gunawan",3,"Denpasar","P"),
("210090","KD03","Gani Suprapto",3.5,"Singaraja","L"),
("210012","KD02","Alexandra",3,"Nusa Dua","L"),
("210099","KD02","Nadine",3.2,"Gianyar","P"),
("210009","KD01","Rizal samurai",3.7,"Denpasar","L");




-- drop database mahasiswa;