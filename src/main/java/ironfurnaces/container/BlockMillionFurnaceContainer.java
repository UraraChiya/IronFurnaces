package ironfurnaces.container;

import ironfurnaces.init.Registration;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMillionFurnaceContainer extends BlockIronFurnaceContainerBase {

    public BlockMillionFurnaceContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player) {
        super(Registration.MILLION_FURNACE_CONTAINER.get(), windowId, world, pos, playerInventory, player);
    }

    public BlockMillionFurnaceContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player, IIntArray fields) {
        super(Registration.MILLION_FURNACE_CONTAINER.get(), windowId, world, pos, playerInventory, player, fields);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(IWorldPosCallable.of(te.getWorld(), te.getPos()), playerEntity, Registration.MILLION_FURNACE.get());
    }
}
