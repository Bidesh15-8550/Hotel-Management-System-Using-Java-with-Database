-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2018 at 11:44 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelm`
--

-- --------------------------------------------------------

--
-- Table structure for table `sign_up`
--

CREATE TABLE `sign_up` (
  `ID` varchar(200) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Phone` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Gender` varchar(200) NOT NULL,
  `Check_in` varchar(200) NOT NULL,
  `Check_out` varchar(200) NOT NULL,
  `Room_type1` varchar(200) NOT NULL,
  `Room_type2` varchar(200) NOT NULL,
  `Payment` varchar(200) NOT NULL,
  `Card_number` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sign_up`
--

INSERT INTO `sign_up` (`ID`, `Name`, `Phone`, `Email`, `Address`, `Gender`, `Check_in`, `Check_out`, `Room_type1`, `Room_type2`, `Payment`, `Card_number`) VALUES
('12345', 'Biki', '0123456', 'bidesh@diu', 'shukrabad', 'Male', 'Apr 4, 2018', 'Apr 13, 2018', 'A/C', 'Deluxe Room', 'Master Card', '656546');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sign_up`
--
ALTER TABLE `sign_up`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
