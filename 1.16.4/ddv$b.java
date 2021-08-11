/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Set;
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
/*     */ class b
/*     */   implements ddv.a
/*     */ {
/*     */   private final int a;
/*  82 */   private final Set<ddu> b = Sets.newIdentityHashSet();
/*     */   
/*     */   public b(int ☃) {
/*  85 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ddu a() {
/*  91 */     if (this.b.size() >= this.a) {
/*  92 */       ddv.e().warn("Maximum sound pool size {} reached", Integer.valueOf(this.a));
/*  93 */       return null;
/*     */     } 
/*     */     
/*  96 */     ddu ☃ = ddu.a();
/*  97 */     if (☃ != null) {
/*  98 */       this.b.add(☃);
/*     */     }
/*     */     
/* 101 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ddu ☃) {
/* 106 */     if (!this.b.remove(☃)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ☃.b();
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 115 */     this.b.forEach(ddu::b);
/* 116 */     this.b.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 121 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 126 */     return this.b.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddv$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */