package top.tjsanshao.abstactFactory;

public class World {
    public static void main(String[] args) {
        TjSanshaoFactory tjSanshaoFactory = new TjSanshaoFactory();
        TjSanshao gamer = tjSanshaoFactory.createGamer();
        gamer.smile();
        gamer.cry();
    }
}
