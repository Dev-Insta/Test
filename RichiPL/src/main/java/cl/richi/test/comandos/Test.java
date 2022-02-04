package cl.richi.test.comandos;

import cl.richi.test.main;
import cl.richi.test.utils.utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor {

    private final main plugin;

    public Test(main plugin) {
        this.plugin = plugin;
        plugin.getCommand( "test").setExecutor( plugin );
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ( sender instanceof Player){
            Player p = ( Player ) sender;
            utils.tell( p, "&cFly &6he was enable");
            p.setHealth(20);
          } else {
            utils.tell( sender , "&cFly &6he was enable");
        }
        return false;

    }
}
