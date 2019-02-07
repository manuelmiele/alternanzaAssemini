-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2019 alle 17:47
-- Versione del server: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `stogame`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `articoli`
--

CREATE TABLE IF NOT EXISTS `articoli` (
`id` int(11) NOT NULL,
  `nome` varchar(32) NOT NULL,
  `quantità` int(11) NOT NULL,
  `tipo` enum('sparatutto','sport','avventura','azione') NOT NULL,
  `piattaforma` enum('PS4','PC','SWITCH','3DS','PS3','XONE','X360') NOT NULL,
  `prezzo` decimal(10,0) NOT NULL,
  `descrizione` varchar(2048) NOT NULL,
  `copertina` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struttura della tabella `clienti`
--

CREATE TABLE IF NOT EXISTS `clienti` (
`id_cliente` int(11) NOT NULL,
  `n_carta` int(11) DEFAULT NULL,
  `mail` varchar(45) NOT NULL,
  `cognome` varchar(32) NOT NULL,
  `nome` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struttura della tabella `ordini`
--

CREATE TABLE IF NOT EXISTS `ordini` (
`id_ordine` int(11) NOT NULL,
  `time_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `id_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struttura della tabella `vendite`
--

CREATE TABLE IF NOT EXISTS `vendite` (
  `qnt_art_venduti` int(11) NOT NULL,
  `id_ord` int(11) NOT NULL,
  `id_art` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `articoli`
--
ALTER TABLE `articoli`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clienti`
--
ALTER TABLE `clienti`
 ADD PRIMARY KEY (`id_cliente`), ADD UNIQUE KEY `mail` (`mail`), ADD UNIQUE KEY `n_carta` (`n_carta`);

--
-- Indexes for table `ordini`
--
ALTER TABLE `ordini`
 ADD PRIMARY KEY (`id_ordine`), ADD KEY `id_client` (`id_client`);

--
-- Indexes for table `vendite`
--
ALTER TABLE `vendite`
 ADD PRIMARY KEY (`id_ord`,`id_art`), ADD KEY `id_art` (`id_art`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `articoli`
--
ALTER TABLE `articoli`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `clienti`
--
ALTER TABLE `clienti`
MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ordini`
--
ALTER TABLE `ordini`
MODIFY `id_ordine` int(11) NOT NULL AUTO_INCREMENT;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `ordini`
--
ALTER TABLE `ordini`
ADD CONSTRAINT `ordini_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clienti` (`id_cliente`);

--
-- Limiti per la tabella `vendite`
--
ALTER TABLE `vendite`
ADD CONSTRAINT `vendite_ibfk_1` FOREIGN KEY (`id_ord`) REFERENCES `ordini` (`id_ordine`),
ADD CONSTRAINT `vendite_ibfk_2` FOREIGN KEY (`id_art`) REFERENCES `articoli` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
