/*    */ import com.google.common.collect.ImmutableMultimap;
/*    */ import com.google.common.collect.Multimap;
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
/*    */ public class bnf
/*    */   extends bni
/*    */   implements bno
/*    */ {
/*    */   private final float a;
/*    */   private final Multimap<arg, arj> b;
/*    */   
/*    */   public bnf(bnh ☃, int i, float f, blx.a a1) {
/* 24 */     super(☃, a1);
/*    */     
/* 26 */     this.a = i + ☃.c();
/*    */ 
/*    */     
/* 29 */     ImmutableMultimap.Builder<arg, arj> builder = ImmutableMultimap.builder();
/* 30 */     builder.put(arl.f, new arj(f, "Weapon modifier", this.a, arj.a.a));
/* 31 */     builder.put(arl.h, new arj(g, "Weapon modifier", f, arj.a.a));
/* 32 */     this.b = (Multimap<arg, arj>)builder.build();
/*    */   }
/*    */   
/*    */   public float f() {
/* 36 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/* 41 */     return !bfw1.b_();
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(bmb ☃, ceh ceh1) {
/* 46 */     if (ceh1.a(bup.aQ)) {
/* 47 */       return 15.0F;
/*    */     }
/*    */     
/* 50 */     cva cva = ceh1.c();
/* 51 */     if (cva == cva.e || cva == cva.g || cva == cva.O || ceh1.a(aed.I) || cva == cva.P) {
/* 52 */       return 1.5F;
/*    */     }
/* 54 */     return 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃, aqm aqm1, aqm aqm2) {
/* 59 */     ☃.a(1, aqm2, ☃ -> ☃.c(aqf.a));
/* 60 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃, brx brx1, ceh ceh1, fx fx1, aqm aqm1) {
/* 66 */     if (ceh1.h(brx1, fx1) != 0.0F) {
/* 67 */       ☃.a(2, aqm1, ☃ -> ☃.c(aqf.a));
/*    */     }
/* 69 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(ceh ☃) {
/* 74 */     return ☃.a(bup.aQ);
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<arg, arj> a(aqf ☃) {
/* 79 */     if (☃ == aqf.a) {
/* 80 */       return this.b;
/*    */     }
/* 82 */     return super.a(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */