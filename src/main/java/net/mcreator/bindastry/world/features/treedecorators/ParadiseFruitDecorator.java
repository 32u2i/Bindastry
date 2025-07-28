package net.mcreator.bindastry.world.features.treedecorators;

public class ParadiseFruitDecorator extends CocoaDecorator {

    public static final ParadiseFruitDecorator INSTANCE = new ParadiseFruitDecorator();

    public static com.mojang.serialization.Codec<ParadiseFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        tdt.setRegistryName("paradise_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public ParadiseFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
