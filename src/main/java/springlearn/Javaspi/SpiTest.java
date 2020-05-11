package springlearn.Javaspi;

import java.util.ServiceLoader;

public class SpiTest {

    public static void main(String[] args) {
        /**
         *粒度不够细
         * 只能调用配置文件里面的所有方法
         */
        ServiceLoader<SpiService> load = ServiceLoader.load(SpiService.class);
        for (SpiService spiService : load) {
            spiService.query("90");
        }
    }
}
