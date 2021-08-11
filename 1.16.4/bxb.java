/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bxb
/*    */   extends cah
/*    */   implements buq
/*    */ {
/*    */   public bxb(ceg.c ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 21 */     return ☃.d_(fx1.b()).g();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 31 */     fx fx2 = fx1.b();
/*    */     
/* 33 */     ceh ceh2 = bup.aR.n();
/*    */     
/*    */     int i;
/* 36 */     label32: for (i = 0; i < 128; i++) {
/* 37 */       ceh ceh4; fx fx3 = fx2;
/* 38 */       for (int j = 0; j < i / 16; ) {
/* 39 */         fx3 = fx3.b(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
/* 40 */         if (☃.d_(fx3.c()).a(this)) { if (☃.d_(fx3).r(☃, fx3))
/*    */             continue label32; 
/*    */           j++; }
/*    */         
/*    */         continue label32;
/*    */       } 
/* 46 */       ceh ceh3 = ☃.d_(fx3);
/* 47 */       if (ceh3.a(ceh2.b()) && random.nextInt(10) == 0) {
/* 48 */         ((buq)ceh2.b()).a(☃, random, fx3, ceh3);
/*    */       }
/*    */       
/* 51 */       if (!ceh3.g()) {
/*    */         continue;
/*    */       }
/*    */ 
/*    */       
/* 56 */       if (random.nextInt(8) == 0) {
/* 57 */         List<civ<?, ?>> list = ☃.v(fx3).e().b();
/* 58 */         if (list.isEmpty()) {
/*    */           continue;
/*    */         }
/*    */         
/* 62 */         civ<?, ?> civ = list.get(0);
/* 63 */         cii cii = (cii)civ.e;
/* 64 */         ceh4 = cii.b(random, fx3, civ.c());
/*    */       } else {
/*    */         
/* 67 */         ceh4 = ceh2;
/*    */       } 
/*    */       
/* 70 */       if (ceh4.a(☃, fx3))
/* 71 */         ☃.a(fx3, ceh4, 3); 
/*    */       continue;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */