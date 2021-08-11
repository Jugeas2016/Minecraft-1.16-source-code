/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ctn
/*    */   extends ctt<ctu>
/*    */ {
/*    */   private long a;
/* 20 */   private ImmutableMap<ceh, cub> b = ImmutableMap.of();
/* 21 */   private ImmutableMap<ceh, cub> c = ImmutableMap.of();
/*    */   private cub d;
/*    */   
/*    */   public ctn(Codec<ctu> ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/* 30 */     int n = m + 1;
/* 31 */     int i1 = i & 0xF;
/* 32 */     int i2 = j & 0xF;
/*    */     
/* 34 */     int i3 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/* 35 */     int i4 = (int)(d / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
/*    */     
/* 37 */     double d1 = 0.03125D;
/* 38 */     boolean bool = (this.d.a(i * 0.03125D, 109.0D, j * 0.03125D) * 75.0D + ☃.nextDouble() > 0.0D);
/*    */     
/* 40 */     ceh ceh3 = (ceh)((Map.Entry)this.c.entrySet().stream().max(Comparator.comparing(entry -> Double.valueOf(((cub)entry.getValue()).a(☃, i, j)))).get()).getKey();
/* 41 */     ceh ceh4 = (ceh)((Map.Entry)this.b.entrySet().stream().max(Comparator.comparing(entry -> Double.valueOf(((cub)entry.getValue()).a(☃, i, j)))).get()).getKey();
/*    */     
/* 43 */     fx.a a = new fx.a();
/* 44 */     ceh ceh5 = cfw1.d_(a.d(i1, 128, i2));
/* 45 */     for (int i5 = 127; i5 >= 0; i5--) {
/* 46 */       a.d(i1, i5, i2);
/* 47 */       ceh ceh6 = cfw1.d_(a);
/*    */ 
/*    */       
/* 50 */       if (ceh5.a(ceh1.b()) && (ceh6.g() || ceh6 == ceh2)) {
/* 51 */         for (int i6 = 0; i6 < i3; ) {
/* 52 */           a.c(gc.b);
/* 53 */           if (cfw1.d_(a).a(ceh1.b())) {
/* 54 */             cfw1.a(a, ceh3, false);
/*    */             
/*    */             i6++;
/*    */           } 
/*    */         } 
/* 59 */         a.d(i1, i5, i2);
/*    */       } 
/*    */ 
/*    */       
/* 63 */       if ((ceh5.g() || ceh5 == ceh2) && ceh6.a(ceh1.b())) {
/* 64 */         for (int i6 = 0; i6 < i4 && 
/* 65 */           cfw1.d_(a).a(ceh1.b()); i6++) {
/* 66 */           if (bool && i5 >= n - 4 && i5 <= n + 1) {
/* 67 */             cfw1.a(a, c(), false);
/*    */           } else {
/* 69 */             cfw1.a(a, ceh4, false);
/*    */           } 
/*    */ 
/*    */ 
/*    */           
/* 74 */           a.c(gc.a);
/*    */         } 
/*    */       }
/*    */       
/* 78 */       ceh5 = ceh6;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(long ☃) {
/* 84 */     if (this.a != ☃ || this.d == null || this.b.isEmpty() || this.c.isEmpty()) {
/* 85 */       this.b = a(a(), ☃);
/* 86 */       this.c = a(b(), ☃ + this.b.size());
/*    */       
/* 88 */       this.d = new cub(new chx(☃ + this.b.size() + this.c.size()), (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*    */     } 
/* 90 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   private static ImmutableMap<ceh, cub> a(ImmutableList<ceh> ☃, long l) {
/* 94 */     ImmutableMap.Builder<ceh, cub> builder = new ImmutableMap.Builder();
/* 95 */     for (UnmodifiableIterator<ceh> unmodifiableIterator = ☃.iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh = unmodifiableIterator.next();
/* 96 */       builder.put(ceh, new cub(new chx(l), (List<Integer>)ImmutableList.of(Integer.valueOf(-4))));
/* 97 */       l++; }
/*    */     
/* 99 */     return builder.build();
/*    */   }
/*    */   
/*    */   protected abstract ImmutableList<ceh> a();
/*    */   
/*    */   protected abstract ImmutableList<ceh> b();
/*    */   
/*    */   protected abstract ceh c();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */