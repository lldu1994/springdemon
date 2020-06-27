package springlearn.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

// @Service先会被@ComponentScan扫描到
@Service
/**
 * 开启aop注解
 * 代替:<aop:aspectj-autoproxy/>
 */
@EnableAspectJAutoProxy
public class EnableAspectJAutoProxyBean {
}
