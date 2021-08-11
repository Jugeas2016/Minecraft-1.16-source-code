/*     */ import java.util.List;
/*     */ import java.util.function.Function;
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
/*     */ abstract class b
/*     */   implements drh.a
/*     */ {
/*     */   private final abu b;
/*     */   
/*     */   public b(drh paramdrh, abu ☃) {
/* 108 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract List<abu> r();
/*     */   
/*     */   protected abstract List<abu> s();
/*     */   
/*     */   public vk a() {
/* 117 */     return drh.a(this.a).apply(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public abv b() {
/* 122 */     return this.b.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public nr c() {
/* 127 */     return this.b.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public nr d() {
/* 132 */     return this.b.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public abx e() {
/* 137 */     return this.b.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 142 */     return this.b.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 147 */     return this.b.f();
/*     */   }
/*     */   
/*     */   protected void t() {
/* 151 */     r().remove(this.b);
/* 152 */     this.b.h().a(s(), this.b, Function.identity(), true);
/* 153 */     drh.b(this.a).run();
/*     */   }
/*     */   
/*     */   protected void a(int ☃) {
/* 157 */     List<abu> list = r();
/* 158 */     int i = list.indexOf(this.b);
/* 159 */     list.remove(i);
/* 160 */     list.add(i + ☃, this.b);
/* 161 */     drh.b(this.a).run();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean p() {
/* 166 */     List<abu> ☃ = r();
/* 167 */     int i = ☃.indexOf(this.b);
/* 168 */     return (i > 0 && !((abu)☃.get(i - 1)).g());
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 173 */     a(-1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 178 */     List<abu> ☃ = r();
/* 179 */     int i = ☃.indexOf(this.b);
/* 180 */     return (i >= 0 && i < ☃.size() - 1 && !((abu)☃.get(i + 1)).g());
/*     */   }
/*     */ 
/*     */   
/*     */   public void l() {
/* 185 */     a(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drh$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */