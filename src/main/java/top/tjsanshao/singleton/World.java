package top.tjsanshao.singleton;

public class World {
    public static void main(String[] args) {
        TjSanshao tjSanshao = TjSanshao.getTjSanshao();
        tjSanshao.playGame();
        TjSanshao tjSanshaoClone = TjSanshao.getTjSanshao();
        tjSanshaoClone.playGame();

        System.out.println("=============================");

        System.out.println("Equals = " + tjSanshao.equals(tjSanshaoClone));
    }
}
