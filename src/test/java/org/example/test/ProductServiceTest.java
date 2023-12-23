package org.example.test;

import com.google.common.collect.Lists;
import org.example.domain.*;
import org.example.service.CustomerService;
import org.example.service.OrderService;
import org.example.service.ProductService;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created on 2020-10-30
 */
public class ProductServiceTest {

    private static ProductService productService;

    @Before
    public void init() {
        productService = new ProductService();
    }

    @Test
    public void test01() {
        // 入库一些商品
        Product product = new Product();
        product.setName("MyBatis课程-Totoro");
        product.setDescription("深入MyBatis源码的视频教程-Totoro实践");
        product.setPrice(new BigDecimal(99));
        long productId = productService.createProduct(product);
        System.out.println("create productId Totoro:" + productId);

    }
}