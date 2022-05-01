package helper;

import java.util.Properties;

public final class Constant {

    private static  final Properties properties = Property.getProperty().getProperties();

    public static final String LEVEL_HERO_PROPERTIES_FILE_NAME = "setting";
    public static final String PREFIX_LEVEL_NAME = "L";
    public static final String HERO_NAME_SEPARATOR = ".";
    public static final String HERO_PARAMETER_SEPARATOR = ",";

    public static final int DEFAULT_ARCHER_DAMAGE = Integer.parseInt(properties.getProperty("DefaultArcherDamage"));
    public static final int DEFAULT_WARRIOR_DAMAGE = Integer.parseInt(properties.getProperty("DefaultWarriorDamage"));
    public static final int DEFAULT_MAGE_DAMAGE = Integer.parseInt(properties.getProperty("DefaultMageDamage"));
    public static final int DEFAULT_ELF_DAMAGE = Integer.parseInt(properties.getProperty("DefaultElfDamage"));
    public static final int DEFAULT_DWARF_DAMAGE = Integer.parseInt(properties.getProperty("DefaultDwarfDamage"));

    public static final int DEFAULT_MAGE_MANA = Integer.parseInt(properties.getProperty("DefaultMageMana"));

    public static final int DEFAULT_HELMET_PROTECT = Integer.parseInt(properties.getProperty("DefaultHelmetProtect"));
    public static final int DEFAULT_CHEST_PLATE_PROTECT = Integer.parseInt(properties.getProperty("DefaultChestPlat"));
    public static final int DEFAULT_BOOTS_PROTECT = Integer.parseInt(properties.getProperty("DefaultBoots"));




    private Constant() {
        throw new  UnsupportedOperationException();
    }
}
