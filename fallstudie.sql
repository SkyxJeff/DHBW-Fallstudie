-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 12. Okt 2022 um 20:53
-- Server-Version: 10.4.25-MariaDB
-- PHP-Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `fallstudie`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `eintraege`
--

CREATE TABLE `eintraege` (
  `EintraegeNr` int(10) NOT NULL,
  `Mitarbeiter_ID` varchar(30) NOT NULL,
  `Datum` date NOT NULL,
  `Beginn` time(6) NOT NULL,
  `Pause` time(6) NOT NULL,
  `Ende` time(6) NOT NULL,
  `Art` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `eintraege`
--

INSERT INTO `eintraege` (`EintraegeNr`, `Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`) VALUES
(1, 'bbq0001', '2022-10-12', '08:00:00.000000', '12:00:00.000000', '17:00:00.000000', 'Büro'),
(2, 'bbq0002', '2022-10-12', '09:00:00.000000', '12:00:00.000000', '18:00:00.000000', 'Büro'),
(4, 'bbq0001', '2022-10-12', '08:00:00.000000', '12:00:00.000000', '17:00:00.000000', 'Büro');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `login_daten_mitarbeiter`
--

CREATE TABLE `login_daten_mitarbeiter` (
  `loginID` int(20) NOT NULL,
  `Mitarbeiter_ID` varchar(50) NOT NULL,
  `Passwort` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `login_daten_mitarbeiter`
--

INSERT INTO `login_daten_mitarbeiter` (`loginID`, `Mitarbeiter_ID`, `Passwort`) VALUES
(1, 'bbq0001', '12345'),
(2, 'bbq0002', '1234');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `mitarbeiter`
--

CREATE TABLE `mitarbeiter` (
  `Mitarbeiter_ID` varchar(20) NOT NULL,
  `Vorname` varchar(40) NOT NULL,
  `Nachname` varchar(40) NOT NULL,
  `Taetigkeit` varchar(30) NOT NULL,
  `Telefon-Nr` varchar(20) NOT NULL,
  `Office-Nr` varchar(30) NOT NULL,
  `Anschrift` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`Mitarbeiter_ID`, `Vorname`, `Nachname`, `Taetigkeit`, `Telefon-Nr`, `Office-Nr`, `Anschrift`) VALUES
('bbq0001', 'Luis', 'Kirn', 'Mitarbeiter', '0123456789', '2', 'LuisWeg 41, 4711 Stuttgart'),
('bbq0002', 'Paul', 'Ebinger', 'Mitarbeiter', '0001111222', '1', 'PaulWeg 42, 4711 Stuttgart');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `eintraege`
--
ALTER TABLE `eintraege`
  ADD PRIMARY KEY (`EintraegeNr`);

--
-- Indizes für die Tabelle `login_daten_mitarbeiter`
--
ALTER TABLE `login_daten_mitarbeiter`
  ADD PRIMARY KEY (`loginID`),
  ADD UNIQUE KEY `Mitarbeiter_ID` (`Mitarbeiter_ID`);

--
-- Indizes für die Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD PRIMARY KEY (`Mitarbeiter_ID`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `eintraege`
--
ALTER TABLE `eintraege`
  MODIFY `EintraegeNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT für Tabelle `login_daten_mitarbeiter`
--
ALTER TABLE `login_daten_mitarbeiter`
  MODIFY `loginID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
