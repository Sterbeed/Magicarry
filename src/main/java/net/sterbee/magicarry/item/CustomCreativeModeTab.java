package net.sterbee.magicarry.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sterbee.magicarry.Magicarry;

public class CustomCreativeModeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Magicarry.MODID);

    public static final RegistryObject<CreativeModeTab> MAGICARRYTAB = CREATIVE_MODE_TABS.register("Magicarry_Tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STAFFS.get()))
                    .title(Component.translatable("creativetab.Magicarry_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STAFFS.get());
                        pOutput.accept(ModItems.BOOKS.get());

                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
