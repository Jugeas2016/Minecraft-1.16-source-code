/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.IntStream;
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
/*    */ public class ctp
/*    */   extends ctt<ctu>
/*    */ {
/* 17 */   private static final ceh c = bup.lb.n();
/* 18 */   private static final ceh d = bup.E.n();
/* 19 */   private static final ceh e = bup.cM.n();
/*    */   
/*    */   protected long a;
/*    */   protected cub b;
/*    */   
/*    */   public ctp(Codec<ctu> ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/* 30 */     int n = m;
/* 31 */     int i1 = i & 0xF;
/* 32 */     int i2 = j & 0xF;
/*    */     
/* 34 */     double d1 = 0.03125D;
/* 35 */     boolean bool1 = (this.b.a(i * 0.03125D, j * 0.03125D, 0.0D) * 75.0D + ☃.nextDouble() > 0.0D);
/* 36 */     boolean bool2 = (this.b.a(i * 0.03125D, 109.0D, j * 0.03125D) * 75.0D + ☃.nextDouble() > 0.0D);
/* 37 */     int i3 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*    */     
/* 39 */     fx.a a = new fx.a();
/*    */     
/* 41 */     int i4 = -1;
/*    */     
/* 43 */     ceh ceh3 = ctu1.a();
/* 44 */     ceh ceh4 = ctu1.b();
/*    */     
/* 46 */     for (int i5 = 127; i5 >= 0; i5--) {
/* 47 */       a.d(i1, i5, i2);
/*    */       
/* 49 */       ceh ceh5 = cfw1.d_(a);
/* 50 */       if (ceh5.g()) {
/* 51 */         i4 = -1;
/* 52 */       } else if (ceh5.a(ceh1.b())) {
/* 53 */         if (i4 == -1) {
/* 54 */           boolean bool = false;
/* 55 */           if (i3 <= 0) {
/* 56 */             bool = true;
/* 57 */             ceh4 = ctu1.b();
/* 58 */           } else if (i5 >= n - 4 && i5 <= n + 1) {
/* 59 */             ceh3 = ctu1.a();
/* 60 */             ceh4 = ctu1.b();
/* 61 */             if (bool2) {
/* 62 */               ceh3 = d;
/* 63 */               ceh4 = ctu1.b();
/*    */             } 
/* 65 */             if (bool1) {
/* 66 */               ceh3 = e;
/* 67 */               ceh4 = e;
/*    */             } 
/*    */           } 
/*    */           
/* 71 */           if (i5 < n && bool) {
/* 72 */             ceh3 = ceh2;
/*    */           }
/*    */           
/* 75 */           i4 = i3;
/* 76 */           if (i5 >= n - 1) {
/* 77 */             cfw1.a(a, ceh3, false);
/*    */           } else {
/* 79 */             cfw1.a(a, ceh4, false);
/*    */           } 
/* 81 */         } else if (i4 > 0) {
/* 82 */           i4--;
/* 83 */           cfw1.a(a, ceh4, false);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃) {
/* 91 */     if (this.a != ☃ || this.b == null) {
/* 92 */       this.b = new cub(new chx(☃), IntStream.rangeClosed(-3, 0));
/*    */     }
/* 94 */     this.a = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */