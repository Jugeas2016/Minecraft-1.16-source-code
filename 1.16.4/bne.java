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
/*    */ public class bne
/*    */   extends blx
/*    */ {
/*    */   public bne(blx.a ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */   
/*    */   public static void a(bmb ☃, aps aps1, int i) {
/* 23 */     md md1 = ☃.p();
/* 24 */     mj mj = md1.d("Effects", 9);
/* 25 */     md md2 = new md();
/*    */     
/* 27 */     md2.a("EffectId", (byte)aps.a(aps1));
/* 28 */     md2.b("EffectDuration", i);
/* 29 */     mj.add(md2);
/* 30 */     md1.a("Effects", mj);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, brx brx1, aqm aqm1) {
/* 35 */     bmb bmb1 = super.a(☃, brx1, aqm1);
/*    */     
/* 37 */     md md = ☃.o();
/* 38 */     if (md != null && md.c("Effects", 9)) {
/* 39 */       mj mj = md.d("Effects", 10);
/*    */       
/* 41 */       for (int i = 0; i < mj.size(); i++) {
/* 42 */         int j = 160;
/* 43 */         md md1 = mj.a(i);
/* 44 */         if (md1.c("EffectDuration", 3)) {
/* 45 */           j = md1.h("EffectDuration");
/*    */         }
/* 47 */         aps aps = aps.a(md1.f("EffectId"));
/* 48 */         if (aps != null) {
/* 49 */           aqm1.c(new apu(aps, j));
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 54 */     if (aqm1 instanceof bfw && ((bfw)aqm1).bC.d) {
/* 55 */       return bmb1;
/*    */     }
/* 57 */     return new bmb(bmd.kQ);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bne.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */