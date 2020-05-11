package springlearn.Javaspi;

public class SpiServiceImpl implements SpiService {
    @Override
    public String query(String param) {
        System.out.println("=======SpiServiceImpl.query======");
        return "OK";
    }
}
