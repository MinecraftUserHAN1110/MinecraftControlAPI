package io.github.minecraftuserhan1110.minecraftcontrolapi.utils;

import io.papermc.paper.chat.ChatRenderer;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public class ControlChat {
    public static ChatRenderer build(Player chat, String format) {
        String newchat;
        return (source, sourceDisplayName, message, viewer) -> Component.text().append(Component.text(, chat));
    }
}
