/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpg
/*    */   extends boj
/*    */ {
/*    */   public bpg(vk ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 18 */     if (☃.g() != 3 || ☃.f() != 3) {
/* 19 */       return false;
/*    */     }
/*    */     
/* 22 */     for (int i = 0; i < ☃.g(); i++) {
/* 23 */       for (int j = 0; j < ☃.f(); j++) {
/* 24 */         bmb bmb = ☃.a(i + j * ☃.g());
/*    */         
/* 26 */         if (bmb.a()) {
/* 27 */           return false;
/*    */         }
/*    */         
/* 30 */         blx blx = bmb.b();
/* 31 */         if (i == 1 && j == 1) {
/* 32 */           if (blx != bmd.qm) {
/* 33 */             return false;
/*    */           }
/* 35 */         } else if (blx != bmd.kd) {
/* 36 */           return false;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 41 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 46 */     bmb bmb1 = ☃.a(1 + ☃.g());
/* 47 */     if (bmb1.b() != bmd.qm) {
/* 48 */       return bmb.b;
/*    */     }
/*    */     
/* 51 */     bmb bmb2 = new bmb(bmd.ql, 8);
/* 52 */     bnv.a(bmb2, bnv.d(bmb1));
/* 53 */     bnv.a(bmb2, bnv.b(bmb1));
/*    */     
/* 55 */     return bmb2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 60 */     return (☃ >= 2 && i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 65 */     return bos.j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bpg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */