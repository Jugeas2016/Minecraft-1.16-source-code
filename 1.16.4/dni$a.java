/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.IOException;
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
/*     */ public class a
/*     */   implements dng
/*     */ {
/*     */   private final vk a;
/*     */   private final String b;
/*     */   
/*     */   public a(vk ☃, String str) {
/* 128 */     this.a = ☃;
/* 129 */     this.b = str;
/*     */   }
/*     */   
/*     */   public static dng a(JsonObject ☃) {
/* 133 */     return new a(new vk(
/* 134 */           afd.h(☃, "sizes")), 
/* 135 */         afd.h(☃, "template"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public deb a(ach ☃) {
/* 142 */     try (acg ☃ = djz.C().N().a(this.a)) {
/* 143 */       byte[] arrayOfByte = new byte[65536];
/* 144 */       acg.b().read(arrayOfByte);
/* 145 */       return new dni(☃, arrayOfByte, this.b);
/* 146 */     } catch (IOException iOException) {
/* 147 */       dni.b().error("Cannot load {}, unicode glyphs will not render correctly", this.a);
/*     */       
/* 149 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dni$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */