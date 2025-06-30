
package net.mcreator.onepiece.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.onepiece.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.onepiece.procedures.RedLineAdditionalGenerationConditionProcedure;

public class RedLine2Feature extends StructureFeature {
	public RedLine2Feature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!RedLineAdditionalGenerationConditionProcedure.execute(x))
			return false;
		return super.place(context);
	}
}
