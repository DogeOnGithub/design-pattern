package top.tjsanshao.abstactFactory;

public abstract class AbstractFactory implements Factory {
    protected TjSanshao createTjSanshao(String type) {
        try {
            return (TjSanshao) Class.forName(type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
