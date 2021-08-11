/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jl
/*    */ {
/*    */   private final bpa<?> a;
/*    */   
/*    */   public jl(bpa<?> ☃) {
/* 15 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public static jl a(bpa<?> ☃) {
/* 19 */     return new jl(☃);
/*    */   }
/*    */   
/*    */   public void a(Consumer<jf> ☃, String str) {
/* 23 */     ☃.accept(new jf(this, str)
/*    */         {
/*    */           public void a(JsonObject ☃) {}
/*    */ 
/*    */ 
/*    */           
/*    */           public bos<?> c() {
/* 30 */             return jl.a(this.b);
/*    */           }
/*    */ 
/*    */           
/*    */           public vk b() {
/* 35 */             return new vk(this.a);
/*    */           }
/*    */ 
/*    */           
/*    */           @Nullable
/*    */           public JsonObject d() {
/* 41 */             return null;
/*    */           }
/*    */ 
/*    */           
/*    */           public vk e() {
/* 46 */             return new vk("");
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */