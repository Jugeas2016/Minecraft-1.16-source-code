/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cvz
/*    */   implements cwn, cws
/*    */ {
/*  9 */   a;
/*    */ 
/*    */   
/*    */   public int a(cvk ☃, cvf cvf1, cvf cvf2, int i, int j) {
/* 13 */     int k = cvf1.a(a(i), b(j));
/* 14 */     int m = cvf2.a(a(i), b(j));
/*    */     
/* 16 */     if (!cvx.a(k)) {
/* 17 */       return k;
/*    */     }
/*    */     
/* 20 */     int n = 8;
/* 21 */     int i1 = 4;
/* 22 */     for (int i2 = -8; i2 <= 8; i2 += 4) {
/* 23 */       for (int i3 = -8; i3 <= 8; i3 += 4) {
/* 24 */         int i4 = cvf1.a(a(i + i2), b(j + i3));
/* 25 */         if (!cvx.a(i4)) {
/* 26 */           if (m == 44) {
/* 27 */             return 45;
/*    */           }
/*    */           
/* 30 */           if (m == 10) {
/* 31 */             return 46;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 37 */     if (k == 24) {
/* 38 */       if (m == 45) {
/* 39 */         return 48;
/*    */       }
/*    */       
/* 42 */       if (m == 0) {
/* 43 */         return 24;
/*    */       }
/*    */       
/* 46 */       if (m == 46) {
/* 47 */         return 49;
/*    */       }
/*    */       
/* 50 */       if (m == 10) {
/* 51 */         return 50;
/*    */       }
/*    */     } 
/* 54 */     return m;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */