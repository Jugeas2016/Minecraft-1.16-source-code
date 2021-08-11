/*    */ import com.google.gson.JsonElement;
/*    */ import java.util.function.Consumer;
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
/*    */ abstract class c
/*    */ {
/*    */   private final String a;
/*    */   
/*    */   public c(String ☃) {
/* 30 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public <S extends cej<?, S>> boolean a(cei<?, S> ☃, S s) {
/* 34 */     cfj<?> cfj = ☃.a(this.a);
/* 35 */     if (cfj == null) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     return a((cej<?, ?>)s, cfj);
/*    */   }
/*    */   
/*    */   protected abstract <T extends Comparable<T>> boolean a(cej<?, ?> paramcej, cfj<T> paramcfj);
/*    */   
/*    */   public abstract JsonElement a();
/*    */   
/*    */   public String b() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public void a(cei<?, ?> ☃, Consumer<String> consumer) {
/* 51 */     cfj<?> cfj = ☃.a(this.a);
/* 52 */     if (cfj == null)
/* 53 */       consumer.accept(this.a); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cm$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */