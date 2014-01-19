package arcade;

import java.util.Arrays;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Book extends JavaPlugin implements Listener {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("helpbook")) {
			if (sender instanceof Player) {
				ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
				BookMeta bm = (BookMeta)book.getItemMeta();
				bm.setPages(Arrays.asList("Test"));
				bm.setAuthor(ChatColor.BLUE + "DestinyRealm");
				bm.setTitle(ChatColor.BLUE + "Welcome To The Arcade");
				book.setItemMeta(bm);
				((Player) sender).getInventory().addItem(book);
			}
			
		}
		return false;
	}

}
