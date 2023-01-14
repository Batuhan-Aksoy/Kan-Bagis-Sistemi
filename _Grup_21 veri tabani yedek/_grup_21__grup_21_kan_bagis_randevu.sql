-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: _grup_21
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `_grup_21_kan_bagis_randevu`
--

DROP TABLE IF EXISTS `_grup_21_kan_bagis_randevu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `_grup_21_kan_bagis_randevu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `TCno` varchar(45) NOT NULL,
  `kan_turu` varchar(45) NOT NULL,
  `bagis_yeri` varchar(45) NOT NULL,
  `bagis_tarih` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `tc_idx` (`TCno`),
  CONSTRAINT `tcno2` FOREIGN KEY (`TCno`) REFERENCES `_grup_21_kullanicilar` (`TCno`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `_grup_21_kan_bagis_randevu`
--

LOCK TABLES `_grup_21_kan_bagis_randevu` WRITE;
/*!40000 ALTER TABLE `_grup_21_kan_bagis_randevu` DISABLE KEYS */;
INSERT INTO `_grup_21_kan_bagis_randevu` VALUES (60,'43283059914','B+','Bartın Merkez Kızılay','Thu Jan 06 21:12:57 TRT 2022');
/*!40000 ALTER TABLE `_grup_21_kan_bagis_randevu` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `bagis_sayisi` AFTER INSERT ON `_grup_21_kan_bagis_randevu` FOR EACH ROW BEGIN
DECLARE tc VARCHAR(45) DEFAULT '';
DECLARE o_id INT DEFAULT 0;
SET tc=NEW.TCno;
SELECT id INTO o_id FROM _grup_21_onemli_bagiscilar WHERE TCno=tc;
UPDATE _grup_21_onemli_bagiscilar SET  bagis_sayisi=bagis_sayisi+1 WHERE id=o_id;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-02 21:27:27
