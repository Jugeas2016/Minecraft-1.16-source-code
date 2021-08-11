/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.TypeAdapterFactory;
/*    */ import com.google.gson.reflect.TypeToken;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonToken;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afl
/*    */   implements TypeAdapterFactory
/*    */ {
/*    */   @Nullable
/*    */   public <T> TypeAdapter<T> create(Gson ☃, TypeToken<T> typeToken) {
/* 24 */     Class<T> clazz = typeToken.getRawType();
/* 25 */     if (!clazz.isEnum()) {
/* 26 */       return null;
/*    */     }
/*    */     
/* 29 */     Map<String, T> map = Maps.newHashMap();
/* 30 */     for (T t : clazz.getEnumConstants()) {
/* 31 */       map.put(a(t), t);
/*    */     }
/*    */     
/* 34 */     return new TypeAdapter<T>(this, map)
/*    */       {
/*    */         public void write(JsonWriter ☃, T t) throws IOException {
/* 37 */           if (t == null) {
/* 38 */             ☃.nullValue();
/*    */           } else {
/* 40 */             ☃.value(afl.a(this.b, t));
/*    */           } 
/*    */         }
/*    */ 
/*    */         
/*    */         @Nullable
/*    */         public T read(JsonReader ☃) throws IOException {
/* 47 */           if (☃.peek() == JsonToken.NULL) {
/* 48 */             ☃.nextNull();
/* 49 */             return null;
/*    */           } 
/* 51 */           return (T)this.a.get(☃.nextString());
/*    */         }
/*    */       };
/*    */   }
/*    */ 
/*    */   
/*    */   private String a(Object ☃) {
/* 58 */     if (☃ instanceof Enum) {
/* 59 */       return ((Enum)☃).name().toLowerCase(Locale.ROOT);
/*    */     }
/* 61 */     return ☃.toString().toLowerCase(Locale.ROOT);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */