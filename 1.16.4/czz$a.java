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
/*    */   extends dai.a<czz.a>
/*    */ {
/*    */   private final buo a;
/* 68 */   private final Set<cfj<?>> b = Sets.newHashSet();
/*    */   
/*    */   private a(buo ☃) {
/* 71 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public a a(cfj<?> ☃) {
/* 75 */     if (!this.a.m().d().contains(☃)) {
/* 76 */       throw new IllegalStateException("Property " + ☃ + " is not present on block " + this.a);
/*    */     }
/* 78 */     this.b.add(☃);
/* 79 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   protected a a() {
/* 84 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public daj b() {
/* 89 */     return new czz(g(), this.a, this.b, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */