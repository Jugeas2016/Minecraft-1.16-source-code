/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dol
/*    */   extends dot
/*    */ {
/*    */   protected final dot a;
/*    */   protected final dkd b;
/*    */   
/*    */   public dol(dot ☃, dkd dkd1, nr nr1) {
/* 19 */     super(nr1);
/* 20 */     this.a = ☃;
/* 21 */     this.b = dkd1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 26 */     this.i.k.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void at_() {
/* 31 */     this.i.a(this.a);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static List<afa> a(dlx ☃, int i, int j) {
/* 36 */     Optional<dlh> optional = ☃.c(i, j);
/* 37 */     if (optional.isPresent() && optional.get() instanceof dmd) {
/* 38 */       Optional<List<afa>> optional1 = ((dmd)optional.get()).d();
/* 39 */       return optional1.orElse(null);
/*    */     } 
/* 41 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */