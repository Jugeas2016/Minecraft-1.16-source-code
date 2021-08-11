/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
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
/*    */ public class dog
/*    */   extends dot
/*    */ {
/*    */   private final aat a;
/* 18 */   private long b = -1L;
/*    */   
/*    */   public dog(aat ☃) {
/* 21 */     super(dkz.a);
/* 22 */     this.a = ☃;
/*    */   }
/*    */   private static final Object2IntMap<cga> c;
/*    */   
/*    */   public boolean as_() {
/* 27 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 32 */     dkz.b.a((new of("narrator.loading.done")).getString());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 37 */     a(☃);
/*    */     
/* 39 */     String str = afm.a(this.a.e(), 0, 100) + "%";
/*    */     
/* 41 */     long l = x.b();
/* 42 */     if (l - this.b > 2000L) {
/* 43 */       this.b = l;
/*    */       
/* 45 */       dkz.b.a((new of("narrator.loading", new Object[] { str })).getString());
/*    */     } 
/*    */     
/* 48 */     int k = this.k / 2;
/* 49 */     int m = this.l / 2;
/*    */     
/* 51 */     int n = 30;
/*    */     
/* 53 */     a(☃, this.a, k, m + 30, 2, 0);
/* 54 */     this.o.getClass(); a(☃, this.o, str, k, m - 9 / 2 - 30, 16777215);
/*    */   }
/*    */   
/*    */   public static void a(dfm ☃, aat aat1, int i, int j, int k, int m) {
/* 58 */     int n = k + m;
/*    */     
/* 60 */     int i1 = aat1.c();
/* 61 */     int i2 = i1 * n - m;
/*    */     
/* 63 */     int i3 = aat1.d();
/* 64 */     int i4 = i3 * n - m;
/*    */     
/* 66 */     int i5 = i - i4 / 2;
/* 67 */     int i6 = j - i4 / 2;
/*    */     
/* 69 */     int i7 = i2 / 2 + 1;
/*    */     
/* 71 */     int i8 = -16772609;
/*    */     
/* 73 */     if (m != 0) {
/* 74 */       a(☃, i - i7, j - i7, i - i7 + 1, j + i7, -16772609);
/* 75 */       a(☃, i + i7 - 1, j - i7, i + i7, j + i7, -16772609);
/* 76 */       a(☃, i - i7, j - i7, i + i7, j - i7 + 1, -16772609);
/* 77 */       a(☃, i - i7, j + i7 - 1, i + i7, j + i7, -16772609);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 85 */     for (int i9 = 0; i9 < i3; i9++) {
/* 86 */       for (int i10 = 0; i10 < i3; i10++) {
/* 87 */         cga cga = aat1.a(i9, i10);
/* 88 */         int i11 = i5 + i9 * n;
/* 89 */         int i12 = i6 + i10 * n;
/* 90 */         a(☃, i11, i12, i11 + k, i12 + k, c.getInt(cga) | 0xFF000000);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   static {
/* 95 */     c = (Object2IntMap<cga>)x.a(new Object2IntOpenHashMap(), ☃ -> {
/*    */           ☃.defaultReturnValue(0);
/*    */           ☃.put(cga.a, 5526612);
/*    */           ☃.put(cga.b, 10066329);
/*    */           ☃.put(cga.c, 6250897);
/*    */           ☃.put(cga.d, 8434258);
/*    */           ☃.put(cga.e, 13750737);
/*    */           ☃.put(cga.f, 7497737);
/*    */           ☃.put(cga.g, 7169628);
/*    */           ☃.put(cga.h, 3159410);
/*    */           ☃.put(cga.i, 2213376);
/*    */           ☃.put(cga.j, 13421772);
/*    */           ☃.put(cga.k, 15884384);
/*    */           ☃.put(cga.l, 15658734);
/*    */           ☃.put(cga.m, 16777215);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */