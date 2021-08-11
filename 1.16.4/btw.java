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
/*    */ 
/*    */ 
/*    */ public class btw
/*    */   extends btm
/*    */ {
/* 22 */   public static final cfg a = cex.aD;
/*    */   
/* 24 */   private static final Map<bkx, buo> b = Maps.newHashMap();
/* 25 */   private static final ddh c = buo.a(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
/*    */   
/*    */   public btw(bkx ☃, ceg.c c1) {
/* 28 */     super(☃, c1);
/* 29 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*    */     
/* 31 */     b.put(☃, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 36 */     return brz1.d_(fx1.c()).c().b();
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 41 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(bny ☃) {
/* 46 */     return n().a(a, Integer.valueOf(afm.c(((180.0F + ☃.h()) * 16.0F / 360.0F) + 0.5D) & 0xF));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 51 */     if (gc1 == gc.a && !☃.a(bry1, fx1)) {
/* 52 */       return bup.a.n();
/*    */     }
/*    */     
/* 55 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, bzm bzm1) {
/* 60 */     return ☃.a(a, Integer.valueOf(bzm1.a(((Integer)☃.c(a)).intValue(), 16)));
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, byg byg1) {
/* 65 */     return ☃.a(a, Integer.valueOf(byg1.a(((Integer)☃.c(a)).intValue(), 16)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 70 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */   
/*    */   public static buo a(bkx ☃) {
/* 74 */     return b.getOrDefault(☃, bup.ha);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */