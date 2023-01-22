INSERT INTO categories (id, name) VALUES ('1243258291', 'Games');
INSERT INTO categories (id, name) VALUES ('5293949210', 'Cars');

INSERT INTO genres (id, name) VALUES ('4231942931', 'Fantasy');
INSERT INTO genres (id, name) VALUES ('5202023929', 'Action');
INSERT INTO genres (id, name) VALUES ('1025932506', 'Electric');
INSERT INTO genres (id, name) VALUES ('4102050629', 'Diesel');

INSERT INTO categories_genres (category_id, genre_id) VALUES ('1243258291', '4231942931');
INSERT INTO categories_genres (category_id, genre_id) VALUES ('1243258291', '5202023929');
INSERT INTO categories_genres (category_id, genre_id) VALUES ('5293949210', '1025932506');
INSERT INTO categories_genres (category_id, genre_id) VALUES ('5293949210', '4102050629');

INSERT INTO products (id, name, description, price, views, category_id) VALUES ('3528396035', 'Minecraft', 'Minecraft is a game about a man named Steve that has to survive in a block world. Craft your items by gathering different resources, build wherever you want and what you want.', '5.00', '0', '1243258291');