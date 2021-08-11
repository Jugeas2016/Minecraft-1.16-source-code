/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djj
/*    */   extends dkc
/*    */ {
/*    */   private final Predicate<dkd> Y;
/*    */   private final BiConsumer<dkd, Boolean> Z;
/*    */   @Nullable
/*    */   private final nr aa;
/*    */   
/*    */   public djj(String ☃, Predicate<dkd> predicate, BiConsumer<dkd, Boolean> biConsumer) {
/* 19 */     this(☃, (nr)null, predicate, biConsumer);
/*    */   }
/*    */   
/*    */   public djj(String ☃, @Nullable nr nr1, Predicate<dkd> predicate, BiConsumer<dkd, Boolean> biConsumer) {
/* 23 */     super(☃);
/* 24 */     this.Y = predicate;
/* 25 */     this.Z = biConsumer;
/* 26 */     this.aa = nr1;
/*    */   }
/*    */   
/*    */   public void a(dkd ☃, String str) {
/* 30 */     a(☃, "true".equals(str));
/*    */   }
/*    */   
/*    */   public void a(dkd ☃) {
/* 34 */     a(☃, !b(☃));
/*    */     
/* 36 */     ☃.b();
/*    */   }
/*    */   
/*    */   private void a(dkd ☃, boolean bool) {
/* 40 */     this.Z.accept(☃, Boolean.valueOf(bool));
/*    */   }
/*    */   
/*    */   public boolean b(dkd ☃) {
/* 44 */     return this.Y.test(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public dlh a(dkd ☃, int i, int j, int k) {
/* 49 */     if (this.aa != null) {
/* 50 */       a((djz.C()).g.b(this.aa, 200));
/*    */     }
/* 52 */     return new dlw(i, j, k, 20, this, c(☃), dlj1 -> {
/*    */           a(☃);
/*    */           dlj1.a(c(☃));
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr c(dkd ☃) {
/* 60 */     return nq.a(a(), b(☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */