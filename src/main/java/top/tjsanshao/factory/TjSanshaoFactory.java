package top.tjsanshao.factory;

public class TjSanshaoFactory {
    public static TjSanshao createTjSanshao(Class<? extends TjSanshao> clz) {
        try {
            return (TjSanshao) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
