package net.celsiusqc.create_weaponry.fluid;

import net.celsiusqc.create_weaponry.CreateWeaponry;
import net.celsiusqc.create_weaponry.block.ModBlocks;
import net.celsiusqc.create_weaponry.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateWeaponry.MOD_ID);

    //Molten Gold
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(ModItems.MOLTEN_GOLD_BUCKET);

    //Molten Iron
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(ModItems.MOLTEN_IRON_BUCKET);
    //Molten Aquite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_AQUITE = FLUIDS.register("molten_aquite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_AQUITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_AQUITE = FLUIDS.register("flowing_molten_aquite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_AQUITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_AQUITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_AQUITE_TYPE, SOURCE_MOLTEN_AQUITE, FLOWING_MOLTEN_AQUITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_AQUITE_BLOCK)
            .bucket(ModItems.MOLTEN_AQUITE_BUCKET);
    //Molten Charoite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_CHAROITE = FLUIDS.register("molten_charoite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_CHAROITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_CHAROITE = FLUIDS.register("flowing_molten_charoite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_CHAROITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_CHAROITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_CHAROITE_TYPE, SOURCE_MOLTEN_CHAROITE, FLOWING_MOLTEN_CHAROITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_CHAROITE_BLOCK)
            .bucket(ModItems.MOLTEN_CHAROITE_BUCKET);
    //Molten diopside
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_DIOPSIDE = FLUIDS.register("molten_diopside",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DIOPSIDE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_DIOPSIDE = FLUIDS.register("flowing_molten_diopside",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DIOPSIDE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_DIOPSIDE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DIOPSIDE_TYPE, SOURCE_MOLTEN_DIOPSIDE, FLOWING_MOLTEN_DIOPSIDE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_DIOPSIDE_BLOCK)
            .bucket(ModItems.MOLTEN_DIOPSIDE_BUCKET);
    //Molten pyrope
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PYROPE = FLUIDS.register("molten_pyrope",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_PYROPE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PYROPE = FLUIDS.register("flowing_molten_pyrope",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_PYROPE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_PYROPE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_PYROPE_TYPE, SOURCE_MOLTEN_PYROPE, FLOWING_MOLTEN_PYROPE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_PYROPE_BLOCK)
            .bucket(ModItems.MOLTEN_PYROPE_BUCKET);

    //Molten Falsite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_FALSITE = FLUIDS.register("molten_falsite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_FALSITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_FALSITE = FLUIDS.register("flowing_molten_falsite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_FALSITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_FALSITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_FALSITE_TYPE, SOURCE_MOLTEN_FALSITE, FLOWING_MOLTEN_FALSITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_FALSITE_BLOCK)
            .bucket(ModItems.MOLTEN_FALSITE_BUCKET);

    //Molten Horizonite
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_HORIZONITE = FLUIDS.register("molten_horizonite",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_HORIZONITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_HORIZONITE = FLUIDS.register("flowing_molten_horizonite",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_HORIZONITE_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_HORIZONITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_HORIZONITE_TYPE, SOURCE_MOLTEN_HORIZONITE, FLOWING_MOLTEN_HORIZONITE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_HORIZONITE_BLOCK)
            .bucket(ModItems.MOLTEN_HORIZONITE_BUCKET);

    //Molten Ventium
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_VENTIUM = FLUIDS.register("molten_ventium",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_VENTIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_VENTIUM = FLUIDS.register("flowing_molten_ventium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_VENTIUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_VENTIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_VENTIUM_TYPE, SOURCE_MOLTEN_VENTIUM, FLOWING_MOLTEN_VENTIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_VENTIUM_BLOCK)
            .bucket(ModItems.MOLTEN_VENTIUM_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}