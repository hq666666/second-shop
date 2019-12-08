package com.person.shop.pms;
import com.person.shop.api.pms.entity.Brand;
import com.person.shop.api.pms.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SecondShopPmsApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        //测试主从集群主节点添加数据
      /*  Brand brand = new Brand();
        brand.setName("测试");
        brandService.save(brand);
        System.out.println("添加成功");*/
       //测试主从集群从节点读取数据
        Brand brand = brandService.getById(53);
        System.out.println(brand.getName());
    }

}
