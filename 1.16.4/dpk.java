/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class dpk
/*     */   extends dlo<dpk.b>
/*     */ {
/*     */   private final dpl a;
/*     */   private int o;
/*     */   
/*     */   public dpk(dpl ☃, djz djz1) {
/*  26 */     super(djz1, ☃.k + 45, ☃.l, 43, ☃.l - 32, 20);
/*  27 */     this.a = ☃;
/*     */     
/*  29 */     djw[] arrayOfDjw = (djw[])ArrayUtils.clone((Object[])djz1.k.aF);
/*  30 */     Arrays.sort((Object[])arrayOfDjw);
/*  31 */     String str = null;
/*     */     
/*  33 */     for (djw djw : arrayOfDjw) {
/*  34 */       String str1 = djw.e();
/*     */       
/*  36 */       if (!str1.equals(str)) {
/*  37 */         str = str1;
/*  38 */         b(new a(this, new of(str1)));
/*     */       } 
/*     */       
/*  41 */       nr nr = new of(djw.g());
/*  42 */       int i = djz1.g.a(nr);
/*  43 */       if (i > this.o) {
/*  44 */         this.o = i;
/*     */       }
/*  46 */       b(new c(djw, nr));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static abstract class b extends dlo.a<b> {}
/*     */   
/*     */   public class a extends b {
/*     */     private final nr b;
/*     */     private final int c;
/*     */     
/*     */     public a(dpk ☃, nr nr1) {
/*  57 */       this.b = nr1;
/*  58 */       this.c = (dpk.a(☃)).g.a(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*  63 */       (dpk.c(this.a)).g.getClass(); (dpk.d(this.a)).g.b(☃, this.b, ((dpk.b(this.a)).y.k / 2 - this.c / 2), (j + n - 9 - 1), 16777215);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c_(boolean ☃) {
/*  68 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<? extends dmi> au_() {
/*  73 */       return Collections.emptyList();
/*     */     }
/*     */   }
/*     */   
/*     */   public class c extends b {
/*     */     private final djw b;
/*     */     private final nr c;
/*     */     private final dlj d;
/*     */     private final dlj e;
/*     */     
/*     */     private c(dpk ☃, djw djw1, nr nr1) {
/*  84 */       this.b = djw1;
/*  85 */       this.c = nr1;
/*  86 */       this.d = new dlj(this, 0, 0, 75, 20, nr1, dlj1 -> (dpk.e(this.a)).c = ☃, ☃, djw1, nr1)
/*     */         {
/*     */           protected nx c() {
/*  89 */             if (this.b.i()) {
/*  90 */               return new of("narrator.controls.unbound", new Object[] { this.c });
/*     */             }
/*  92 */             return new of("narrator.controls.bound", new Object[] { this.c, super.c() });
/*     */           }
/*     */         };
/*     */       
/*  96 */       this.e = new dlj(this, 0, 0, 50, 20, new of("controls.reset"), dlj1 -> { (dpk.j(this.a)).k.a(☃, ☃.h()); djw.c(); }☃, nr1)
/*     */         {
/*     */ 
/*     */           
/*     */           protected nx c()
/*     */           {
/* 102 */             return new of("narrator.controls.reset", new Object[] { this.b });
/*     */           }
/*     */         };
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 109 */       boolean bool1 = ((dpk.e(this.a)).c == this.b);
/* 110 */       (dpk.g(this.a)).g.getClass(); (dpk.h(this.a)).g.b(☃, this.c, (k + 90 - dpk.f(this.a)), (j + n / 2 - 9 / 2), 16777215);
/*     */       
/* 112 */       this.e.l = k + 190;
/* 113 */       this.e.m = j;
/* 114 */       this.e.o = !this.b.k();
/* 115 */       this.e.a(☃, i1, i2, f);
/*     */       
/* 117 */       this.d.l = k + 105;
/* 118 */       this.d.m = j;
/* 119 */       this.d.a(this.b.j());
/*     */       
/* 121 */       boolean bool2 = false;
/*     */       
/* 123 */       if (!this.b.i()) {
/* 124 */         for (djw djw1 : (dpk.i(this.a)).k.aF) {
/* 125 */           if (djw1 != this.b && this.b.b(djw1)) {
/* 126 */             bool2 = true;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 132 */       if (bool1) {
/* 133 */         this.d.a((new oe("> ")).a(this.d.i().e().a(k.o)).c(" <").a(k.o));
/* 134 */       } else if (bool2) {
/* 135 */         this.d.a(this.d.i().e().a(k.m));
/*     */       } 
/*     */       
/* 138 */       this.d.a(☃, i1, i2, f);
/*     */     }
/*     */ 
/*     */     
/*     */     public List<? extends dmi> au_() {
/* 143 */       return (List<? extends dmi>)ImmutableList.of(this.d, this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 148 */       if (this.d.a(☃, d1, i)) {
/* 149 */         return true;
/*     */       }
/* 151 */       if (this.e.a(☃, d1, i)) {
/* 152 */         return true;
/*     */       }
/* 154 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(double ☃, double d1, int i) {
/* 159 */       return (this.d.c(☃, d1, i) || this.e.c(☃, d1, i));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected int e() {
/* 165 */     return super.e() + 15;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 170 */     return super.d() + 32;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */