package io.github.thebusybiscuit.slimefun4.core.commands.subcommands;

import io.github.thebusybiscuit.cscorelib2.chat.ChatColors;
import io.github.thebusybiscuit.slimefun4.core.commands.SlimefunCommand;
import io.github.thebusybiscuit.slimefun4.core.commands.SubCommand;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

class ItemIdCommand extends SubCommand {
    protected ItemIdCommand(SlimefunPlugin plugin, SlimefunCommand cmd) {
        super(plugin, cmd, "id", false);
    }

    @Override
    public void onExecute(@NotNull CommandSender sender, String @NotNull [] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("slimefun.command.id")) {
                Player p = (Player) sender;
                ItemStack item = p.getInventory().getItemInMainHand();
                if (item.getType() != Material.AIR) {
                    SlimefunItem sfItem = SlimefunItem.getByItem(item);
                    if (sfItem != null) {
                        sender.sendMessage(ChatColors.color("The item's id: " + sfItem.getID()));
                    } else {
                        SlimefunPlugin.getLocalization().sendMessage(sender, "messages.not-valid-item", true);
                    }
                } else {
                    sender.sendMessage(ChatColors.color("&bYou have nothing in your main hand!"));
                }
            } else {
                SlimefunPlugin.getLocalization().sendMessage(sender, "messages.no-permission", true);
            }
        } else {
            SlimefunPlugin.getLocalization().sendMessage(sender, "messages.only-players", true);
        }
    }
}
