/*    */ import java.lang.reflect.Constructor;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bch<T extends bcb>
/*    */ {
/*  9 */   private static bch<?>[] l = (bch<?>[])new bch[0];
/* 10 */   public static final bch<bbx> a = a(bbx.class, "HoldingPattern");
/* 11 */   public static final bch<bcf> b = a(bcf.class, "StrafePlayer");
/* 12 */   public static final bch<bbz> c = a(bbz.class, "LandingApproach");
/* 13 */   public static final bch<bca> d = a(bca.class, "Landing");
/* 14 */   public static final bch<bcg> e = a(bcg.class, "Takeoff");
/* 15 */   public static final bch<bcd> f = a(bcd.class, "SittingFlaming");
/* 16 */   public static final bch<bce> g = a(bce.class, "SittingScanning");
/* 17 */   public static final bch<bcc> h = a(bcc.class, "SittingAttacking");
/* 18 */   public static final bch<bbv> i = a(bbv.class, "ChargingPlayer");
/* 19 */   public static final bch<bbw> j = a(bbw.class, "Dying");
/* 20 */   public static final bch<bby> k = a(bby.class, "Hover");
/*    */   
/*    */   private final Class<? extends bcb> m;
/*    */   private final int n;
/*    */   private final String o;
/*    */   
/*    */   private bch(int ☃, Class<? extends bcb> clazz, String str) {
/* 27 */     this.n = ☃;
/* 28 */     this.m = clazz;
/* 29 */     this.o = str;
/*    */   }
/*    */   
/*    */   public bcb a(bbr ☃) {
/*    */     try {
/* 34 */       Constructor<? extends bcb> constructor = a();
/* 35 */       return constructor.newInstance(new Object[] { ☃ });
/* 36 */     } catch (Exception exception) {
/* 37 */       throw new Error(exception);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected Constructor<? extends bcb> a() throws NoSuchMethodException {
/* 42 */     return this.m.getConstructor(new Class[] { bbr.class });
/*    */   }
/*    */   
/*    */   public int b() {
/* 46 */     return this.n;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 51 */     return this.o + " (#" + this.n + ")";
/*    */   }
/*    */   
/*    */   public static bch<?> a(int ☃) {
/* 55 */     if (☃ < 0 || ☃ >= l.length) {
/* 56 */       return a;
/*    */     }
/* 58 */     return l[☃];
/*    */   }
/*    */   
/*    */   public static int c() {
/* 62 */     return l.length;
/*    */   }
/*    */   
/*    */   private static <T extends bcb> bch<T> a(Class<T> ☃, String str) {
/* 66 */     bch<T> bch1 = new bch<>(l.length, ☃, str);
/* 67 */     l = (bch<?>[])Arrays.<bch>copyOf((bch[])l, l.length + 1);
/* 68 */     l[bch1.b()] = bch1;
/* 69 */     return bch1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */