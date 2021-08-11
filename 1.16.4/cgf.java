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
/*     */ public class cgf<T>
/*     */   implements cgm<T>
/*     */ {
/*     */   private final gh<T> a;
/*     */   private final aet<T> b;
/*     */   private final cgn<T> c;
/*     */   private final Function<md, T> d;
/*     */   private final Function<T, md> e;
/*     */   private final int f;
/*     */   
/*     */   public cgf(gh<T> ☃, int i, cgn<T> cgn1, Function<md, T> function, Function<T, md> function1) {
/*  22 */     this.a = ☃;
/*  23 */     this.f = i;
/*  24 */     this.c = cgn1;
/*  25 */     this.d = function;
/*  26 */     this.e = function1;
/*  27 */     this.b = new aet<>(1 << i);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(T ☃) {
/*  32 */     int i = this.b.a(☃);
/*  33 */     if (i == -1) {
/*  34 */       i = this.b.c(☃);
/*     */       
/*  36 */       if (i >= 1 << this.f) {
/*  37 */         i = this.c.onResize(this.f + 1, ☃);
/*     */       }
/*     */     } 
/*  40 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(Predicate<T> ☃) {
/*  45 */     for (int i = 0; i < b(); i++) {
/*  46 */       if (☃.test(this.b.a(i))) {
/*  47 */         return true;
/*     */       }
/*     */     } 
/*  50 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(int ☃) {
/*  56 */     return this.b.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) {
/*  61 */     this.b.a();
/*  62 */     int i = ☃.i();
/*  63 */     for (int j = 0; j < i; j++) {
/*  64 */       this.b.c(this.a.a(☃.i()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) {
/*  70 */     int i = b();
/*  71 */     ☃.d(i);
/*     */     
/*  73 */     for (int j = 0; j < i; j++) {
/*  74 */       ☃.d(this.a.a(this.b.a(j)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  80 */     int ☃ = nf.a(b());
/*     */     
/*  82 */     for (int i = 0; i < b(); i++) {
/*  83 */       ☃ += nf.a(this.a.a(this.b.a(i)));
/*     */     }
/*     */     
/*  86 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/*  91 */     return this.b.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(mj ☃) {
/*  96 */     this.b.a();
/*  97 */     for (int i = 0; i < ☃.size(); i++) {
/*  98 */       this.b.c(this.d.apply(☃.a(i)));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(mj ☃) {
/* 103 */     for (int i = 0; i < b(); i++)
/* 104 */       ☃.add(this.e.apply(this.b.a(i))); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */