/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class buc
/*    */   extends btz
/*    */ {
/* 22 */   public static final cfb a = bxm.aq;
/*    */   
/* 24 */   private static final Map<gc, ddh> c = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/* 25 */         buo.a(0.0D, 4.0D, 5.0D, 16.0D, 12.0D, 16.0D), gc.d, 
/* 26 */         buo.a(0.0D, 4.0D, 0.0D, 16.0D, 12.0D, 11.0D), gc.e, 
/* 27 */         buo.a(5.0D, 4.0D, 0.0D, 16.0D, 12.0D, 16.0D), gc.f, 
/* 28 */         buo.a(0.0D, 4.0D, 0.0D, 11.0D, 12.0D, 16.0D)));
/*    */ 
/*    */   
/*    */   protected buc(ceg.c ☃) {
/* 32 */     super(☃);
/* 33 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(true)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 38 */     return c.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 43 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 48 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 53 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 58 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 59 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 62 */     if (gc1.f() == ☃.c(a) && !☃.a(bry1, fx1)) {
/* 63 */       return bup.a.n();
/*    */     }
/*    */     
/* 66 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 71 */     gc gc = (gc)☃.c(a);
/* 72 */     fx fx2 = fx1.a(gc.f());
/* 73 */     ceh ceh1 = brz1.d_(fx2);
/*    */     
/* 75 */     return ceh1.d(brz1, fx2, gc);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 81 */     ceh ceh = super.a(☃);
/*    */     
/* 83 */     brz brz = ☃.p();
/* 84 */     fx fx = ☃.a();
/*    */     
/* 86 */     gc[] arrayOfGc = ☃.e();
/* 87 */     for (gc gc : arrayOfGc) {
/* 88 */       if (gc.n().d()) {
/*    */ 
/*    */ 
/*    */         
/* 92 */         ceh = ceh.a(a, gc.f());
/* 93 */         if (ceh.a(brz, fx)) {
/* 94 */           return ceh;
/*    */         }
/*    */       } 
/*    */     } 
/* 98 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */