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
/*    */ public class bpf
/*    */   extends boj
/*    */ {
/*    */   public bpf(vk ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 22 */     boolean bool1 = false;
/* 23 */     boolean bool2 = false;
/* 24 */     boolean bool3 = false;
/* 25 */     boolean bool4 = false;
/*    */     
/* 27 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 28 */       bmb bmb = ☃.a(i);
/* 29 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 33 */         if (bmb.b() == bup.bC.h() && !bool3) {
/* 34 */           bool3 = true;
/* 35 */         } else if (bmb.b() == bup.bD.h() && !bool2) {
/* 36 */           bool2 = true;
/* 37 */         } else if (bmb.b().a(aeg.I) && !bool1) {
/* 38 */           bool1 = true;
/* 39 */         } else if (bmb.b() == bmd.kQ && !bool4) {
/* 40 */           bool4 = true;
/*    */         } else {
/* 42 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 46 */     return (bool1 && bool3 && bool2 && bool4);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 51 */     bmb bmb1 = bmb.b;
/* 52 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 53 */       bmb bmb = ☃.a(i);
/* 54 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 58 */         if (bmb.b().a(aeg.I)) {
/* 59 */           bmb1 = bmb;
/*    */           break;
/*    */         } 
/*    */       }
/*    */     } 
/* 64 */     bmb bmb2 = new bmb(bmd.qR, 1);
/* 65 */     if (bmb1.b() instanceof bkh && ((bkh)bmb1.b()).e() instanceof bwu) {
/* 66 */       bwu bwu = (bwu)((bkh)bmb1.b()).e();
/* 67 */       aps aps = bwu.c();
/* 68 */       bne.a(bmb2, aps, bwu.d());
/*    */     } 
/*    */     
/* 71 */     return bmb2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 76 */     return (☃ >= 2 && i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 81 */     return bos.n;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bpf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */