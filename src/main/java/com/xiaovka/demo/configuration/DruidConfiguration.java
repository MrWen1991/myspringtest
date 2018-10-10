package com.xiaovka.demo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 配置 druid 数据源
 */
@Configuration
public class DruidConfiguration {
    private Logger logger = LoggerFactory.getLogger(DruidConfiguration.class);

    @Bean
    public FilterRegistrationBean druidWebStatViewFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new WebStatFilter());
        registrationBean.addInitParameter("urlPatterns", "/*");
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*"); // 忽略资源
        return registrationBean;
    }

    @Bean
    public DataSource druidDataSource(@Value("${spring.datasource.url}") String url,
                                      @Value("${spring.datasource.driverClassName}") String driver,
                                      @Value("${spring.datasource.username}") String userName,
                                      @Value("${spring.datasource.password}") String password,
                                      @Value("${spring.datasource.maxActive}") int maxActive,
                                      @Value("${spring.datasource.filters}") String filters,
                                      @Value("${spring.datasource.initialSize}")
                                              int initialSize,
                                      @Value("${spring.datasource.minIdle}")
                                              int minIdle,
                                      @Value("${spring.datasource.maxWait}")
                                              int maxWait,
                                      @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
                                              int timeBetweenEvictionRunsMillis,
                                      @Value("${spring.datasource.minEvictableIdleTimeMillis}")
                                              int minEvictableIdleTimeMillis,
                                      @Value("${spring.datasource.validationQuery}")
                                              String validationQuery,
                                      @Value("${spring.datasource.testWhileIdle}")
                                              boolean testWhileIdle,
                                      @Value("${spring.datasource.testOnBorrow}")
                                              boolean testOnBorrow,
                                      @Value("${spring.datasource.testOnReturn}")
                                              boolean testOnReturn,
                                      @Value("${spring.datasource.poolPreparedStatements}")
                                              boolean poolPreparedStatements,
                                      @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
                                              int maxPoolPreparedStatementPerConnectionSize,
                                      @Value("${spring.datasource.connectionProperties}")
                                              String connectionProperties,
                                      @Value("${spring.datasource.useGlobalDataSourceStat}")
                                              boolean useGlobalDataSourceStat
    ) {
        DruidDataSource dataSource = new DruidDataSource();
/*数据源主要配置*/
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
/*数据源补充配置*/
        dataSource.setMaxActive(maxActive);
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        dataSource.setConnectionProperties(connectionProperties);
        dataSource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}