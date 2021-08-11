/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class o
/*     */   extends ean
/*     */ {
/*     */   private final Optional<vk> V;
/*     */   private final boolean W;
/*     */   private final boolean X;
/*     */   
/*     */   public o(vk ☃, boolean bool1, boolean bool2) {
/* 203 */     super("texture", () -> {
/*     */           RenderSystem.enableTexture(); ekd ekd = djz.C().M();
/*     */           ekd.a(☃);
/*     */           ekd.b(☃).a(bool1, bool2);
/*     */         }() -> {
/*     */         
/*     */         });
/* 210 */     this.V = Optional.of(☃);
/* 211 */     this.W = bool1;
/* 212 */     this.X = bool2;
/*     */   }
/*     */   
/*     */   public o() {
/* 216 */     super("texture", () -> RenderSystem.disableTexture(), () -> RenderSystem.enableTexture());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     this.V = Optional.empty();
/* 222 */     this.W = false;
/* 223 */     this.X = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 228 */     if (this == ☃) {
/* 229 */       return true;
/*     */     }
/* 231 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 232 */       return false;
/*     */     }
/* 234 */     o o1 = (o)☃;
/* 235 */     return (this.V.equals(o1.V) && this.W == o1.W && this.X == o1.X);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 240 */     return this.V.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 245 */     return this.a + '[' + this.V + "(blur=" + this.W + ", mipmap=" + this.X + ")]";
/*     */   }
/*     */   
/*     */   protected Optional<vk> c() {
/* 249 */     return this.V;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ean$o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */