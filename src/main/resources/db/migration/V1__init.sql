CREATE TABLE IF NOT EXISTS  products
(
    id    BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    price FLOAT NOT NULL
    );

INSERT INTO products(title, price)
VALUES ('Ноутбук Lenovo', 44990),
       ('Ноутбук Dell', 66490),
       ('Ноутбук Asus', 32290),
       ('Ноутбук Aser', 32290);