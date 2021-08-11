/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class blf
/*    */   extends blx
/*    */ {
/*    */   public blf(blx.a ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean e(bmb ☃) {
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean f_(bmb ☃) {
/* 31 */     return false;
/*    */   }
/*    */   
/*    */   public static mj d(bmb ☃) {
/* 35 */     md md = ☃.o();
/* 36 */     if (md != null) {
/* 37 */       return md.d("StoredEnchantments", 10);
/*    */     }
/*    */     
/* 40 */     return new mj();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 45 */     super.a(☃, brx1, list, bnl1);
/* 46 */     bmb.a(list, d(☃));
/*    */   }
/*    */   
/*    */   public static void a(bmb ☃, bpv bpv1) {
/* 50 */     mj mj = d(☃);
/* 51 */     boolean bool = true;
/*    */     
/* 53 */     vk vk = gm.R.b(bpv1.b);
/* 54 */     for (int i = 0; i < mj.size(); i++) {
/* 55 */       md md = mj.a(i);
/*    */       
/* 57 */       vk vk1 = vk.a(md.l("id"));
/* 58 */       if (vk1 != null && vk1.equals(vk)) {
/* 59 */         if (md.h("lvl") < bpv1.c) {
/* 60 */           md.a("lvl", (short)bpv1.c);
/*    */         }
/*    */         
/* 63 */         bool = false;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 68 */     if (bool) {
/* 69 */       md md = new md();
/*    */       
/* 71 */       md.a("id", String.valueOf(vk));
/* 72 */       md.a("lvl", (short)bpv1.c);
/*    */       
/* 74 */       mj.add(md);
/*    */     } 
/*    */     
/* 77 */     ☃.p().a("StoredEnchantments", mj);
/*    */   }
/*    */   
/*    */   public static bmb a(bpv ☃) {
/* 81 */     bmb bmb = new bmb(bmd.pq);
/* 82 */     a(bmb, ☃);
/* 83 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bks ☃, gj<bmb> gj1) {
/* 88 */     if (☃ == bks.g) {
/* 89 */       for (bps bps : gm.R) {
/* 90 */         if (bps.b != null) {
/* 91 */           for (int i = bps.e(); i <= bps.a(); i++) {
/* 92 */             gj1.add(a(new bpv(bps, i)));
/*    */           }
/*    */         }
/*    */       } 
/* 96 */     } else if ((☃.n()).length != 0) {
/* 97 */       for (bps bps : gm.R) {
/* 98 */         if (☃.a(bps.b))
/* 99 */           gj1.add(a(new bpv(bps, bps.a()))); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */