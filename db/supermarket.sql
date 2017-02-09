DROP TABLE IF EXISTS order_items;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
	id SERIAL4 PRIMARY KEY,
	customer_type VARCHAR(255),
	name VARCHAR(255)
);

CREATE TABLE items (
	id SERIAL4 PRIMARY KEY,
	name VARCHAR(255),
	unit_cost DECIMAL,
	unit_price DECIMAL,
	three_for_two BOOLEAN,
	fixed_price_discount_quantity INT4,
	fixed_price DECIMAL,
	bulk_min_quantity INT4,
	bulk_discount_quantity INT4,
	bulk_discount DECIMAL
);

CREATE TABLE orders (
	id SERIAL4 PRIMARY KEY,
	customer_id INT4 REFERENCES customers(id),
	total_before_discounts DECIMAL,
	total_after_discounts DECIMAL,
	date_ref TIMESTAMP
);

CREATE TABLE order_items (
	id SERIAL4 PRIMARY KEY,
	order_id INT4 REFERENCES orders(id),
	item_id INT4 REFERENCES items(id),
	quantity INT4 default=1
);