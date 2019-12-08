/*
package com.person.shop.pms.config;
import io.shardingjdbc.core.api.ShardingDataSourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
@Slf4j
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getInstance() {
        DataSource dataSource = null;
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
            dataSource = ShardingDataSourceFactory.createDataSource(file);
        } catch (Exception e) {
            log.error("获取数据源异常"+e.getMessage());
            return null;
        }
        return  dataSource;
    }
}
*/
