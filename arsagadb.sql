-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.29-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for register
CREATE DATABASE IF NOT EXISTS `register` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `register`;

-- Dumping structure for table register.products
CREATE TABLE IF NOT EXISTS `products` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRODUCT_NAME` varchar(50) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table register.products: ~0 rows (approximately)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` (`ID`, `PRODUCT_NAME`, `QUANTITY`, `PRICE`) VALUES
	(1, 'milo', 2, 9);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Dumping structure for table register.reg
CREATE TABLE IF NOT EXISTS `reg` (
  `FIRSTNAME` text NOT NULL,
  `LASTNAME` text NOT NULL,
  `USERNAME` text NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table register.reg: ~0 rows (approximately)
/*!40000 ALTER TABLE `reg` DISABLE KEYS */;
INSERT INTO `reg` (`FIRSTNAME`, `LASTNAME`, `USERNAME`, `PASSWORD`) VALUES
	('lk', 'lk', 'lk', 'lk');
/*!40000 ALTER TABLE `reg` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
