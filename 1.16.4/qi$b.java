/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.mojang.authlib.GameProfile;
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
/*     */ public class b
/*     */ {
/*     */   private final int b;
/*     */   private final bru c;
/*     */   private final GameProfile d;
/*     */   private final nr e;
/*     */   
/*     */   public b(qi ☃, GameProfile gameProfile, int i, @Nullable bru bru1, @Nullable nr nr1) {
/* 187 */     this.d = gameProfile;
/* 188 */     this.b = i;
/* 189 */     this.c = bru1;
/* 190 */     this.e = nr1;
/*     */   }
/*     */   
/*     */   public GameProfile a() {
/* 194 */     return this.d;
/*     */   }
/*     */   
/*     */   public int b() {
/* 198 */     return this.b;
/*     */   }
/*     */   
/*     */   public bru c() {
/* 202 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nr d() {
/* 207 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 212 */     return MoreObjects.toStringHelper(this)
/* 213 */       .add("latency", this.b)
/* 214 */       .add("gameMode", this.c)
/* 215 */       .add("profile", this.d)
/* 216 */       .add("displayName", (this.e == null) ? null : nr.a.a(this.e))
/* 217 */       .toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qi$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */