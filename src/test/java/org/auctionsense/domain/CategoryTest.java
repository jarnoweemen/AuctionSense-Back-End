package org.auctionsense.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class CategoryTest {

    @Test
    @Order(1)
    void when_set_id_is_equal_to_given_id() {
        Category category = new Category();

        category.setId(1l);

        Assertions.assertEquals(1l, category.getId());
    }

    @Test
    @Order(2)
    void when_set_name_is_equal_to_given_name() {
        Category category = new Category("");

        category.setName("Games");

        Assertions.assertEquals("Games", category.getName());
    }
}
