DROP TABLE IF EXISTS order;
DROP TABLE IF EXISTS available_pairs;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS wallet;
DROP TABLE IF EXISTS currency;
DROP TABLE IF EXISTS currency_price;
DROP TABLE IF EXISTS order_book;


CREATE TABLE order
(
    id               INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    amount           DECIMAL                        NOT NULL,
    executed         DECIMAL                        NOT NULL,
    pair             INT                            NOT NULL,
    user             INT                            NOT NULL,
    order_status     INT                            NOT NULL,
    filled_amount    INT                            NOT NULL,
    price            INT                            NOT NULL,
    transaction_type INT                            NOT NULL,
    creation_date    DATE                           NOT NULL,
    closed_date      DATE                           NOT NULL
);

CREATE TABLE available_pairs
(
    id              INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    from_currency   VARCHAR(8)                        NOT NULL UNIQUE,
    to_currency     VARCHAR(8)                        NOT NULL,
    transaction_fee DECIMAL                        NOT NULL
);

CREATE TABLE users
(
    id              INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    username        VARCHAR(32)                    NOT NULL,
    display_name    VARCHAR(32)                    NOT NULL,
    display_surname VARCHAR(32)                    NOT NULL,
    passport_id     VARCHAR(32)                    NOT NULL
);

CREATE TABLE wallet
(
    id       INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    currency INT                            NOT NULL,
    amount   DECIMAL                        NOT NULL,
    user_id  INT                            NOT NULL
);

CREATE TABLE currency
(
    id            INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    currency_name VARCHAR (8)                       NOT NULL,
    currency_code VARCHAR (8)                       NOT NULL
);

CREATE TABLE currency_price
(
    id            INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    currency_id   INT                            NOT NULL,
    creation_date DATE                           NOT NULL,
    price         DECIMAL                        NOT NULL
);

CREATE TABLE order_book
(
    id            INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    creation_date DATE                           NOT NULL,
    order_type    INT                            NOT NULL,
    price         DECIMAL                        NOT NULL,
    currency_pair INT                            NOT NULL,
    total_amount  DECIMAL                        NOT NULL,
    amount_filled INT                            NOT NULL
);

ALTER TABLE order
    ADD CONSTRAINT order_pair_available_pairs_id FOREIGN KEY (pair) REFERENCES available_pairs (id);
ALTER TABLE order
    ADD CONSTRAINT order_user_users_id FOREIGN KEY (user) REFERENCES users (id);
ALTER TABLE available_pairs
    ADD CONSTRAINT available_pairs_from_currency_currency_code FOREIGN KEY (from_currency) REFERENCES currency (code);
ALTER TABLE available_pairs
    ADD CONSTRAINT available_pairs_to_currency_currency_code FOREIGN KEY (to_currency) REFERENCES currency (code);
ALTER TABLE wallet
    ADD CONSTRAINT wallet_currency_currency_id FOREIGN KEY (currency) REFERENCES currency (id);
ALTER TABLE wallet
    ADD CONSTRAINT wallet_user_id_users_id FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE currency_price
    ADD CONSTRAINT currency_price_currency_id_currency_id FOREIGN KEY (currency_id) REFERENCES currency (id);
ALTER TABLE order_book
    ADD CONSTRAINT order_book_currency_pair_available_pairs_id FOREIGN KEY (currency_pair) REFERENCES available_pairs (id);


