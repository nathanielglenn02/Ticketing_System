CREATE DATABASE  IF NOT EXISTS `ticketing_system_java` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `ticketing_system_java`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ticketing_system_java
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acara`
--

DROP TABLE IF EXISTS `acara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(45) NOT NULL,
  `lokasi` varchar(45) NOT NULL,
  `tanggal_acara` timestamp NOT NULL DEFAULT current_timestamp(),
  `deskripsi` text NOT NULL,
  `harga` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acara`
--

LOCK TABLES `acara` WRITE;
/*!40000 ALTER TABLE `acara` DISABLE KEYS */;
INSERT INTO `acara` VALUES (1,'Acara A','Lokasi A','2024-07-19 17:00:00','Deskripsi Acara A',50000),(2,'Acara B','Lokasi B','2024-07-20 17:00:00','Deskripsi Acara B',75000),(3,'Acara C','Lokasi C','2024-07-21 17:00:00','Deskripsi Acara C',100000),(4,'Konser Musik','Stadion Utama','2024-08-15 12:00:00','Konser musik dengan berbagai artis terkenal.',250000),(5,'Festival Makanan','Lapangan Kota','2024-09-05 03:00:00','Festival makanan dengan berbagai kuliner lokal dan internasional.',50000),(6,'Pameran Buku','Gedung Serbaguna','2024-10-10 02:00:00','Pameran buku dengan berbagai penerbit dan penulis terkenal.',30000),(7,'Seminar Teknologi','Hotel Bintang Lima','2024-11-20 02:00:00','Seminar mengenai perkembangan teknologi terbaru.',150000),(8,'Pertunjukan Teater','Gedung Kesenian','2024-12-01 11:00:00','Pertunjukan teater dengan lakon terkenal.',100000),(9,'Lomba Marathon','Kawasan Wisata','2024-12-14 23:00:00','Lomba marathon dengan rute yang menarik.',75000),(10,'Pesta Kembang Api','Pantai Indah','2024-12-31 16:00:00','Pesta kembang api menyambut tahun baru.',30000),(11,'Workshop Fotografi','Studio Foto','2024-07-25 07:00:00','Workshop untuk meningkatkan keterampilan fotografi.',200000),(12,'Pertandingan Sepak Bola','Stadion Kota','2024-08-20 10:00:00','Pertandingan sepak bola antara tim lokal.',100000),(13,'Festival Film','Bioskop Terdekat','2024-09-15 09:00:00','Festival film dengan pemutaran film-film indie.',50000);
/*!40000 ALTER TABLE `acara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `history_transaksi`
--

DROP TABLE IF EXISTS `history_transaksi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `history_transaksi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jumlah` double NOT NULL,
  `users_id` int(11) NOT NULL,
  `is_topup` tinyint(4) NOT NULL,
  `nota_acara_id` int(11) DEFAULT NULL,
  `nota_parkir_id` int(11) DEFAULT NULL,
  `topup_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_saldo_users1_idx` (`users_id`),
  KEY `fk_saldo_nota_acara1_idx` (`nota_acara_id`),
  KEY `fk_saldo_nota_parkir1_idx` (`nota_parkir_id`),
  CONSTRAINT `fk_saldo_nota_acara1` FOREIGN KEY (`nota_acara_id`) REFERENCES `nota_acara` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_saldo_nota_parkir1` FOREIGN KEY (`nota_parkir_id`) REFERENCES `nota_parkir` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_saldo_users1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history_transaksi`
--

LOCK TABLES `history_transaksi` WRITE;
/*!40000 ALTER TABLE `history_transaksi` DISABLE KEYS */;
INSERT INTO `history_transaksi` VALUES (1,50000,1,0,1,NULL,NULL),(2,5000,1,0,NULL,1,NULL);
/*!40000 ALTER TABLE `history_transaksi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jam_parkir`
--

DROP TABLE IF EXISTS `jam_parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jam_parkir` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jam_parkir`
--

