import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface abc {
  void a();
  
  void b();
  
  CompletableFuture<Optional<String>> a(String paramString);
  
  CompletableFuture<Optional<List<String>>> a(List<String> paramList);
}


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */