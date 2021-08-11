import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface abj extends AutoCloseable {
  InputStream b(String paramString) throws IOException;
  
  InputStream a(abk paramabk, vk paramvk) throws IOException;
  
  Collection<vk> a(abk paramabk, String paramString1, String paramString2, int paramInt, Predicate<String> paramPredicate);
  
  boolean b(abk paramabk, vk paramvk);
  
  Set<String> a(abk paramabk);
  
  @Nullable
  <T> T a(abn<T> paramabn) throws IOException;
  
  String a();
  
  void close();
}


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */