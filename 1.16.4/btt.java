/*    */ import com.google.common.collect.ImmutableMap;
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
/*    */ public class btt
/*    */   extends buu
/*    */ {
/* 21 */   public static final cfb a = bxm.aq;
/*    */ 
/*    */   
/*    */   private final can b;
/*    */   
/* 26 */   private static final Map<gc, ddh> c = Maps.newEnumMap((Map)ImmutableMap.of(gc.d, 
/* 27 */         buo.a(6.0D, 0.0D, 6.0D, 10.0D, 10.0D, 16.0D), gc.e, 
/* 28 */         buo.a(0.0D, 0.0D, 6.0D, 10.0D, 10.0D, 10.0D), gc.c, 
/* 29 */         buo.a(6.0D, 0.0D, 0.0D, 10.0D, 10.0D, 10.0D), gc.f, 
/* 30 */         buo.a(6.0D, 0.0D, 6.0D, 16.0D, 10.0D, 10.0D)));
/*    */ 
/*    */   
/*    */   protected btt(can ☃, ceg.c c1) {
/* 34 */     super(c1);
/* 35 */     j(((ceh)this.n.b()).a(a, gc.c));
/* 36 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 41 */     return c.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 46 */     if (!ceh1.a(this.b) && gc1 == ☃.c(a)) {
/* 47 */       return this.b.c().n().a(cam.a, Integer.valueOf(7));
/*    */     }
/* 49 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/* 54 */     return ☃.a(bup.bX);
/*    */   }
/*    */   
/*    */   protected blx b() {
/* 58 */     if (this.b == bup.cK) {
/* 59 */       return bmd.nj;
/*    */     }
/*    */     
/* 62 */     if (this.b == bup.dK) {
/* 63 */       return bmd.nk;
/*    */     }
/*    */     
/* 66 */     return bmd.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 71 */     return new bmb(b());
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 76 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 81 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 86 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */