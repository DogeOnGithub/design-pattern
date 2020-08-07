package top.tjsanshao.factory;

public class World {
    public static void main(String[] args) {
        TjSanshaoFactory.createTjSanshao(TjSanshaoGamer.class).smile();
        TjSanshaoFactory.createTjSanshao(TjSanshaoProgrammer.class).smile();
    }
}
