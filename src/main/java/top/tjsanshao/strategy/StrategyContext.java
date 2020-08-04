package top.tjsanshao.strategy;

/**
 * 队伍今天可能会使用的战略，暂且称作战略池
 */
public class StrategyContext {
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
