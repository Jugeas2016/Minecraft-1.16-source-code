/*     */ import java.util.function.IntConsumer;
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
/*     */ public enum b
/*     */ {
/*     */   f,
/* 137 */   e("Padding", (☃, i, j, l, k) -> {  }☃ -> {  }), d("Padding", (☃, i, j, l, k) -> {  }☃ -> {  }), c("Padding", (☃, i, j, l, k) -> {  }☃ -> {  }), b("Padding", (☃, i, j, l, k) -> {  }☃ -> {  }), a("Padding", (☃, i, j, l, k) -> {  }☃ -> { 
/* 138 */     }); private final IntConsumer i; private final a h; static { f = new b("GENERIC", 5, "Generic", (☃, i, j, l, k) -> { dem.z(k); dem.a(k, ☃, i, false, j, l); }dem::A); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final String g;
/*     */ 
/*     */ 
/*     */   
/*     */   b(String ☃, a a1, IntConsumer intConsumer) {
/* 148 */     this.g = ☃;
/* 149 */     this.h = a1;
/* 150 */     this.i = intConsumer;
/*     */   } static { a = new b("POSITION", 0, "Position", (☃, i, j, l, k) -> { dem.b(☃, i, j, l); dem.x(32884); }☃ -> dem.y(32884)); b = new b("NORMAL", 1, "Normal", (☃, i, j, l, k) -> { dem.a(i, j, l); dem.x(32885); }☃ -> dem.y(32885)); c = new b("COLOR", 2, "Vertex Color", (☃, i, j, l, k) -> { dem.c(☃, i, j, l); dem.x(32886); }☃ -> { dem.y(32886); dem.S();
/*     */         }); d = new b("UV", 3, "UV", (☃, i, j, l, k) -> { dem.n(33984 + k); dem.a(☃, i, j, l); dem.x(32888); dem.n(33984);
/*     */         }☃ -> { dem.n(33984 + ☃); dem.y(32888); dem.n(33984);
/* 154 */         }); } private void a(int ☃, int i, int j, long l, int k) { this.h.setupBufferState(☃, i, j, l, k); }
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 158 */     this.i.accept(☃);
/*     */   }
/*     */   
/*     */   public String a() {
/* 162 */     return this.g;
/*     */   }
/*     */   
/*     */   static interface a {
/*     */     void setupBufferState(int param2Int1, int param2Int2, int param2Int3, long param2Long, int param2Int4);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfs$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */