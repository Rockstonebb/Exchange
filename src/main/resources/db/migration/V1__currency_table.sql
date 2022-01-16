-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.36 - MySQL Community Server (GPL)
-- Server OS:                    Linux
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------


-- Dumping structure for table exchange_default.Currency

CREATE TABLE IF NOT EXISTS currency
(
    `id`      int(11)      NOT NULL AUTO_INCREMENT,
    `name`    varchar(128) NOT NULL,
    `acronym` varchar(16)  NOT NULL,
    `symbol`  varchar(16)  NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB;


