-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 10, 2022 at 08:42 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `futas`
--

-- --------------------------------------------------------

--
-- Table structure for table `naplo`
--

CREATE TABLE `naplo` (
  `futasID` int(11) NOT NULL,
  `datum` date NOT NULL,
  `tav` int(11) NOT NULL,
  `ido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

--
-- Dumping data for table `naplo`
--

INSERT INTO `naplo` (`futasID`, `datum`, `tav`, `ido`) VALUES
(1, '2019-02-01', 1000, 400),
(2, '2019-02-08', 1100, 435),
(3, '2019-02-15', 1200, 446),
(4, '2019-02-22', 1300, 462),
(5, '2019-03-01', 1400, 502),
(6, '2019-03-08', 1500, 540),
(7, '2019-03-15', 1600, 559),
(8, '2019-03-22', 1700, 610),
(9, '2019-03-29', 1800, 619),
(10, '2019-03-30', 2000, 700);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `naplo`
--
ALTER TABLE `naplo`
  ADD PRIMARY KEY (`futasID`),
  ADD UNIQUE KEY `datum` (`datum`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `naplo`
--
ALTER TABLE `naplo`
  MODIFY `futasID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
