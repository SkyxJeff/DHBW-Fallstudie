-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 03. Nov 2022 um 20:05
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
  `AbwesenheitEintragNr` int(10) NOT NULL,
  `MitarbeiterID` varchar(30) NOT NULL,
  `Datum` date NOT NULL,
  `Beginn` text NOT NULL,
  `Ende` text NOT NULL,
  `Tage` int(11) NOT NULL,
  `Grund` text NOT NULL,
  `Notiz` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `abwesendheit`
--

INSERT INTO `abwesendheit` (`AbwesenheitEintragNr`, `MitarbeiterID`, `Datum`, `Beginn`, `Ende`, `Tage`, `Grund`, `Notiz`) VALUES
(103, 'bbq0006', '2022-11-02', '07.11.2022', '11.11.2022', 5, 'Urlaub', 'Bitte hier den Text eingeben'),
(104, 'bbq0006', '2022-11-03', '03.11.2022', '03.11.2022', 1, 'Illness', 'Please enter text here');

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
(49, 'bbq0001', '2022-10-24', '07:00', '1,0', '16:00', 'Büro', 47, 4, 2022, 0),
(60, 'bbq0003', '2022-10-24', '07:00', '1,0', '16:00', 'Büro', 47, 4, 2022, 0),
(61, 'bbq0003', '2022-10-25', '08:00', '1,5', '17:30', 'Büro', 47, 4, 2022, 0),
(62, 'bbq0001', '2022-10-25', '07:00', '1,0', '17:00', 'Büro', 47, 4, 2022, 0),
(73, 'bbq0001', '2022-10-17', '06:00', '1,0', '16:00', 'Büro', 46, 4, 2022, 1),
(74, 'bbq0001', '2022-10-26', '08:00', '0,5', '17:00', 'Büro', 47, 4, 2022, 0),
(75, 'bbq0001', '2022-10-27', '08:00', '2,0', '15:00', 'Büro', 47, 4, 2022, -3),
(79, 'bbq0001', '2022-10-28', '08:00', '0,5', '17:00', 'Home Office', 47, 4, 2022, 0.5),
(105, 'bbq0006', '2022-10-28', '08:00', '0,5', '16:30', 'Büro', 48, 4, 2022, 0),
(111, 'bbq0006', '2022-11-03', '08:30', '0.5', '16:30', 'Büro', 48, 4, 2022, -0.5),
(112, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(113, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(114, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(115, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(116, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(117, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(118, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(119, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(120, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0),
(121, 'null', '2022-11-03', '00:00', '0,0', '00:00', '-', 0, 0, 0, -0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `gleitzeitgrenze`
--

CREATE TABLE `gleitzeitgrenze` (
  `gleitzeitgrenzeEintragsNr` int(10) NOT NULL,
  `MitarbeiterID` varchar(30) NOT NULL,
  `Gruen` int(2) NOT NULL,
  `Gelb` int(2) NOT NULL,
  `Rot` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `gleitzeitgrenze`
--

INSERT INTO `gleitzeitgrenze` (`gleitzeitgrenzeEintragsNr`, `MitarbeiterID`, `Gruen`, `Gelb`, `Rot`) VALUES
(1, 'bbq0006', 16, 15, 30),
(2, 'bbq0001', 15, 16, 30),
(3, 'bbq0003', 16, 15, 30);

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
(1, 'bbq0001', 'Dszocker5'),
(2, 'bbq0002', '1234'),
(4, 'bbq0003', 'Dszocker6'),
(5, 'bbq0004', '1221'),
(6, 'bbq0005', '4321'),
(7, 'bbq0006', 'Dszocker4');

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
  `Wochenarbeitszeit` int(10) NOT NULL,
  `Age` int(20) NOT NULL,
  `ArbZGmax` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`Mitarbeiter_ID`, `Vorname`, `Nachname`, `Taetigkeit`, `Telefon-Nr`, `Office-Nr`, `Anschrift`, `Wochenarbeitszeit`, `Age`, `ArbZGmax`) VALUES
('bbq0001', 'Luis', 'Kirn', 'Mitarbeiter', '0123456789', '2', 'LuisWeg 41, 4711 Stuttgart', 40, 20, 10),
('bbq0002', 'Paul', 'Ebinger', 'Mitarbeiter', '0001111222', '1', 'PaulWeg 42, 4711 Stuttgart', 30, 17, 8),
('bbq0003', 'Tsvetan', 'Kolaksazov', 'Mitarbeiter', '1122334455', '3', 'ZezoWeg 1, 0711 Stuttgart', 40, 16, 8),
('bbq0006', 'Marvin', 'Haustein', 'Mitarbeiter', '0172-9398017', '187', 'lololo', 38, 20, 10);

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
  `UrlaubEintragNr` int(10) NOT NULL,
  `MitarbeiterID` varchar(30) DEFAULT NULL,
  `Urlaubsanspruch` int(11) NOT NULL,
  `UrlaubaktuellesJahr` int(11) NOT NULL,
  `Urlaubvorjahr` int(11) NOT NULL,
  `Urlaubgenommen` int(11) NOT NULL,
  `Urlaubverfuegbar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `urlaub`
--

INSERT INTO `urlaub` (`UrlaubEintragNr`, `MitarbeiterID`, `Urlaubsanspruch`, `UrlaubaktuellesJahr`, `Urlaubvorjahr`, `Urlaubgenommen`, `Urlaubverfuegbar`) VALUES
(1, 'bbq0006', 30, 3, 0, 27, 3),
(2, 'bbq0003', 30, 30, 0, 0, 30);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `abwesendheit`
--
ALTER TABLE `abwesendheit`
  ADD PRIMARY KEY (`AbwesenheitEintragNr`);

--
-- Indizes für die Tabelle `eintraege`
--
ALTER TABLE `eintraege`
  ADD PRIMARY KEY (`EintraegeNr`);

--
-- Indizes für die Tabelle `gleitzeitgrenze`
--
ALTER TABLE `gleitzeitgrenze`
  ADD PRIMARY KEY (`gleitzeitgrenzeEintragsNr`);

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
-- Indizes für die Tabelle `urlaub`
--
ALTER TABLE `urlaub`
  ADD PRIMARY KEY (`UrlaubEintragNr`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `abwesendheit`
--
ALTER TABLE `abwesendheit`
  MODIFY `AbwesenheitEintragNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;

--
-- AUTO_INCREMENT für Tabelle `eintraege`
--
ALTER TABLE `eintraege`
  MODIFY `EintraegeNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;

--
-- AUTO_INCREMENT für Tabelle `gleitzeitgrenze`
--
ALTER TABLE `gleitzeitgrenze`
  MODIFY `gleitzeitgrenzeEintragsNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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

--
-- AUTO_INCREMENT für Tabelle `urlaub`
--
ALTER TABLE `urlaub`
  MODIFY `UrlaubEintragNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
