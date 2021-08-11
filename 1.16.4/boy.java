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
/*    */ public class boy
/*    */   extends boj
/*    */ {
/*    */   public boy(vk ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 20 */     int i = 0;
/* 21 */     int j = 0;
/*    */     
/* 23 */     for (int k = 0; k < ☃.Z_(); k++) {
/* 24 */       bmb bmb = ☃.a(k);
/*    */       
/* 26 */       if (!bmb.a()) {
/*    */ 
/*    */ 
/*    */         
/* 30 */         if (buo.a(bmb.b()) instanceof bzs) {
/* 31 */           i++;
/* 32 */         } else if (bmb.b() instanceof bky) {
/* 33 */           j++;
/*    */         } else {
/* 35 */           return false;
/*    */         } 
/*    */         
/* 38 */         if (j > 1 || i > 1) {
/* 39 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/* 43 */     return (i == 1 && j == 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 48 */     bmb bmb1 = bmb.b;
/* 49 */     bky bky = (bky)bmd.mu;
/*    */     
/* 51 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 52 */       bmb bmb = ☃.a(i);
/*    */       
/* 54 */       if (!bmb.a()) {
/*    */ 
/*    */ 
/*    */         
/* 58 */         blx blx = bmb.b();
/* 59 */         if (buo.a(blx) instanceof bzs) {
/* 60 */           bmb1 = bmb;
/* 61 */         } else if (blx instanceof bky) {
/* 62 */           bky = (bky)blx;
/*    */         } 
/*    */       } 
/*    */     } 
/* 66 */     bmb bmb2 = bzs.b(bky.d());
/* 67 */     if (bmb1.n()) {
/* 68 */       bmb2.c(bmb1.o().g());
/*    */     }
/*    */     
/* 71 */     return bmb2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 76 */     return (☃ * i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 81 */     return bos.m;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\boy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */