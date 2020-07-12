package springlearn.service.area;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import springlearn.dao.CommonMapper;
import springlearn.pojo.ConsultConfigArea;
import springlearn.service.goods.GoodsService;

import java.util.List;
import java.util.Map;

@PropertySource("classpath:config/core/core.properties")
@Service
public class AreaServiceImpl implements AreaService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${jdbc.driverClassName}")
    private String driverClass;
    @Value("${jdbc.url:jdbc}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String user;
    @Value("${jdbc.password}")
    private String password;

    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    AreaService areaService;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false, rollbackFor = RuntimeException.class)
    @Override
    public String queryAreaFromDB(Map param) {
        logger.info("================从mysql里面查询数据 事务1========================");
        List<ConsultConfigArea> consultConfigAreas = commonMapper.queryAreaByAreaCode(param);
        ((AreaService)AopContext.currentProxy()).queryAreaFromRedisOne(null);
        return "OK";
    }

    @Transactional
    @Override
    public String queryAreaFromRedisOne(Map param) {
        logger.info("================从mysql里面查询数据 事务2========================");
        return "OK";
    }

    @Override
    public String queryAreaFromRedisTow(Map param) {
        return null;
    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public int addArea(ConsultConfigArea area) {
        int i = commonMapper.addArea(area);
        return i;
    }
}
