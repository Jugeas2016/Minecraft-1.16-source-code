/*     */ import java.util.Objects;
/*     */ import java.util.stream.Stream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class c
/*     */   extends ny
/*     */ {
/*     */   private final vk g;
/*     */   
/*     */   public c(String ☃, boolean bool, vk vk1) {
/* 191 */     super(☃, bool);
/* 192 */     this.g = vk1;
/*     */   }
/*     */   
/*     */   public c(String ☃, @Nullable dr.h h1, boolean bool, vk vk1) {
/* 196 */     super(☃, h1, bool);
/* 197 */     this.g = vk1;
/*     */   }
/*     */   
/*     */   public vk j() {
/* 201 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public c k() {
/* 206 */     return new c(this.e, this.f, this.d, this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Stream<md> a(db ☃) {
/* 211 */     md md = ☃.j().aI().a(this.g);
/* 212 */     return Stream.of(md);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 217 */     if (this == ☃) {
/* 218 */       return true;
/*     */     }
/*     */     
/* 221 */     if (☃ instanceof c) {
/* 222 */       c c1 = (c)☃;
/* 223 */       return (Objects.equals(this.g, c1.g) && 
/* 224 */         Objects.equals(this.e, c1.e) && super
/* 225 */         .equals(☃));
/*     */     } 
/*     */     
/* 228 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 233 */     return "StorageNbtComponent{id='" + this.g + '\'' + "path='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*     */ 
/*     */ 
/*     */       
/* 237 */       c() + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ny$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */