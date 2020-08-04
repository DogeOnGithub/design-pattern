package top.tjsanshao.proxy;

/**
 * 腾讯游戏在CJ上发布游戏
 */
public class ChinaJoy {
    public static void main(String[] args) {
        TencentGames tencentGames = new TencentGames(new RiotGames());
        tencentGames.releaseGame();
    }
}
