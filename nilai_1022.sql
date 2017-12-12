-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.49
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1022`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1022`
--

CREATE TABLE `nilai_1022` (
  `id` int(11) NOT NULL,
  `nilai` int(11) NOT NULL,
  `cv_1022_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1022`
--

INSERT INTO `nilai_1022` (`id`, `nilai`, `cv_1022_id`) VALUES
(1, 60, 1),
(2, 100, 2),
(3, 87, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `nilai_1022`
--
ALTER TABLE `nilai_1022`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_krff06r1ybc9wwfavin480sx5` (`nilai`),
  ADD KEY `FKpaend9pb75ne91gx6hgfcik71` (`cv_1022_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `nilai_1022`
--
ALTER TABLE `nilai_1022`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1022`
--
ALTER TABLE `nilai_1022`
  ADD CONSTRAINT `FKpaend9pb75ne91gx6hgfcik71` FOREIGN KEY (`cv_1022_id`) REFERENCES `cv_1022` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
