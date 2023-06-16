package net.mcreator.onepiece.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class SnailMenuThisGUIIsOpenedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.get("text:sendernumber") instanceof EditBox _tf)
			_tf.setValue((entity.getPersistentData().getString("number")));
	}
}
