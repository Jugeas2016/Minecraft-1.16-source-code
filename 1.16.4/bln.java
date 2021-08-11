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
/*    */ public class bln
/*    */   extends blx
/*    */ {
/*    */   public bln(blx.a ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 21 */     md md = ☃.b("Explosion");
/* 22 */     if (md != null) {
/* 23 */       a(md, list);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void a(md ☃, List<nr> list) {
/* 28 */     blm.a a = blm.a.a(☃.f("Type"));
/* 29 */     list.add((new of("item.minecraft.firework_star.shape." + a.b())).a(k.h));
/*    */ 
/*    */     
/* 32 */     int[] arrayOfInt1 = ☃.n("Colors");
/* 33 */     if (arrayOfInt1.length > 0) {
/* 34 */       list.add(a((new oe("")).a(k.h), arrayOfInt1));
/*    */     }
/*    */ 
/*    */     
/* 38 */     int[] arrayOfInt2 = ☃.n("FadeColors");
/* 39 */     if (arrayOfInt2.length > 0) {
/* 40 */       list.add(a((new of("item.minecraft.firework_star.fade_to")).c(" ").a(k.h), arrayOfInt2));
/*    */     }
/*    */ 
/*    */     
/* 44 */     if (☃.q("Trail")) {
/* 45 */       list.add((new of("item.minecraft.firework_star.trail")).a(k.h));
/*    */     }
/*    */ 
/*    */     
/* 49 */     if (☃.q("Flicker")) {
/* 50 */       list.add((new of("item.minecraft.firework_star.flicker")).a(k.h));
/*    */     }
/*    */   }
/*    */   
/*    */   private static nr a(nx ☃, int[] arrayOfInt) {
/* 55 */     for (int i = 0; i < arrayOfInt.length; i++) {
/* 56 */       if (i > 0) {
/* 57 */         ☃.c(", ");
/*    */       }
/* 59 */       ☃.a(a(arrayOfInt[i]));
/*    */     } 
/*    */     
/* 62 */     return ☃;
/*    */   }
/*    */   
/*    */   private static nr a(int ☃) {
/* 66 */     bkx bkx = bkx.b(☃);
/* 67 */     if (bkx == null) {
/* 68 */       return new of("item.minecraft.firework_star.custom_color");
/*    */     }
/* 70 */     return new of("item.minecraft.firework_star." + bkx.c());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bln.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */