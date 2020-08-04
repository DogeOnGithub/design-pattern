package top.tjsanshao.proxy;

/**
 * 腾讯游戏，本身不开发游戏，但代理了英雄联盟
 */
public class TencentGames implements GameCompany {
    private GameCompany company;

    public TencentGames(GameCompany company) {
        this.company = company;
    }

    /**
     * 发布游戏，但实际上发布的是其他开发商的游戏
     */
    public void releaseGame() {
        System.out.println("--腾讯游戏发布会--");
        this.company.releaseGame();
    }
}
