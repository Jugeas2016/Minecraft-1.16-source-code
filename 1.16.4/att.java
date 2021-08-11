/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class att
/*     */   extends arv<bfj>
/*     */ {
/*     */   @Nullable
/*     */   private bmb b;
/*  27 */   private final List<bmb> c = Lists.newArrayList();
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public att(int ☃, int i) {
/*  33 */     super(
/*  34 */         (Map<ayd<?>, aye>)ImmutableMap.of(ayd.q, aye.a), ☃, i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aag ☃, bfj bfj1) {
/*  44 */     arf<?> arf = bfj1.cJ();
/*  45 */     if (!arf.<aqm>c(ayd.q).isPresent()) {
/*  46 */       return false;
/*     */     }
/*     */     
/*  49 */     aqm aqm = arf.<aqm>c(ayd.q).get();
/*  50 */     return (aqm.X() == aqe.bc && bfj1
/*  51 */       .aX() && aqm
/*  52 */       .aX() && 
/*  53 */       !bfj1.w_() && bfj1
/*  54 */       .h(aqm) <= 17.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aag ☃, bfj bfj1, long l) {
/*  59 */     return (a(☃, bfj1) && this.f > 0 && bfj1
/*     */       
/*  61 */       .cJ().<aqm>c(ayd.q).isPresent());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(aag ☃, bfj bfj1, long l) {
/*  66 */     super.a(☃, bfj1, l);
/*  67 */     c(bfj1);
/*     */     
/*  69 */     this.d = 0;
/*  70 */     this.e = 0;
/*  71 */     this.f = 40;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(aag ☃, bfj bfj1, long l) {
/*  76 */     aqm aqm = c(bfj1);
/*     */     
/*  78 */     a(aqm, bfj1);
/*  79 */     if (!this.c.isEmpty()) {
/*  80 */       d(bfj1);
/*     */     } else {
/*  82 */       bfj1.a(aqf.a, bmb.b);
/*  83 */       this.f = Math.min(this.f, 40);
/*     */     } 
/*     */     
/*  86 */     this.f--;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(aag ☃, bfj bfj1, long l) {
/*  91 */     super.c(☃, bfj1, l);
/*  92 */     bfj1.cJ().b(ayd.q);
/*     */     
/*  94 */     bfj1.a(aqf.a, bmb.b);
/*  95 */     this.b = null;
/*     */   }
/*     */   
/*     */   private void a(aqm ☃, bfj bfj1) {
/*  99 */     boolean bool = false;
/* 100 */     bmb bmb1 = ☃.dD();
/* 101 */     if (this.b == null || !bmb.c(this.b, bmb1)) {
/* 102 */       this.b = bmb1;
/* 103 */       bool = true;
/* 104 */       this.c.clear();
/*     */     } 
/*     */     
/* 107 */     if (bool && !this.b.a()) {
/* 108 */       b(bfj1);
/* 109 */       if (!this.c.isEmpty()) {
/* 110 */         this.f = 900;
/* 111 */         a(bfj1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bfj ☃) {
/* 117 */     ☃.a(aqf.a, this.c.get(0));
/*     */   }
/*     */   
/*     */   private void b(bfj ☃) {
/* 121 */     for (bqv bqv : ☃.eO()) {
/* 122 */       if (!bqv.p() && a(bqv)) {
/* 123 */         this.c.add(bqv.d());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(bqv ☃) {
/* 129 */     return (bmb.c(this.b, ☃.b()) || bmb.c(this.b, ☃.c()));
/*     */   }
/*     */   
/*     */   private aqm c(bfj ☃) {
/* 133 */     arf<?> arf = ☃.cJ();
/*     */     
/* 135 */     aqm aqm = arf.<aqm>c(ayd.q).get();
/*     */     
/* 137 */     arf.a(ayd.n, new asd(aqm, true));
/* 138 */     return aqm;
/*     */   }
/*     */   
/*     */   private void d(bfj ☃) {
/* 142 */     if (this.c.size() >= 2 && ++this.d >= 40) {
/* 143 */       this.e++;
/* 144 */       this.d = 0;
/* 145 */       if (this.e > this.c.size() - 1) {
/* 146 */         this.e = 0;
/*     */       }
/* 148 */       ☃.a(aqf.a, this.c.get(this.e));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\att.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */