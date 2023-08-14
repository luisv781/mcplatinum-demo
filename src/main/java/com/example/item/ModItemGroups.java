package com.example.item;

import com.example.TemplateMod;
import com.example.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PLATINUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TemplateMod.MOD_ID, "platinum_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.platinum"))
                    .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.RAW_PLATINUM);

                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);

                        entries.add(ModItems.METAL_DETECTOR);
                    }).build());

    public static void registerItemGroups() {
        TemplateMod.LOGGER.info("Registering Item Groups for " + TemplateMod.MOD_ID);
    }

}
