package top.tjsanshao.abstactFactory;

/**
 * 一个工厂，可以继续增加工厂，以生产不同的产品
 */
public class TjSanshaoFactory extends AbstractFactory {
    public TjSanshao createProgrammer() {
        return super.createTjSanshao(ProgrammerTjSanshao.class.getName());
    }

    public TjSanshao createGamer() {
        return super.createTjSanshao(GamerTjSanshao.class.getName());
    }
}
