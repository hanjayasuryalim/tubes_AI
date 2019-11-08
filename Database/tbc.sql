-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 08, 2019 at 02:05 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tbc`
--

-- --------------------------------------------------------

--
-- Table structure for table `gejala`
--

CREATE TABLE `gejala` (
  `id` int(5) NOT NULL,
  `merokok` tinyint(1) DEFAULT NULL,
  `kelembabanUdara` tinyint(1) DEFAULT NULL,
  `keadaanRumah` tinyint(1) DEFAULT NULL,
  `diabetes` tinyint(1) DEFAULT NULL,
  `hiv` tinyint(1) DEFAULT NULL,
  `batuk` tinyint(1) DEFAULT NULL,
  `sesakNafas` tinyint(1) DEFAULT NULL,
  `nyeriDada` tinyint(1) DEFAULT NULL,
  `dahak` tinyint(1) DEFAULT NULL,
  `demam` tinyint(1) DEFAULT NULL,
  `nafsuMakan` tinyint(1) DEFAULT NULL,
  `keringatMalam` tinyint(1) DEFAULT NULL,
  `turunBeratBadan` tinyint(1) DEFAULT NULL,
  `TBC` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gejala`
--

INSERT INTO `gejala` (`id`, `merokok`, `kelembabanUdara`, `keadaanRumah`, `diabetes`, `hiv`, `batuk`, `sesakNafas`, `nyeriDada`, `dahak`, `demam`, `nafsuMakan`, `keringatMalam`, `turunBeratBadan`, `TBC`) VALUES
(1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gejala`
--
ALTER TABLE `gejala`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gejala`
--
ALTER TABLE `gejala`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
