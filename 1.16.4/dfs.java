/*     */ import java.util.function.IntConsumer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dfs
/*     */ {
/*  11 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final a b;
/*     */   private final b c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   
/*     */   public dfs(int ☃, a a1, b b1, int i) {
/*  20 */     if (a(☃, b1)) {
/*  21 */       this.c = b1;
/*     */     } else {
/*  23 */       a.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
/*  24 */       this.c = b.d;
/*     */     } 
/*     */     
/*  27 */     this.b = a1;
/*  28 */     this.d = ☃;
/*  29 */     this.e = i;
/*     */     
/*  31 */     this.f = a1.a() * this.e;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, b b1) {
/*  35 */     return (☃ == 0 || b1 == b.d);
/*     */   }
/*     */   
/*     */   public final a a() {
/*  39 */     return this.b;
/*     */   }
/*     */   
/*     */   public final b b() {
/*  43 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int c() {
/*  51 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  56 */     return this.e + "," + this.c.a() + "," + this.b.b();
/*     */   }
/*     */   
/*     */   public final int d() {
/*  60 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  69 */     if (this == ☃) {
/*  70 */       return true;
/*     */     }
/*  72 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     dfs dfs1 = (dfs)☃;
/*     */     
/*  78 */     if (this.e != dfs1.e) {
/*  79 */       return false;
/*     */     }
/*  81 */     if (this.d != dfs1.d) {
/*  82 */       return false;
/*     */     }
/*  84 */     if (this.b != dfs1.b) {
/*  85 */       return false;
/*     */     }
/*  87 */     return (this.c == dfs1.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  92 */     int ☃ = this.b.hashCode();
/*  93 */     ☃ = 31 * ☃ + this.c.hashCode();
/*  94 */     ☃ = 31 * ☃ + this.d;
/*  95 */     ☃ = 31 * ☃ + this.e;
/*  96 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(long ☃, int i) {
/* 100 */     b.a(this.c, this.e, this.b.c(), i, ☃, this.d);
/*     */   }
/*     */   
/*     */   public void e() {
/* 104 */     this.c.a(this.d);
/*     */   }
/*     */   public enum b
/*     */   {
/*     */     private final IntConsumer i;
/*     */     private final a h; private final String g; static { a = new b("POSITION", 0, "Position", (☃, i, j, l, k) -> {
/*     */             dem.b(☃, i, j, l); dem.x(32884);
/*     */           }☃ -> dem.y(32884));
/*     */       b = new b("NORMAL", 1, "Normal", (☃, i, j, l, k) -> {
/*     */             dem.a(i, j, l);
/*     */             dem.x(32885);
/*     */           }☃ -> dem.y(32885));
/*     */       c = new b("COLOR", 2, "Vertex Color", (☃, i, j, l, k) -> {
/*     */             dem.c(☃, i, j, l);
/*     */             dem.x(32886);
/*     */           }☃ -> {
/*     */             dem.y(32886);
/*     */             dem.S();
/*     */           });
/*     */       d = new b("UV", 3, "UV", (☃, i, j, l, k) -> {
/*     */             dem.n(33984 + k);
/*     */             dem.a(☃, i, j, l);
/*     */             dem.x(32888);
/*     */             dem.n(33984);
/*     */           }☃ -> {
/*     */             dem.n(33984 + ☃);
/*     */             dem.y(32888);
/*     */             dem.n(33984);
/*     */           }); } static { f = new b("GENERIC", 5, "Generic", (☃, i, j, l, k) -> {
/*     */             dem.z(k);
/*     */             dem.a(k, ☃, i, false, j, l);
/*     */           }dem::A); } b(String ☃, a a1, IntConsumer intConsumer) { this.g = ☃;
/*     */       this.h = a1;
/* 137 */       this.i = intConsumer; } private void a(int ☃, int i, int j, long l, int k) { this.h.setupBufferState(☃, i, j, l, k); } public void a(int ☃) { this.i.accept(☃); } e("Padding", (☃, i, j, l, k) -> {  }(String)(☃ -> {  })), d("Padding", (☃, i, j, l, k) -> {  }(String)(☃ -> {  })), c("Padding", (☃, i, j, l, k) -> {  }(String)(☃ -> {  })), b("Padding", (☃, i, j, l, k) -> {  }(String)(☃ -> {  })), a("Padding", (☃, i, j, l, k) -> {  }(String)(☃ -> {
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
/*     */       })),
/* 177 */     f(4, "Int", 5124); public String a() { return this.g; } static interface a { void setupBufferState(int param2Int1, int param2Int2, int param2Int3, long param2Long, int param2Int4); } } public enum a { a(4, "Float", 5126), b(1, "Unsigned Byte", 5121), c(1, "Byte", 5120), d(2, "Unsigned Short", 5123), e(2, "Short", 5122), f(4, "Unsigned Int", 5125), g(4, "Int", 5124);
/*     */     
/*     */     private final int h;
/*     */     private final String i;
/*     */     private final int j;
/*     */     
/*     */     a(int ☃, String str1, int i) {
/* 184 */       this.h = ☃;
/* 185 */       this.i = str1;
/* 186 */       this.j = i;
/*     */     }
/*     */     
/*     */     public int a() {
/* 190 */       return this.h;
/*     */     }
/*     */     
/*     */     public String b() {
/* 194 */       return this.i;
/*     */     }
/*     */     
/*     */     public int c() {
/* 198 */       return this.j;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */