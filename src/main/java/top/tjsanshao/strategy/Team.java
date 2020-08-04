package top.tjsanshao.strategy;

/**
 * 队伍执行战略
 */
public class Team {
    public static void main(String[] args) {
        StrategyContext context;

        // 用打团战略
        context = new StrategyContext(new GroupStrategy());
        context.operate();

        System.out.println("============================");

        // 用分带战略
        context = new StrategyContext(new GuerrillaStrategy());
        context.operate();
    }
}
