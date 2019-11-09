-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2019 at 12:14 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
(1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1),
(2, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0),
(3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(4, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0),
(5, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1),
(6, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1),
(7, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1),
(8, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
(9, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0),
(10, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0),
(11, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1),
(12, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1),
(13, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0),
(14, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0),
(15, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1),
(16, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1),
(17, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0),
(18, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0),
(19, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0),
(20, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1),
(21, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1),
(22, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0),
(23, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0),
(24, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1),
(25, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1),
(26, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0),
(27, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0),
(28, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1),
(29, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0),
(30, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1),
(31, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0),
(32, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1),
(33, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1),
(34, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1),
(35, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0),
(36, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1),
(37, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0),
(38, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1),
(39, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0),
(40, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0),
(41, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0),
(42, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1),
(43, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0),
(44, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1),
(45, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(46, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0),
(47, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1),
(48, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0),
(49, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1),
(50, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1),
(51, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0),
(52, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1);

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
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
