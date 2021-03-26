package springlearn.transaction;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//@Component
//@EnableTransactionManagement
//@MapperScan(basePackages = "springlearn.dao", annotationClass = Repository.class)
public class EnableTransactionManagementBean {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    /**
     * 这样也可以
     */
    @Bean
    public PlatformTransactionManager platformTransactionManager(DataSource source) {

        DataSourceTransactionManager dtm = new DataSourceTransactionManager();
        dtm.setDataSource(source);
        return dtm;
    }
}
