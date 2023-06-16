package net.mcreator.onepiece.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class SnailMenuThisGUIIsOpenedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.get("text:sendernumber") instanceof EditBox _tf)
			_tf.setValue((entity.getPersistentData().getString("number")));
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((entity.getPersistentData().getString("number"))), false);
		if (guistate.get("text:message") instanceof EditBox _tf)
			_tf.setValue("");
		if (guistate.get("text:recievernumber") instanceof EditBox _tf)
			_tf.setValue("");
	}
}
