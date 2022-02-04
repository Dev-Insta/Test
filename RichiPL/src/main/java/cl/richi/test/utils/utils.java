package cl.richi.test.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class utils {

    public static String chat( String s ){
        return ChatColor.translateAlternateColorCodes( '&', s );
    }

    public static void tell( Player p, String s){
        p.sendMessage( chat( s ));
    }

    public static void tell(CommandSender c, String s){
        c.sendMessage( chat( s ));
    }
}
