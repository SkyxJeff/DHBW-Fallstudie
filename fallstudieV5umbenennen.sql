-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 27. Okt 2022 um 15:24
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
  `Datum` text NOT NULL,
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
(1, '187', '2022-10-26', '26.10.2022', '27.10.2022', 1, 'Krank', 'lol'),
(2, '187', '2022-10-26', '26.10.2022', '30.10.2022', 4, 'Urlaub', 'Urlaub weil Bock'),
(3, '187', '2022-10-26', '26.10.2022', '12.11.2022', 17, 'Urlaub', 'Bitte hier den Text eingeben'),
(4, '187', '2022-10-26', '26.10.2022', '26.10.2022', 0, 'Krank', 'Bitte hier den Text eingeben'),
(5, '187', '2022-10-26', '26.10.2022', '26.10.2022', 0, 'Krank', 'Bitte hier den Text eingeben'),
(6, '187', '2022-10-26', '26.10.2022', '26.10.2022', 0, 'Krank', 'Bitte hier den Text eingeben'),
(7, '187', '2022-10-26', '26.10.2022', '26.10.2022', 0, 'Krank', 'Bitte hier den Text eingeben'),
(8, '187', '2022-10-26', '26.10.2022', '26.10.2022', 0, 'Krank', 'Bitte hier den Text eingeben'),
(9, '187', '2022-10-26', '26.10.2022', '26.10.2022', 1, 'Krank', 'Bitte hier den Text eingeben'),
(10, '187', '2022-10-26', '26.10.2022', '27.10.2022', 1, 'Krank', 'Bitte hier den Text eingeben'),
(11, '187', '2022-10-26', '26.10.2022', '27.10.2022', 2, 'Krank', 'Bitte hier den Text eingeben'),
(12, '187', '2022-10-26', '26.10.2022', '28.10.2022', 3, 'Krank', 'Bitte hier den Text eingeben');

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
(73, 'bbq0001', '2022-10-17', '06:00', '1,0', '16:00', 'Büro', 46, 4, 2022, 1),
(74, 'bbq0001', '2022-10-26', '07:00', '1,0', '16:00', 'Büro', 47, 4, 2022, -0),
(75, 'bbq0001', '2022-10-27', '07:00', '1,0', '17:00', 'Büro', 47, 4, 2022, -2.4);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `gleitzeitgrenze`
--

CREATE TABLE `gleitzeitgrenze` (
  `gleitzeitgrenzeEintragsNr` int(10) NOT NULL,
  `MitarbeiterID` varchar(30) NOT NULL,
  `Grün` int(2) NOT NULL,
  `Gelb` int(2) NOT NULL,
  `Rot` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `gleitzeitgrenze`
--

INSERT INTO `gleitzeitgrenze` (`gleitzeitgrenzeEintragsNr`, `MitarbeiterID`, `Grün`, `Gelb`, `Rot`) VALUES
(1, '187', 15, 16, 30),
(2, 'bbq0001', 15, 16, 30);

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
  `Wochenarbeitszeit` int(10) NOT NULL,
  `Age` int(20) NOT NULL,
  `ArbZGmax` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`Mitarbeiter_ID`, `Vorname`, `Nachname`, `Taetigkeit`, `Telefon-Nr`, `Office-Nr`, `Anschrift`, `Wochenarbeitszeit`, `Age`, `ArbZGmax`) VALUES
('187', 'Marvin', 'Haustein', 'Mitarbeiter', '0172-9398017', '187', 'lololo', 38, 20, 10),
('bbq0001', 'Luis', 'Kirn', 'Mitarbeiter', '0123456789', '2', 'LuisWeg 41, 4711 Stuttgart', 40, 20, 10),
('bbq0002', 'Paul', 'Ebinger', 'Mitarbeiter', '0001111222', '1', 'PaulWeg 42, 4711 Stuttgart', 30, 17, 8),
('bbq0003', 'Tsvetan', 'Kolaksazov', 'Mitarbeiter', '1122334455', '3', 'ZezoWeg 1, 0711 Stuttgart', 40, 16, 8);

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

INSERT INTO `urlaub` (`UrlaubEintragNr`, `MitarbeiterID`, `Urlaubsanspruch`, `UrlaubaktuellesJahr`, `Urlaubvorjahr`, `Urlaubgenommen`, `Urlaubverfügbar`) VALUES
(1, '187', 30, 9, 0, 21, 9);

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
  MODIFY `AbwesenheitEintragNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT für Tabelle `eintraege`
--
ALTER TABLE `eintraege`
  MODIFY `EintraegeNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;

--
-- AUTO_INCREMENT für Tabelle `gleitzeitgrenze`
--
ALTER TABLE `gleitzeitgrenze`
  MODIFY `gleitzeitgrenzeEintragsNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
  MODIFY `UrlaubEintragNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
