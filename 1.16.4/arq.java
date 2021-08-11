/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class arq
/*     */   extends arv<azz>
/*     */ {
/*     */   private final aqe<? extends azz> b;
/*     */   private final float c;
/*     */   private long d;
/*     */   
/*     */   public arq(aqe<? extends azz> ☃, float f) {
/*  29 */     super(
/*  30 */         (Map<ayd<?>, aye>)ImmutableMap.of(ayd.h, aye.a, ayd.r, aye.b, ayd.m, aye.c, ayd.n, aye.c), 325);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     this.b = ☃;
/*  39 */     this.c = f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, azz azz1) {
/*  44 */     return (azz1.eS() && c(azz1).isPresent());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, azz azz1, long l) {
/*  49 */     azz azz2 = c(azz1).get();
/*     */     
/*  51 */     azz1.cJ().a(ayd.r, azz2);
/*  52 */     azz2.cJ().a(ayd.r, azz1);
/*     */     
/*  54 */     arw.a(azz1, azz2, this.c);
/*     */     
/*  56 */     int i = 275 + azz1.cY().nextInt(50);
/*  57 */     this.d = l + i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(aag ☃, azz azz1, long l) {
/*  62 */     if (!b(azz1)) {
/*  63 */       return false;
/*     */     }
/*  65 */     azz azz2 = a(azz1);
/*     */     
/*  67 */     return (azz2.aX() && azz1
/*  68 */       .a(azz2) && 
/*  69 */       arw.a(azz1.cJ(), azz2) && l <= this.d);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, azz azz1, long l) {
/*  75 */     azz azz2 = a(azz1);
/*     */     
/*  77 */     arw.a(azz1, azz2, this.c);
/*  78 */     if (!azz1.a(azz2, 3.0D)) {
/*     */       return;
/*     */     }
/*  81 */     if (l >= this.d) {
/*  82 */       azz1.a(☃, azz2);
/*  83 */       azz1.cJ().b(ayd.r);
/*  84 */       azz2.cJ().b(ayd.r);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, azz azz1, long l) {
/*  90 */     azz1.cJ().b(ayd.r);
/*  91 */     azz1.cJ().b(ayd.m);
/*  92 */     azz1.cJ().b(ayd.n);
/*  93 */     this.d = 0L;
/*     */   }
/*     */   
/*     */   private azz a(azz ☃) {
/*  97 */     return ☃.cJ().<apy>c(ayd.r).get();
/*     */   }
/*     */   
/*     */   private boolean b(azz ☃) {
/* 101 */     arf<?> arf = ☃.cJ();
/* 102 */     return (arf.a(ayd.r) && ((apy)arf
/* 103 */       .<apy>c(ayd.r).get()).X() == this.b);
/*     */   }
/*     */   
/*     */   private Optional<? extends azz> c(azz ☃) {
/* 107 */     return ((List)☃.cJ().<List>c((ayd)ayd.h).get()).stream()
/* 108 */       .filter(☃ -> (☃.X() == this.b))
/* 109 */       .map(☃ -> (azz)☃)
/* 110 */       .filter(☃::a)
/* 111 */       .findFirst();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */