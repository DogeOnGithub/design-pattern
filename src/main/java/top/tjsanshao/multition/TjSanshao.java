package top.tjsanshao.multition;

import java.util.HashMap;

public class TjSanshao {
    /**
     * 可将String改为其他类型
     */
    private final static HashMap<String, String> map = new HashMap<String, String>();

    static {
        map.put("programmer", "TjSanshao-for-program");
        map.put("gamer", "TjSanshao-for-game");
    }

    private TjSanshao() {

    }

    public static String getTjSanshao(String type) {
        return map.get(type);
    }
}
