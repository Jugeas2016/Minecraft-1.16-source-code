import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

public interface a {
  Collection<cy> a(CommandContext<db> paramCommandContext) throws CommandSyntaxException;
  
  Pair<vk, Either<cy, ael<cy>>> b(CommandContext<db> paramCommandContext) throws CommandSyntaxException;
}


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ev$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */