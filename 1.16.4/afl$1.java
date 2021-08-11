/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonToken;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends TypeAdapter<T>
/*    */ {
/*    */   null(afl ☃, Map paramMap) {}
/*    */   
/*    */   public void write(JsonWriter ☃, T t) throws IOException {
/* 37 */     if (t == null) {
/* 38 */       ☃.nullValue();
/*    */     } else {
/* 40 */       ☃.value(afl.a(this.b, t));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public T read(JsonReader ☃) throws IOException {
/* 47 */     if (☃.peek() == JsonToken.NULL) {
/* 48 */       ☃.nextNull();
/* 49 */       return null;
/*    */     } 
/* 51 */     return (T)this.a.get(☃.nextString());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afl$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */