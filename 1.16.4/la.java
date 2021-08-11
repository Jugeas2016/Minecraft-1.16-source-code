/*    */ import java.util.Collection;
/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class la
/*    */ {
/*    */   private final String a;
/*    */   private final Collection<lu> b;
/*    */   @Nullable
/*    */   private final Consumer<aag> c;
/*    */   
/*    */   public la(String ☃, Collection<lu> collection, @Nullable Consumer<aag> consumer) {
/* 19 */     if (collection.isEmpty()) {
/* 20 */       throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
/*    */     }
/*    */     
/* 23 */     this.a = ☃;
/* 24 */     this.b = collection;
/* 25 */     this.c = consumer;
/*    */   }
/*    */   
/*    */   public String a() {
/* 29 */     return this.a;
/*    */   }
/*    */   
/*    */   public Collection<lu> b() {
/* 33 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(aag ☃) {
/* 37 */     if (this.c != null)
/* 38 */       this.c.accept(☃); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\la.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */