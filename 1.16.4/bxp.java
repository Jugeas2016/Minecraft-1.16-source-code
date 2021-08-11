/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
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
/*    */ public class bxp
/*    */   extends buo
/*    */ {
/*    */   private final buo a;
/* 21 */   private static final Map<buo, buo> b = Maps.newIdentityHashMap();
/*    */   
/*    */   public bxp(buo ☃, ceg.c c1) {
/* 24 */     super(c1);
/* 25 */     this.a = ☃;
/* 26 */     b.put(☃, this);
/*    */   }
/*    */   
/*    */   public buo c() {
/* 30 */     return this.a;
/*    */   }
/*    */   
/*    */   public static boolean h(ceh ☃) {
/* 34 */     return b.containsKey(☃.b());
/*    */   }
/*    */   
/*    */   private void a(aag ☃, fx fx1) {
/* 38 */     bdx bdx = aqe.au.a(☃);
/* 39 */     bdx.b(fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D, 0.0F, 0.0F);
/* 40 */     ☃.c(bdx);
/*    */     
/* 42 */     bdx.G();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, bmb bmb1) {
/* 47 */     super.a(☃, aag1, fx1, bmb1);
/*    */     
/* 49 */     if (aag1.V().b(brt.f) && 
/* 50 */       bpu.a(bpw.u, bmb1) == 0) {
/* 51 */       a(aag1, fx1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, brp brp1) {
/* 57 */     if (☃ instanceof aag) {
/* 58 */       a((aag)☃, fx1);
/*    */     }
/*    */   }
/*    */   
/*    */   public static ceh c(buo ☃) {
/* 63 */     return ((buo)b.get(☃)).n();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */