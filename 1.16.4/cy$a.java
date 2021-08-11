/*     */ import java.util.Optional;
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
/*     */ public class a
/*     */ {
/* 117 */   public static final a a = new a((vk)null);
/*     */   
/*     */   @Nullable
/*     */   private final vk b;
/*     */   private boolean c;
/* 122 */   private Optional<cy> d = Optional.empty();
/*     */   
/*     */   public a(@Nullable vk ☃) {
/* 125 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public a(cy ☃) {
/* 129 */     this.c = true;
/* 130 */     this.b = null;
/* 131 */     this.d = Optional.of(☃);
/*     */   }
/*     */   
/*     */   public Optional<cy> a(vx ☃) {
/* 135 */     if (!this.c) {
/* 136 */       if (this.b != null) {
/* 137 */         this.d = ☃.a(this.b);
/*     */       }
/* 139 */       this.c = true;
/*     */     } 
/* 141 */     return this.d;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk a() {
/* 146 */     return this.d.<vk>map(☃ -> cy.a(☃)).orElse(this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cy$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */