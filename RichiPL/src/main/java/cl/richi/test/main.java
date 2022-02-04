package cl.richi.test;

import cl.richi.test.comandos.Test;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    
    ConsoleCommandSender consola = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {

        new Test( this);

        consola.sendMessage( "Richi plugin Enable" );
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        consola.sendMessage( "Richi plugin Disable" );
        // Plugin shutdown logic
    }
}
