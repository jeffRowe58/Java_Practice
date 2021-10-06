CREATE TABLE ad_cat (
                        ad_id INT UNSIGNED NOT NULL,
                        categories_id INT UNSIGNED NOT NULL ,
                        FOREIGN KEY (ad_id) REFERENCES ads(id),
                        FOREIGN KEY (categories_id) REFERENCES categories(id)

);