LOCK TABLES `jam_parkir` WRITE;
/*!40000 ALTER TABLE `jam_parkir` DISABLE KEYS */;
INSERT INTO `jam_parkir` VALUES (1,'00:00:00','01:00:00'),(2,'01:00:00','02:00:00'),(3,'02:00:00','03:00:00'),(4,'03:00:00','04:00:00'),(5,'04:00:00','05:00:00'),(6,'05:00:00','06:00:00'),(7,'06:00:00','07:00:00'),(8,'07:00:00','08:00:00'),(9,'08:00:00','09:00:00'),(10,'09:00:00','10:00:00'),(11,'10:00:00','11:00:00'),(12,'11:00:00','12:00:00'),(13,'12:00:00','13:00:00'),(14,'13:00:00','14:00:00'),(15,'14:00:00','15:00:00'),(16,'15:00:00','16:00:00'),(17,'16:00:00','17:00:00'),(18,'17:00:00','18:00:00'),(19,'18:00:00','19:00:00'),(20,'19:00:00','20:00:00'),(21,'20:00:00','21:00:00'),(22,'21:00:00','22:00:00'),(23,'22:00:00','23:00:00'),(24,'23:00:00','00:00:00');
/*!40000 ALTER TABLE `jam_parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nota_acara`
--

DROP TABLE IF EXISTS `nota_acara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nota_acara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `users_id` int(11) NOT NULL,
  `Acara_id` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` double NOT NULL,
  `tanggal_transaksi` timestamp NOT NULL DEFAULT current_timestamp(),
  `status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_users_has_Acara_Acara1_idx` (`Acara_id`),
  KEY `fk_users_has_Acara_users_idx` (`users_id`),
  CONSTRAINT `fk_users_has_Acara_Acara1` FOREIGN KEY (`Acara_id`) REFERENCES `acara` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_users_has_Acara_users` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nota_acara`
--

LOCK TABLES `nota_acara` WRITE;
/*!40000 ALTER TABLE `nota_acara` DISABLE KEYS */;
INSERT INTO `nota_acara` VALUES (1,1,1,1,50000,'2024-07-11 09:48:11',0);
/*!40000 ALTER TABLE `nota_acara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nota_parkir`
--

DROP TABLE IF EXISTS `nota_parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nota_parkir` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal_transaksi` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `users_id` int(11) NOT NULL,
  `tanggal_booking` date NOT NULL,
  `slot_parkir_parkir_id` int(11) NOT NULL,
  `slot_parkir_kode` varchar(45) NOT NULL,
  `jam_parkir_id` int(11) NOT NULL,
  `harga` double NOT NULL,
  PRIMARY KEY (`tanggal_booking`,`slot_parkir_parkir_id`,`slot_parkir_kode`,`jam_parkir_id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_posisi_has_users_users1_idx` (`users_id`),
  KEY `fk_nota_parkir_slot_parkir1_idx` (`slot_parkir_parkir_id`,`slot_parkir_kode`),
  KEY `fk_nota_parkir_jam_parkir1_idx` (`jam_parkir_id`),
  CONSTRAINT `fk_nota_parkir_jam_parkir1` FOREIGN KEY (`jam_parkir_id`) REFERENCES `jam_parkir` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_nota_parkir_slot_parkir1` FOREIGN KEY (`slot_parkir_parkir_id`, `slot_parkir_kode`) REFERENCES `slot_parkir` (`parkir_id`, `kode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_posisi_has_users_users1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nota_parkir`
--

LOCK TABLES `nota_parkir` WRITE;
/*!40000 ALTER TABLE `nota_parkir` DISABLE KEYS */;
INSERT INTO `nota_parkir` VALUES (1,'2024-07-11 09:48:28',1,'2024-07-11',1,'A1',2,5000);
/*!40000 ALTER TABLE `nota_parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parkir`
--

DROP TABLE IF EXISTS `parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parkir` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(45) NOT NULL,
  `lokasi` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parkir`
--

LOCK TABLES `parkir` WRITE;
/*!40000 ALTER TABLE `parkir` DISABLE KEYS */;
INSERT INTO `parkir` VALUES (1,'Parkir A','Lokasi A'),(2,'Parkir B','Lokasi B'),(3,'Parkir C','Lokasi C'),(4,'Parkir D','Lokasi D'),(5,'Parkir E','Lokasi E'),(6,'Parkir F','Lokasi F'),(7,'Parkir G','Lokasi G'),(8,'Parkir H','Lokasi H'),(9,'Parkir I','Lokasi I'),(10,'Parkir J','Lokasi J'),(11,'Parkir K','Lokasi K'),(12,'Parkir L','Lokasi L'),(13,'Parkir M','Lokasi M'),(14,'Parkir N','Lokasi N'),(15,'Parkir O','Lokasi O'),(16,'Parkir P','Lokasi P'),(17,'Parkir Q','Lokasi Q'),(18,'Parkir R','Lokasi R'),(19,'Parkir S','Lokasi S'),(20,'Parkir T','Lokasi T');
/*!40000 ALTER TABLE `parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `slot_parkir`
--

DROP TABLE IF EXISTS `slot_parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `slot_parkir` (
  `parkir_id` int(11) NOT NULL,
  `kode` varchar(45) NOT NULL,
  `harga` double NOT NULL,
  PRIMARY KEY (`parkir_id`,`kode`),
  KEY `fk_posisi_parkir1_idx` (`parkir_id`),
  CONSTRAINT `fk_posisi_parkir1` FOREIGN KEY (`parkir_id`) REFERENCES `parkir` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `slot_parkir`
--

LOCK TABLES `slot_parkir` WRITE;
/*!40000 ALTER TABLE `slot_parkir` DISABLE KEYS */;
INSERT INTO `slot_parkir` VALUES (1,'A1',5000),(1,'A10',5000),(1,'A2',5000),(1,'A3',5000),(1,'A4',5000),(1,'A5',5000),(1,'A6',5000),(1,'A7',5000),(1,'A8',5000),(1,'A9',5000),(2,'B1',7000),(2,'B10',6000),(2,'B2',7000),(2,'B3',6000),(2,'B4',6000),(2,'B5',6000),(2,'B6',6000),(2,'B7',6000),(2,'B8',6000),(2,'B9',6000),(3,'C1',10000),(3,'C10',7000),(3,'C2',10000),(3,'C3',7000),(3,'C4',7000),(3,'C5',7000),(3,'C6',7000),(3,'C7',7000),(3,'C8',7000),(3,'C9',7000),(4,'D1',8000),(4,'D10',8000),(4,'D2',8000),(4,'D3',8000),(4,'D4',8000),(4,'D5',8000),(4,'D6',8000),(4,'D7',8000),(4,'D8',8000),(4,'D9',8000),(5,'E1',9000),(5,'E10',9000),(5,'E2',9000),(5,'E3',9000),(5,'E4',9000),(5,'E5',9000),(5,'E6',9000),(5,'E7',9000),(5,'E8',9000),(5,'E9',9000),(6,'F1',10000),(6,'F10',10000),(6,'F2',10000),(6,'F3',10000),(6,'F4',10000),(6,'F5',10000),(6,'F6',10000),(6,'F7',10000),(6,'F8',10000),(6,'F9',10000),(7,'G1',11000),(7,'G10',11000),(7,'G2',11000),(7,'G3',11000),(7,'G4',11000),(7,'G5',11000),(7,'G6',11000),(7,'G7',11000),(7,'G8',11000),(7,'G9',11000),(8,'H1',12000),(8,'H10',12000),(8,'H2',12000),(8,'H3',12000),(8,'H4',12000),(8,'H5',12000),(8,'H6',12000),(8,'H7',12000),(8,'H8',12000),(8,'H9',12000),(9,'I1',13000),(9,'I10',13000),(9,'I2',13000),(9,'I3',13000),(9,'I4',13000),(9,'I5',13000),(9,'I6',13000),(9,'I7',13000),(9,'I8',13000),(9,'I9',13000),(10,'J1',14000),(10,'J10',14000),(10,'J2',14000),(10,'J3',14000),(10,'J4',14000),(10,'J5',14000),(10,'J6',14000),(10,'J7',14000),(10,'J8',14000),(10,'J9',14000),(11,'K1',15000),(11,'K10',15000),(11,'K2',15000),(11,'K3',15000),(11,'K4',15000),(11,'K5',15000),(11,'K6',15000),(11,'K7',15000),(11,'K8',15000),(11,'K9',15000),(12,'L1',16000),(12,'L10',16000),(12,'L2',16000),(12,'L3',16000),(12,'L4',16000),(12,'L5',16000),(12,'L6',16000),(12,'L7',16000),(12,'L8',16000),(12,'L9',16000),(13,'M1',17000),(13,'M10',17000),(13,'M2',17000),(13,'M3',17000),(13,'M4',17000),(13,'M5',17000),(13,'M6',17000),(13,'M7',17000),(13,'M8',17000),(13,'M9',17000),(14,'N1',18000),(14,'N10',18000),(14,'N2',18000),(14,'N3',18000),(14,'N4',18000),(14,'N5',18000),(14,'N6',18000),(14,'N7',18000),(14,'N8',18000),(14,'N9',18000),(15,'O1',19000),(15,'O10',19000),(15,'O2',19000),(15,'O3',19000),(15,'O4',19000),(15,'O5',19000),(15,'O6',19000),(15,'O7',19000),(15,'O8',19000),(15,'O9',19000),(16,'P1',20000),(16,'P10',20000),(16,'P2',20000),(16,'P3',20000),(16,'P4',20000),(16,'P5',20000),(16,'P6',20000),(16,'P7',20000),(16,'P8',20000),(16,'P9',20000),(17,'Q1',21000),(17,'Q10',21000),(17,'Q2',21000),(17,'Q3',21000),(17,'Q4',21000),(17,'Q5',21000),(17,'Q6',21000),(17,'Q7',21000),(17,'Q8',21000),(17,'Q9',21000),(18,'R1',22000),(18,'R10',22000),(18,'R2',22000),(18,'R3',22000),(18,'R4',22000),(18,'R5',22000),(18,'R6',22000),(18,'R7',22000),(18,'R8',22000),(18,'R9',22000),(19,'S1',23000),(19,'S10',23000),(19,'S2',23000),(19,'S3',23000),(19,'S4',23000),(19,'S5',23000),(19,'S6',23000),(19,'S7',23000),(19,'S8',23000),(19,'S9',23000),(20,'T1',24000),(20,'T10',24000),(20,'T2',24000),(20,'T3',24000),(20,'T4',24000),(20,'T5',24000),(20,'T6',24000),(20,'T7',24000),(20,'T8',24000),(20,'T9',24000);
/*!40000 ALTER TABLE `slot_parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(256) NOT NULL,
  `saldo` int(11) NOT NULL,
  `no_telp` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'user1','7c6a180b36896a0a8c02787eeafb0e4c',2080000,'08123456789','user1@example.com'),(2,'user2','6cb75f652a9b52798eb6cf2201057c73',150000,'08223456789','user2@example.com'),(3,'user3','819b0643d6b89dc9b579fdfc9094f28e',200000,'08323456789','user3@example.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-11 17:12:31
