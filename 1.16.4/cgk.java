/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cgk<T>
/*     */   implements cgm<T>
/*     */ {
/*     */   private final gh<T> a;
/*     */   private final T[] b;
/*     */   private final cgn<T> c;
/*     */   private final Function<md, T> d;
/*     */   private final int e;
/*     */   private int f;
/*     */   
/*     */   public cgk(gh<T> ☃, int i, cgn<T> cgn1, Function<md, T> function) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = (T[])new Object[1 << i];
/*  24 */     this.e = i;
/*  25 */     this.c = cgn1;
/*  26 */     this.d = function;
/*     */   }
/*     */   
/*     */   public int a(T ☃) {
/*     */     int i;
/*  31 */     for (i = 0; i < this.f; i++) {
/*  32 */       if (this.b[i] == ☃) {
/*  33 */         return i;
/*     */       }
/*     */     } 
/*     */     
/*  37 */     i = this.f;
/*  38 */     if (i < this.b.length) {
/*  39 */       this.b[i] = ☃;
/*  40 */       this.f++;
/*  41 */       return i;
/*     */     } 
/*     */     
/*  44 */     return this.c.onResize(this.e + 1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Predicate<T> ☃) {
/*  49 */     for (int i = 0; i < this.f; i++) {
/*  50 */       if (☃.test(this.b[i])) {
/*  51 */         return true;
/*     */       }
/*     */     } 
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(int ☃) {
/*  60 */     if (☃ >= 0 && ☃ < this.f) {
/*  61 */       return this.b[☃];
/*     */     }
/*  63 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) {
/*  68 */     this.f = ☃.i();
/*  69 */     for (int i = 0; i < this.f; i++) {
/*  70 */       this.b[i] = this.a.a(☃.i());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) {
/*  76 */     ☃.d(this.f);
/*  77 */     for (int i = 0; i < this.f; i++) {
/*  78 */       ☃.d(this.a.a(this.b[i]));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  84 */     int ☃ = nf.a(b());
/*     */     
/*  86 */     for (int i = 0; i < b(); i++) {
/*  87 */       ☃ += nf.a(this.a.a(this.b[i]));
/*     */     }
/*     */     
/*  90 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  95 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(mj ☃) {
/* 100 */     for (int i = 0; i < ☃.size(); i++) {
/* 101 */       this.b[i] = this.d.apply(☃.a(i));
/*     */     }
/* 103 */     this.f = ☃.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */