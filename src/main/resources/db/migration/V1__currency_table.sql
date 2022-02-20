-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.36 - MySQL Community Server (GPL)
-- Server OS:                    Linux
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------


-- Dumping structure for table exchange_default.Currency

CREATE TABLE r_currency
(
    id       BIGINT       NOT NULL,
    next     VARCHAR(255) NULL,
    previous VARCHAR(255) NULL,
    CONSTRAINT pk_r_currency PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE r_currency_results
(
    id                       BIGINT       NOT NULL,
    name                     VARCHAR(255) NULL,
    symbol                   VARCHAR(255) NULL,
    about                    VARCHAR(255) NULL,
    country                  VARCHAR(255) NULL,
    decimal_places           INT          NULL,
    enabled                  BIT(1)       NULL,
    whitepaper_link          VARCHAR(255) NULL,
    blockchain_explorer_link VARCHAR(255) NULL,
    first_announced          date         NULL,
    blockchain_detail_data   VARCHAR(255) NULL,
    consensus_detail_data    VARCHAR(255) NULL,
    block_time_detail_data   VARCHAR(255) NULL,
    algorithm_detail_data    VARCHAR(255) NULL,
    CONSTRAINT pk_r_currency_results PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET=UTF8MB4;


# inform wear skin design disease cram zero orchard opinion safe response faint