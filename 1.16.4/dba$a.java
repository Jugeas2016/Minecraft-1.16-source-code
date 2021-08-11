/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Set;
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
/*    */ public class a
/*    */ {
/* 51 */   private final Set<daz<?>> a = Sets.newIdentityHashSet();
/* 52 */   private final Set<daz<?>> b = Sets.newIdentityHashSet();
/*    */   
/*    */   public a a(daz<?> ☃) {
/* 55 */     if (this.b.contains(☃)) {
/* 56 */       throw new IllegalArgumentException("Parameter " + ☃.a() + " is already optional");
/*    */     }
/* 58 */     this.a.add(☃);
/* 59 */     return this;
/*    */   }
/*    */   
/*    */   public a b(daz<?> ☃) {
/* 63 */     if (this.a.contains(☃)) {
/* 64 */       throw new IllegalArgumentException("Parameter " + ☃.a() + " is already required");
/*    */     }
/* 66 */     this.b.add(☃);
/* 67 */     return this;
/*    */   }
/*    */   
/*    */   public dba a() {
/* 71 */     return new dba(this.a, this.b, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dba$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */