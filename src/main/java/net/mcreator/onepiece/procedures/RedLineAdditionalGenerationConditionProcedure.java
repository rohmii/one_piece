package net.mcreator.onepiece.procedures;

public class RedLineAdditionalGenerationConditionProcedure {
	public static boolean execute(double x) {
		if (x < 16 && x > -16) {
			return true;
		}
		return false;
	}
}
