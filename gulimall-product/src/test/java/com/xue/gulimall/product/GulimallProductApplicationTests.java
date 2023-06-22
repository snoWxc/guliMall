package com.xue.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xue.gulimall.product.entity.BrandEntity;
import com.xue.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setName("don't learn java");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",9));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
