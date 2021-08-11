/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
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
/*    */ public class ckj
/*    */   extends cjx
/*    */ {
/* 18 */   private static final List<btg.c> u = (List<btg.c>)ImmutableList.of(new btg.c(aqe.ak, 1, 1, 1));
/*    */   
/*    */   public ckj(Codec<cmc> ☃) {
/* 21 */     super(☃, 0, true, true);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<btg.c> c() {
/* 26 */     return u;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cmc cmc1) {
/* 31 */     int k = i >> 4;
/* 32 */     int m = j >> 4;
/*    */ 
/*    */     
/* 35 */     chx1.setSeed((k ^ m << 4) ^ l);
/* 36 */     chx1.nextInt();
/*    */     
/* 38 */     if (chx1.nextInt(5) != 0) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     return !a(☃, l, chx1, i, j);
/*    */   }
/*    */   
/*    */   private boolean a(cfy ☃, long l, chx chx1, int i, int j) {
/* 46 */     cmy cmy = ☃.b().a(cla.q);
/* 47 */     if (cmy == null) {
/* 48 */       return false;
/*    */     }
/* 50 */     for (int k = i - 10; k <= i + 10; k++) {
/* 51 */       for (int m = j - 10; m <= j + 10; m++) {
/* 52 */         brd brd = cla.q.a(cmy, l, chx1, k, m);
/* 53 */         if (k == brd.b && m == brd.c) {
/* 54 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 59 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */