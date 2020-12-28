package ironfurnaces.items;

import ironfurnaces.init.Registration;
import net.minecraft.block.Blocks;

public class ItemUpgradeIron extends ItemUpgrade {


    public ItemUpgradeIron(Properties properties) {
        super(properties, Blocks.FURNACE, Registration.IRON_FURNACE.get());
    }
}
