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
/*    */ public class bop
/*    */   extends bov
/*    */ {
/*    */   public bop(vk ☃) {
/* 15 */     super(☃, "", 3, 3, 
/* 16 */         gj.a(bon.a, new bon[] {
/* 17 */             bon.a(new brw[] { bmd.mb }), bon.a(new brw[] { bmd.mb }), bon.a(new brw[] { bmd.mb
/* 18 */               }), bon.a(new brw[] { bmd.mb }), bon.a(new brw[] { bmd.nf }), bon.a(new brw[] { bmd.mb
/* 19 */               }), bon.a(new brw[] { bmd.mb }), bon.a(new brw[] { bmd.mb }), bon.a(new brw[] { bmd.mb })
/*    */           }), new bmb(bmd.pc));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 27 */     if (!super.a(☃, brx1)) {
/* 28 */       return false;
/*    */     }
/* 30 */     bmb bmb = bmb.b;
/*    */     
/* 32 */     for (int i = 0; i < ☃.Z_() && bmb.a(); i++) {
/* 33 */       bmb bmb1 = ☃.a(i);
/* 34 */       if (bmb1.b() == bmd.nf) {
/* 35 */         bmb = bmb1;
/*    */       }
/*    */     } 
/*    */     
/* 39 */     if (bmb.a()) {
/* 40 */       return false;
/*    */     }
/* 42 */     cxx cxx = bmh.b(bmb, brx1);
/* 43 */     if (cxx == null) {
/* 44 */       return false;
/*    */     }
/*    */     
/* 47 */     if (a(cxx)) {
/* 48 */       return false;
/*    */     }
/*    */     
/* 51 */     return (cxx.f < 4);
/*    */   }
/*    */   
/*    */   private boolean a(cxx ☃) {
/* 55 */     if (☃.j != null) {
/* 56 */       for (cxu cxu : ☃.j.values()) {
/* 57 */         if (cxu.b() == cxu.a.i || cxu.b() == cxu.a.j) {
/* 58 */           return true;
/*    */         }
/*    */       } 
/*    */     }
/* 62 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 67 */     bmb bmb = bmb.b;
/*    */     
/* 69 */     for (int i = 0; i < ☃.Z_() && bmb.a(); i++) {
/* 70 */       bmb bmb1 = ☃.a(i);
/* 71 */       if (bmb1.b() == bmd.nf) {
/* 72 */         bmb = bmb1;
/*    */       }
/*    */     } 
/*    */     
/* 76 */     bmb = bmb.i();
/* 77 */     bmb.e(1);
/* 78 */     bmb.p().b("map_scale_direction", 1);
/*    */     
/* 80 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean af_() {
/* 85 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 90 */     return bos.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */