import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface b {
  void parse(StringReader paramStringReader) throws CommandSyntaxException;
}


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dc$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */