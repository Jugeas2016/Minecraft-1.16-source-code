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
/*    */ public class cbm
/*    */   extends btq
/*    */ {
/* 18 */   public static final cfb a = bxm.aq;
/*    */   
/* 20 */   private static final Map<gc, ddh> b = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/* 21 */         buo.a(4.0D, 4.0D, 8.0D, 12.0D, 12.0D, 16.0D), gc.d, 
/* 22 */         buo.a(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 8.0D), gc.f, 
/* 23 */         buo.a(0.0D, 4.0D, 4.0D, 8.0D, 12.0D, 12.0D), gc.e, 
/* 24 */         buo.a(8.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D)));
/*    */ 
/*    */   
/*    */   protected cbm(bzv.a ☃, ceg.c c1) {
/* 28 */     super(☃, c1);
/* 29 */     j(((ceh)this.n.b()).a(a, gc.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public String i() {
/* 34 */     return h().a();
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 39 */     return b.get(☃.c(a));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 44 */     ceh ceh = n();
/*    */     
/* 46 */     brc brc = ☃.p();
/* 47 */     fx fx = ☃.a();
/*    */     
/* 49 */     gc[] arrayOfGc = ☃.e();
/* 50 */     for (gc gc : arrayOfGc) {
/* 51 */       if (gc.n().d()) {
/*    */ 
/*    */ 
/*    */         
/* 55 */         gc gc1 = gc.f();
/*    */         
/* 57 */         ceh = ceh.a(a, gc1);
/* 58 */         if (!brc.d_(fx.a(gc)).a(☃)) {
/* 59 */           return ceh;
/*    */         }
/*    */       } 
/*    */     } 
/* 63 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 68 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 73 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 78 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */