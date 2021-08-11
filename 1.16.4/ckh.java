/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ckh
/*    */   extends cla<cmh>
/*    */ {
/* 27 */   private static final List<btg.c> u = (List<btg.c>)ImmutableList.of(new btg.c(aqe.F, 1, 2, 4));
/*    */   
/*    */   public ckh(Codec<cmh> ☃) {
/* 30 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b() {
/* 35 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cmh cmh1) {
/* 41 */     Set<bsv> set1 = bsy1.a(i * 16 + 9, ☃.f(), j * 16 + 9, 16);
/* 42 */     for (bsv bsv2 : set1) {
/* 43 */       if (!bsv2.e().a(this)) {
/* 44 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 48 */     Set<bsv> set2 = bsy1.a(i * 16 + 9, ☃.f(), j * 16 + 9, 29);
/* 49 */     for (bsv bsv2 : set2) {
/* 50 */       if (bsv2.t() != bsv.b.l && bsv2.t() != bsv.b.n) {
/* 51 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 55 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmh> a() {
/* 60 */     return a::new;
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmh> {
/*    */     private boolean e;
/*    */     
/*    */     public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 67 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 72 */       b(i, j);
/*    */     }
/*    */     
/*    */     private void b(int ☃, int i) {
/* 76 */       int j = ☃ * 16 - 29;
/* 77 */       int k = i * 16 - 29;
/* 78 */       gc gc = gc.c.a.a(this.d);
/*    */       
/* 80 */       this.b.add(new crl.h(this.d, j, k, gc));
/* 81 */       b();
/*    */       
/* 83 */       this.e = true;
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1) {
/* 88 */       if (!this.e) {
/* 89 */         this.b.clear();
/* 90 */         b(f(), g());
/*    */       } 
/* 92 */       super.a(☃, bsn1, cfy1, random, cra1, brd1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public List<btg.c> c() {
/* 98 */     return u;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */