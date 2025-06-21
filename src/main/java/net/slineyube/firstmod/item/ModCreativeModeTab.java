package net.slineyube.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOD_TAB_1 = new CreativeModeTab("modtab_1") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        }
    };

    public static final CreativeModeTab MOD_TAB_2 = new CreativeModeTab("modtab_2") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_ZIRCON.get());
        }
    };
}
