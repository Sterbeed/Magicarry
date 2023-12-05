package net.sterbee.magicarry.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sterbee.magicarry.Magicarry;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Magicarry.MODID);

    public static final RegistryObject<Item> STAFFS = ITEMS.register("staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOOKS = ITEMS.register("book",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
