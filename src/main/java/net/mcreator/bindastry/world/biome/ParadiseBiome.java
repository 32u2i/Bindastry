
package net.mcreator.bindastry.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.bindastry.init.BindastryModBiomes;

public class ParadiseBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.128571428571f, 0.128571428571f),
			Climate.Parameter.span(-1.128571428571f, -0.871428571429f), Climate.Parameter.span(0.381428571429f, 0.638571428571f),
			Climate.Parameter.span(0.671428571429f, 0.928571428571f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.7643271915f, -0.507184334358f), 0);
	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(-0.39f, 1.41f), Climate.Parameter.span(-0.1f, 1.7f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1.535755762929f, 0.264244237071f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-1118482).waterColor(-855310).waterFogColor(-855310)
				.skyColor(-1118482).foliageColorOverride(-855310).grassColorOverride(-1118482)
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("bindastry:paradise")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NONE).temperature(0.5f).downfall(0f)
				.specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(BindastryModBiomes.PARADISE.get())),
				BiomeDictionary.Type.MAGICAL);
	}
}
