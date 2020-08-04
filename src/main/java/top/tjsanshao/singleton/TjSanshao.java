package top.tjsanshao.singleton;

/**
 * 全世界只有一个TjSanshao
 */
public class TjSanshao {
    private static final TjSanshao tjSanshao = new TjSanshao("掌控雷电");

    private String play;

    private TjSanshao(String play) {
        this.play = play;
    }

    public static TjSanshao getTjSanshao() {
        return tjSanshao;
    }

    public void playGame() {
        System.out.println(this.play);
    }
}
