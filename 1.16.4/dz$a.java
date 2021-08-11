import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Supplier;

@FunctionalInterface
public interface a {
  Collection<String> getNames(db paramdb, Supplier<Collection<String>> paramSupplier) throws CommandSyntaxException;
}


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */