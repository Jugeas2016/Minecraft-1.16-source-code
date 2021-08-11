/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aoo
/*    */ {
/*    */   public static bmb a(List<bmb> ☃, int i, int j) {
/* 14 */     if (i < 0 || i >= ☃.size() || ((bmb)☃.get(i)).a() || j <= 0) {
/* 15 */       return bmb.b;
/*    */     }
/*    */     
/* 18 */     return ((bmb)☃.get(i)).a(j);
/*    */   }
/*    */   
/*    */   public static bmb a(List<bmb> ☃, int i) {
/* 22 */     if (i < 0 || i >= ☃.size()) {
/* 23 */       return bmb.b;
/*    */     }
/*    */     
/* 26 */     return ☃.set(i, bmb.b);
/*    */   }
/*    */   
/*    */   public static md a(md ☃, gj<bmb> gj1) {
/* 30 */     return a(☃, gj1, true);
/*    */   }
/*    */   
/*    */   public static md a(md ☃, gj<bmb> gj1, boolean bool) {
/* 34 */     mj mj = new mj();
/* 35 */     for (int i = 0; i < gj1.size(); i++) {
/* 36 */       bmb bmb = gj1.get(i);
/* 37 */       if (!bmb.a()) {
/* 38 */         md md1 = new md();
/* 39 */         md1.a("Slot", (byte)i);
/* 40 */         bmb.b(md1);
/* 41 */         mj.add(md1);
/*    */       } 
/*    */     } 
/* 44 */     if (!mj.isEmpty() || bool) {
/* 45 */       ☃.a("Items", mj);
/*    */     }
/* 47 */     return ☃;
/*    */   }
/*    */   
/*    */   public static void b(md ☃, gj<bmb> gj1) {
/* 51 */     mj mj = ☃.d("Items", 10);
/* 52 */     for (int i = 0; i < mj.size(); i++) {
/* 53 */       md md1 = mj.a(i);
/* 54 */       int j = md1.f("Slot") & 0xFF;
/* 55 */       if (j >= 0 && j < gj1.size()) {
/* 56 */         gj1.set(j, bmb.a(md1));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int a(aon ☃, Predicate<bmb> predicate, int i, boolean bool) {
/* 62 */     int j = 0;
/* 63 */     for (int k = 0; k < ☃.Z_(); k++) {
/* 64 */       bmb bmb = ☃.a(k);
/* 65 */       int m = a(bmb, predicate, i - j, bool);
/* 66 */       if (m > 0 && !bool && bmb.a()) {
/* 67 */         ☃.a(k, bmb.b);
/*    */       }
/* 69 */       j += m;
/*    */     } 
/* 71 */     return j;
/*    */   }
/*    */ 
/*    */   
/*    */   public static int a(bmb ☃, Predicate<bmb> predicate, int i, boolean bool) {
/* 76 */     if (☃.a() || !predicate.test(☃)) {
/* 77 */       return 0;
/*    */     }
/*    */     
/* 80 */     if (bool) {
/* 81 */       return ☃.E();
/*    */     }
/*    */     
/* 84 */     int j = (i < 0) ? ☃.E() : Math.min(i, ☃.E());
/* 85 */     ☃.g(j);
/* 86 */     return j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aoo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */