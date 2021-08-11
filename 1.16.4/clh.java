/*    */ import com.mojang.serialization.Codec;
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
/*    */ public class clh
/*    */   extends cjl<cmh>
/*    */ {
/* 15 */   private static final fx a = new fx(8, 3, 8);
/* 16 */   private static final brd ab = new brd(a);
/*    */ 
/*    */ 
/*    */   
/*    */   public clh(Codec<cmh> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */   
/*    */   private static int a(int ☃, int i, int j, int k) {
/* 25 */     return Math.max(Math.abs(☃ - j), Math.abs(i - k));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 30 */     brd brd1 = new brd(fx1);
/* 31 */     if (a(brd1.b, brd1.c, ab.b, ab.c) > 1) {
/* 32 */       return true;
/*    */     }
/*    */     
/* 35 */     fx.a a = new fx.a();
/* 36 */     for (int i = brd1.e(); i <= brd1.g(); i++) {
/* 37 */       for (int j = brd1.d(); j <= brd1.f(); j++) {
/* 38 */         if (a(a.u(), a.w(), j, i) <= 16) {
/*    */ 
/*    */           
/* 41 */           a.d(j, a.v(), i);
/* 42 */           if (a.equals(a)) {
/* 43 */             ☃.a(a, bup.m.n(), 2);
/*    */           } else {
/* 45 */             ☃.a(a, bup.b.n(), 2);
/*    */           } 
/*    */         } 
/*    */       } 
/* 49 */     }  return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */