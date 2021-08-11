/*    */ import com.google.common.collect.ImmutableMultimap;
/*    */ import com.google.common.collect.Multimap;
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
/*    */ public class bkv
/*    */   extends bni
/*    */   implements bno
/*    */ {
/*    */   private final Set<buo> a;
/*    */   protected final float b;
/*    */   private final float c;
/*    */   private final Multimap<arg, arj> d;
/*    */   
/*    */   protected bkv(float ☃, float f1, bnh bnh1, Set<buo> set, blx.a a1) {
/* 24 */     super(bnh1, a1);
/* 25 */     this.a = set;
/* 26 */     this.b = bnh1.b();
/* 27 */     this.c = ☃ + bnh1.c();
/*    */ 
/*    */     
/* 30 */     ImmutableMultimap.Builder<arg, arj> builder = ImmutableMultimap.builder();
/* 31 */     builder.put(arl.f, new arj(f, "Tool modifier", this.c, arj.a.a));
/* 32 */     builder.put(arl.h, new arj(g, "Tool modifier", f1, arj.a.a));
/* 33 */     this.d = (Multimap<arg, arj>)builder.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public float a(bmb ☃, ceh ceh1) {
/* 38 */     return this.a.contains(ceh1.b()) ? this.b : 1.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃, aqm aqm1, aqm aqm2) {
/* 43 */     ☃.a(2, aqm2, ☃ -> ☃.c(aqf.a));
/* 44 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃, brx brx1, ceh ceh1, fx fx1, aqm aqm1) {
/* 50 */     if (!brx1.v && ceh1.h(brx1, fx1) != 0.0F) {
/* 51 */       ☃.a(1, aqm1, ☃ -> ☃.c(aqf.a));
/*    */     }
/* 53 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<arg, arj> a(aqf ☃) {
/* 58 */     if (☃ == aqf.a) {
/* 59 */       return this.d;
/*    */     }
/* 61 */     return super.a(☃);
/*    */   }
/*    */   
/*    */   public float d() {
/* 65 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */