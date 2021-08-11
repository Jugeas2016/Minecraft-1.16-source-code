/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.BitSet;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cic
/*    */   extends cia
/*    */ {
/*    */   public cic(Codec<cmk> ☃) {
/* 21 */     super(☃, 128);
/* 22 */     this.j = (Set<buo>)ImmutableSet.of(bup.b, bup.c, bup.e, bup.g, bup.j, bup.k, (Object[])new buo[] { bup.l, bup.i, bup.cL, bup.cM, bup.cN, bup.mu, bup.ml, bup.iK, bup.mn, bup.cO, bup.np });
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
/*    */     
/* 42 */     this.k = (Set<cuw>)ImmutableSet.of(cuy.e, cuy.c);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int a() {
/* 50 */     return 10;
/*    */   }
/*    */ 
/*    */   
/*    */   protected float a(Random ☃) {
/* 55 */     return (☃.nextFloat() * 2.0F + ☃.nextFloat()) * 2.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   protected double b() {
/* 60 */     return 5.0D;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int b(Random ☃) {
/* 65 */     return ☃.nextInt(this.l);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(cfw ☃, Function<fx, bsv> function, BitSet bitSet, Random random, fx.a a1, fx.a a2, fx.a a3, int i, int j, int k, int m, int n, int i1, int i2, int i3, MutableBoolean mutableBoolean) {
/* 70 */     int i4 = i1 | i3 << 4 | i2 << 8;
/* 71 */     if (bitSet.get(i4)) {
/* 72 */       return false;
/*    */     }
/* 74 */     bitSet.set(i4);
/*    */     
/* 76 */     a1.d(m, i2, n);
/*    */     
/* 78 */     if (a(☃.d_(a1))) {
/*    */       ceh ceh;
/* 80 */       if (i2 <= 31) {
/* 81 */         ceh = i.g();
/*    */       } else {
/* 83 */         ceh = g;
/*    */       } 
/* 85 */       ☃.a(a1, ceh, false);
/* 86 */       return true;
/*    */     } 
/* 88 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */