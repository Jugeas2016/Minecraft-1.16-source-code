/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Objects;
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
/*     */ public class a
/*     */   extends ean
/*     */ {
/*     */   private final float V;
/*     */   
/*     */   public a(float ☃) {
/* 116 */     super("alpha", () -> {
/*     */           if (☃ > 0.0F) {
/*     */             RenderSystem.enableAlphaTest();
/*     */             RenderSystem.alphaFunc(516, ☃);
/*     */           } else {
/*     */             RenderSystem.disableAlphaTest();
/*     */           } 
/*     */         }() -> {
/*     */           RenderSystem.disableAlphaTest();
/*     */           RenderSystem.defaultAlphaFunc();
/*     */         });
/* 127 */     this.V = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object ☃) {
/* 132 */     if (this == ☃) {
/* 133 */       return true;
/*     */     }
/* 135 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 136 */       return false;
/*     */     }
/* 138 */     if (!super.equals(☃)) {
/* 139 */       return false;
/*     */     }
/* 141 */     return (this.V == ((a)☃).V);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 146 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.V) });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 151 */     return this.a + '[' + this.V + ']';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ean$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */