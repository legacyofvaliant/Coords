package meechapooch.coords.commands;

import meechapooch.coords.Coords;
import meechapooch.coords.database.PlayerProfile;
import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public class ReloadCommand implements SubCommand {
    @Override
    public boolean isConsoleCompatible() {
        return true;
    }

    @Override
    public String run(CommandSender sender, PlayerProfile profile, String[] args) {
        Coords.plugin.reloadConfig();
        return "Config reloaded!";
    }

    @Override
    public List<String> autoComplete(CommandSender sender, PlayerProfile profile, String[] args) {
        return Collections.emptyList();
    }
}
