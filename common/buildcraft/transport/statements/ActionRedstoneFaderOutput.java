/** Copyright (c) 2011-2015, SpaceToad and the BuildCraft Team http://www.mod-buildcraft.com
 * <p/>
 * BuildCraft is distributed under the terms of the Minecraft Mod Public License 1.0, or MMPL. Please check the contents
 * of the license located in http://www.mod-buildcraft.com/MMPL-1.0.txt */
package buildcraft.transport.statements;

import buildcraft.core.lib.utils.BCStringUtils;
import buildcraft.core.statements.ActionRedstoneOutput;

public class ActionRedstoneFaderOutput extends ActionRedstoneOutput {

    public final int level;

    public ActionRedstoneFaderOutput(int level) {
        super(String.format("buildcraft:redstone.output.%02d", level));
        setBuildCraftLocation("transport", String.format("triggers/redstone_%02d", level));
        this.level = level;
    }

    @Override
    public String getDescription() {
        return String.format(BCStringUtils.localize("gate.trigger.redstone.input.level"), level);
    }

    @Override
    protected int getSignalLevel() {
        return level;
    }
}
