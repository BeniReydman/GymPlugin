package commands;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;

//Import packages
import db_entities.*;

public class HelpCommand implements CommandExecutor {

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
    	//GymLeader gm = GymLeader.findFirst("id = ?", "123");
        src.sendMessage(Text.of("Hello World!"));
        return CommandResult.success();
    }
}