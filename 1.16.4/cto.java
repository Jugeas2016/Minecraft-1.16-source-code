/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
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
/*    */ 
/*    */ public class cto
/*    */   extends ctt<ctu>
/*    */ {
/* 17 */   private static final ceh b = bup.lb.n();
/*    */   
/*    */   protected long a;
/*    */   private cub c;
/*    */   
/*    */   public cto(Codec<ctu> ☃) {
/* 23 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/* 28 */     int n = m;
/* 29 */     int i1 = i & 0xF;
/* 30 */     int i2 = j & 0xF;
/*    */     
/* 32 */     double d1 = this.c.a(i * 0.1D, m, j * 0.1D);
/* 33 */     boolean bool1 = (d1 > 0.15D + ☃.nextDouble() * 0.35D);
/* 34 */     double d2 = this.c.a(i * 0.1D, 109.0D, j * 0.1D);
/* 35 */     boolean bool2 = (d2 > 0.25D + ☃.nextDouble() * 0.9D);
/* 36 */     int i3 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*    */     
/* 38 */     fx.a a = new fx.a();
/*    */     
/* 40 */     int i4 = -1;
/*    */     
/* 42 */     ceh ceh3 = ctu1.b();
/*    */     
/* 44 */     for (int i5 = 127; i5 >= 0; i5--) {
/* 45 */       a.d(i1, i5, i2);
/* 46 */       ceh ceh4 = ctu1.a();
/*    */       
/* 48 */       ceh ceh5 = cfw1.d_(a);
/* 49 */       if (ceh5.g()) {
/* 50 */         i4 = -1;
/* 51 */       } else if (ceh5.a(ceh1.b())) {
/* 52 */         if (i4 == -1) {
/* 53 */           boolean bool = false;
/* 54 */           if (i3 <= 0) {
/* 55 */             bool = true;
/* 56 */             ceh3 = ctu1.b();
/*    */           } 
/*    */           
/* 59 */           if (bool1) {
/* 60 */             ceh4 = ctu1.b();
/* 61 */           } else if (bool2) {
/* 62 */             ceh4 = ctu1.c();
/*    */           } 
/*    */           
/* 65 */           if (i5 < n && bool) {
/* 66 */             ceh4 = ceh2;
/*    */           }
/*    */           
/* 69 */           i4 = i3;
/* 70 */           if (i5 >= n - 1) {
/* 71 */             cfw1.a(a, ceh4, false);
/*    */           } else {
/* 73 */             cfw1.a(a, ceh3, false);
/*    */           } 
/* 75 */         } else if (i4 > 0) {
/* 76 */           i4--;
/* 77 */           cfw1.a(a, ceh3, false);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃) {
/* 85 */     if (this.a != ☃ || this.c == null) {
/* 86 */       this.c = new cub(new chx(☃), (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*    */     }
/* 88 */     this.a = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */