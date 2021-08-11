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
/*    */ public class cbj
/*    */   extends btm
/*    */ {
/* 21 */   public static final cfb a = bxm.aq;
/*    */   
/* 23 */   private static final Map<gc, ddh> b = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/* 24 */         buo.a(0.0D, 0.0D, 14.0D, 16.0D, 12.5D, 16.0D), gc.d, 
/* 25 */         buo.a(0.0D, 0.0D, 0.0D, 16.0D, 12.5D, 2.0D), gc.e, 
/* 26 */         buo.a(14.0D, 0.0D, 0.0D, 16.0D, 12.5D, 16.0D), gc.f, 
/* 27 */         buo.a(0.0D, 0.0D, 0.0D, 2.0D, 12.5D, 16.0D)));
/*    */ 
/*    */   
/*    */   public cbj(bkx ☃, ceg.c c1) {
/* 31 */     super(☃, c1);
/* 32 */     j(((ceh)this.n.b()).a(a, gc.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public String i() {
/* 37 */     return h().a();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 43 */     return brz1.d_(fx1.a(((gc)☃.c(a)).f())).c().b();
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 48 */     if (gc1 == ((gc)☃.c(a)).f() && !☃.a(bry1, fx1)) {
/* 49 */       return bup.a.n();
/*    */     }
/*    */     
/* 52 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 57 */     return b.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 62 */     ceh ceh = n();
/*    */     
/* 64 */     brz brz = ☃.p();
/* 65 */     fx fx = ☃.a();
/*    */     
/* 67 */     gc[] arrayOfGc = ☃.e();
/* 68 */     for (gc gc : arrayOfGc) {
/* 69 */       if (gc.n().d()) {
/*    */ 
/*    */ 
/*    */         
/* 73 */         gc gc1 = gc.f();
/*    */         
/* 75 */         ceh = ceh.a(a, gc1);
/* 76 */         if (ceh.a(brz, fx)) {
/* 77 */           return ceh;
/*    */         }
/*    */       } 
/*    */     } 
/* 81 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 86 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 91 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 96 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */