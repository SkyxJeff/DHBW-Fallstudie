-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 26. Okt 2022 um 16:28
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
-- Tabellenstruktur für Tabelle `abwesendheit`
--

CREATE TABLE `abwesendheit` (
  `MitarbeiterID` varchar(30) NOT NULL,
  `Datum` text NOT NULL,
  `Beginn` text NOT NULL,
  `Ende` text NOT NULL,
  `Grund` text NOT NULL,
  `Notiz` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `abwesendheit`
--

INSERT INTO `abwesendheit` (`MitarbeiterID`, `Datum`, `Beginn`, `Ende`, `Grund`, `Notiz`) VALUES
('187', '2022-10-25', '2022-10-25', '2022-10-31', 'Krank', 'Flo Stinkt'),
('187', '2022-10-25', '25.10.2022', '25.10.2022', 'Krank', 'ghjkfdsbgjfdhkg'),
('187', '2022-10-26', '26.10.2022', '30.11.2022', 'Berufsschule', 'Ich habe Berufsschule');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `eintraege`
--

CREATE TABLE `eintraege` (
  `EintraegeNr` int(10) NOT NULL,
  `Mitarbeiter_ID` varchar(30) NOT NULL,
  `Datum` date NOT NULL,
  `Beginn` varchar(6) NOT NULL,
  `Pause` varchar(6) NOT NULL,
  `Ende` varchar(6) NOT NULL,
  `Art` varchar(50) NOT NULL,
  `KW` int(10) NOT NULL,
  `Quartal` int(10) NOT NULL,
  `Jahr` int(10) NOT NULL,
  `Saldo` float NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `eintraege`
--

INSERT INTO `eintraege` (`EintraegeNr`, `Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`, `KW`, `Quartal`, `Jahr`, `Saldo`) VALUES
(1, 'bbq0001', '2022-10-12', '08:00', '12:00', '17:00', 'Büro', 41, 4, 2022, 0),
(2, 'bbq0001', '2022-10-13', '08:00', '11:00', '19:00', 'Büro', 41, 4, 2022, 0),
(3, 'bbq0001', '2022-10-14', '08:00', '12:00', '16:00', 'Home Office', 41, 4, 2022, 0),
(4, 'bbq0001', '2022-10-15', '07:00', '12:00', '18:00', 'Büro', 41, 4, 2022, 0),
(21, 'bbq0001', '2022-10-16', '05:00', '10:00', '14:00', 'Büro', 41, 4, 2022, 0),
(22, 'bbq0001', '2022-10-21', '07:00', '12:00', '17:00', 'Büro', 42, 4, 2022, 0),
(24, 'bbq0001', '2022-10-23', '07:30', '12:30', '17:00', 'Büro', 42, 4, 2022, 0),
(49, 'bbq0001', '2022-10-24', '07:00', '1,0', '16:00', 'Büro', 47, 4, 2022, 0),
(60, 'bbq0003', '2022-10-24', '07:00', '1,0', '16:00', 'Büro', 47, 4, 2022, 0),
(61, 'bbq0003', '2022-10-25', '08:00', '1,5', '17:30', 'Büro', 47, 4, 2022, 0),
(62, 'bbq0001', '2022-10-25', '07:00', '1,0', '17:00', 'Büro', 47, 4, 2022, 0),
(64, 'bbq0001', '2022-10-26', '07:00', '1,0', '17:00', 'Büro', 46, 4, 2022, -0.2),
(73, 'bbq0001', '2022-10-17', '06:00', '1,0', '16:00', 'Büro', 46, 4, 2022, 1),
(74, '187', '2022-10-26', '08:00', '0,5', '16:00', 'Büro', 47, 4, 2022, -0.5);

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
(2, 'bbq0002', '1234'),
(4, 'bbq0003', '112233'),
(5, 'bbq0004', '1221'),
(6, 'bbq0005', '4321'),
(7, '187', '187');

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
  `Anschrift` varchar(50) NOT NULL,
  `Wochenarbeitszeit` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`Mitarbeiter_ID`, `Vorname`, `Nachname`, `Taetigkeit`, `Telefon-Nr`, `Office-Nr`, `Anschrift`, `Wochenarbeitszeit`) VALUES
('187', 'Marvin', 'Haustein', 'Mitarbeiter', '0172-9398017', '187', 'lololo', 38),
('bbq0001', 'Luis', 'Kirn', 'Mitarbeiter', '0123456789', '2', 'LuisWeg 41, 4711 Stuttgart', 40),
('bbq0002', 'Paul', 'Ebinger', 'Mitarbeiter', '0001111222', '1', 'PaulWeg 42, 4711 Stuttgart', 30),
('bbq0003', 'Tsvetan', 'Kolaksazov', 'Mitarbeiter', '1122334455', '3', 'ZezoWeg 1, 0711 Stuttgart', 40);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `taetigkeit_bez`
--

CREATE TABLE `taetigkeit_bez` (
  `TaetigkeitNr` int(11) NOT NULL,
  `Bezeichnung` varchar(50) NOT NULL,
  `maxArbeitszeitproTag` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `taetigkeit_bez`
--

INSERT INTO `taetigkeit_bez` (`TaetigkeitNr`, `Bezeichnung`, `maxArbeitszeitproTag`) VALUES
(1, 'Mitarbeiter', '08:00 Std.'),
(2, 'Auszubildende', '08:00 Std.');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `urlaub`
--

CREATE TABLE `urlaub` (
  `MitarbeiterID` varchar(30) NOT NULL,
  `Urlaubsanspruch` int(11) NOT NULL,
  `UrlaubaktuellesJahr` int(11) NOT NULL,
  `Urlaubvorjahr` int(11) NOT NULL,
  `Urlaubgenommen` int(11) NOT NULL,
  `Urlaubverfügbar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `urlaub`
--

INSERT INTO `urlaub` (`MitarbeiterID`, `Urlaubsanspruch`, `UrlaubaktuellesJahr`, `Urlaubvorjahr`, `Urlaubgenommen`, `Urlaubverfügbar`) VALUES
('187', 30, 30, 0, 0, 30);

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
-- Indizes für die Tabelle `taetigkeit_bez`
--
ALTER TABLE `taetigkeit_bez`
  ADD PRIMARY KEY (`TaetigkeitNr`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `eintraege`
--
ALTER TABLE `eintraege`
  MODIFY `EintraegeNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT für Tabelle `login_daten_mitarbeiter`
--
ALTER TABLE `login_daten_mitarbeiter`
  MODIFY `loginID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT für Tabelle `taetigkeit_bez`
--
ALTER TABLE `taetigkeit_bez`
  MODIFY `TaetigkeitNr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
