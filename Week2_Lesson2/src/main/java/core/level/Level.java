package core.level;

import core.hero.*;
import helper.Constant;
import helper.Property;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public enum Level {
    L1(getHeroMapOnLevel(1)),
    L2(getHeroMapOnLevel(2)),
    L3(getHeroMapOnLevel(3)),
    L4(getHeroMapOnLevel(4)),
    L5(getHeroMapOnLevel(5));

    private final Map<String, Tuple> heroMap;

    Level(Map<String, Tuple> heroMap) {
        this.heroMap = heroMap;
    }

    public Tuple getTuple(Hero hero) {
        return heroMap.get(hero.getClass().getSimpleName());
    }

    private static Map<String, Tuple> getHeroMapOnLevel(int level) {

        Properties properties = Property.getProperty().getProperties();

        Map<String, Tuple> heroMapOnLevel = new HashMap<>();

        for (Object o : properties.keySet()) {

            String nameHero = (String) o;

            if (nameHero.startsWith(Constant.PREFIX_LEVEL_NAME.concat(Integer.toString(level)))) {
                int index = nameHero.indexOf(Constant.HERO_NAME_SEPARATOR);
                String[] heroParams = properties.getProperty(nameHero).split(Constant.HERO_PARAMETER_SEPARATOR);
                float deltaHealth = Float.parseFloat(heroParams[0]);
                float deltaDamage = Float.parseFloat(heroParams[1]);
                heroMapOnLevel.put(nameHero.substring(++index), new Tuple(deltaHealth, deltaDamage));
            }
        }

        return heroMapOnLevel;
    }
}

// делал еще такую реализацию не знаю какая лучше работает
//этот комментарий оставил только в учебных целях,
// в реальном коде конечно такие коментарии делать нельзя
//
//        for (String s : properties.stringPropertyNames()){
//            if(s.startsWith("L".concat(Integer.toString(level)))){
//                int index = s.indexOf(".");
//                String[] heroParams = properties.getProperty(s).split(",");
//                float deltaHealth = Float.parseFloat(heroParams[0]);
//                float deltaDamage = Float.parseFloat(heroParams[1]);
//                heroMapOnLevel.put(s.substring(++index), new Tuple(deltaHealth, deltaDamage));
//            }
//        }
