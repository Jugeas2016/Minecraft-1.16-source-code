/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asq
/*     */   extends arv<aqn>
/*     */ {
/*     */   private final float b;
/*     */   @Nullable
/*     */   private fx c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public asq(float ☃) {
/*  35 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.w, aye.a, ayd.m, aye.b));
/*     */ 
/*     */ 
/*     */     
/*  39 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, aqn aqn1) {
/*  44 */     return (aqn1.w_() && b(☃, aqn1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, aqn aqn1, long l) {
/*  49 */     super.a(☃, aqn1, l);
/*     */     
/*  51 */     a(aqn1).ifPresent(fx1 -> {
/*     */           this.c = fx1;
/*     */           this.d = 100;
/*     */           this.e = 3 + ☃.t.nextInt(4);
/*     */           this.f = 0;
/*     */           a(aqn1, fx1);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, aqn aqn1, long l) {
/*  62 */     super.c(☃, aqn1, l);
/*     */     
/*  64 */     this.c = null;
/*  65 */     this.d = 0;
/*  66 */     this.e = 0;
/*  67 */     this.f = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(aag ☃, aqn aqn1, long l) {
/*  72 */     return (aqn1.w_() && this.c != null && 
/*     */       
/*  74 */       a(☃, this.c) && 
/*  75 */       !e(☃, aqn1) && 
/*  76 */       !f(☃, aqn1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(long ☃) {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, aqn aqn1, long l) {
/*  86 */     if (!c(☃, aqn1)) {
/*  87 */       this.d--;
/*     */       
/*     */       return;
/*     */     } 
/*  91 */     if (this.f > 0) {
/*  92 */       this.f--;
/*     */       
/*     */       return;
/*     */     } 
/*  96 */     if (d(☃, aqn1)) {
/*  97 */       aqn1.v().a();
/*  98 */       this.e--;
/*  99 */       this.f = 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(aqn ☃, fx fx1) {
/* 104 */     ☃.cJ().a(ayd.m, new ayf(fx1, this.b, 0));
/*     */   }
/*     */   
/*     */   private boolean b(aag ☃, aqn aqn1) {
/* 108 */     return (c(☃, aqn1) || a(aqn1).isPresent());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean c(aag ☃, aqn aqn1) {
/* 115 */     fx fx1 = aqn1.cB();
/* 116 */     fx fx2 = fx1.c();
/* 117 */     return (a(☃, fx1) || a(☃, fx2));
/*     */   }
/*     */   
/*     */   private boolean d(aag ☃, aqn aqn1) {
/* 121 */     return a(☃, aqn1.cB());
/*     */   }
/*     */   
/*     */   private boolean a(aag ☃, fx fx1) {
/* 125 */     return ☃.d_(fx1).a(aed.L);
/*     */   }
/*     */   
/*     */   private Optional<fx> a(aqn ☃) {
/* 129 */     return ☃.cJ().c(ayd.w);
/*     */   }
/*     */   
/*     */   private boolean e(aag ☃, aqn aqn1) {
/* 133 */     return (!c(☃, aqn1) && this.d <= 0);
/*     */   }
/*     */   
/*     */   private boolean f(aag ☃, aqn aqn1) {
/* 137 */     return (c(☃, aqn1) && this.e <= 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */