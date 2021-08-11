/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class boo
/*    */   extends boj
/*    */ {
/*    */   public boo(vk ☃) {
/* 11 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 16 */     int i = 0;
/* 17 */     bmb bmb = bmb.b;
/*    */     
/* 19 */     for (int j = 0; j < ☃.Z_(); j++) {
/* 20 */       bmb bmb1 = ☃.a(j);
/* 21 */       if (!bmb1.a())
/*    */       {
/*    */ 
/*    */         
/* 25 */         if (bmb1.b() == bmd.nf) {
/* 26 */           if (!bmb.a()) {
/* 27 */             return false;
/*    */           }
/* 29 */           bmb = bmb1;
/* 30 */         } else if (bmb1.b() == bmd.pc) {
/* 31 */           i++;
/*    */         } else {
/* 33 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 37 */     return (!bmb.a() && i > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 42 */     int i = 0;
/* 43 */     bmb bmb1 = bmb.b;
/*    */     
/* 45 */     for (int j = 0; j < ☃.Z_(); j++) {
/* 46 */       bmb bmb = ☃.a(j);
/* 47 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 51 */         if (bmb.b() == bmd.nf) {
/* 52 */           if (!bmb1.a()) {
/* 53 */             return bmb.b;
/*    */           }
/* 55 */           bmb1 = bmb;
/* 56 */         } else if (bmb.b() == bmd.pc) {
/* 57 */           i++;
/*    */         } else {
/* 59 */           return bmb.b;
/*    */         } 
/*    */       }
/*    */     } 
/* 63 */     if (bmb1.a() || i < 1) {
/* 64 */       return bmb.b;
/*    */     }
/*    */     
/* 67 */     bmb bmb2 = bmb1.i();
/* 68 */     bmb2.e(i + 1);
/*    */     
/* 70 */     return bmb2;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 75 */     return (☃ >= 3 && i >= 3);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 80 */     return bos.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\boo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */