/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
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
/*     */ class d
/*     */   extends cm.c
/*     */ {
/*     */   @Nullable
/*     */   private final String a;
/*     */   @Nullable
/*     */   private final String b;
/*     */   
/*     */   public d(String ☃, @Nullable String str1, @Nullable String str2) {
/*  87 */     super(☃);
/*  88 */     this.a = str1;
/*  89 */     this.b = str2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected <T extends Comparable<T>> boolean a(cej<?, ?> ☃, cfj<T> cfj1) {
/*  94 */     T t = ☃.c(cfj1);
/*     */     
/*  96 */     if (this.a != null) {
/*  97 */       Optional<T> optional = cfj1.b(this.a);
/*  98 */       if (!optional.isPresent() || t.compareTo(optional.get()) < 0) {
/*  99 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 103 */     if (this.b != null) {
/* 104 */       Optional<T> optional = cfj1.b(this.b);
/* 105 */       if (!optional.isPresent() || t.compareTo(optional.get()) > 0) {
/* 106 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a() {
/* 115 */     JsonObject ☃ = new JsonObject();
/* 116 */     if (this.a != null) {
/* 117 */       ☃.addProperty("min", this.a);
/*     */     }
/* 119 */     if (this.b != null) {
/* 120 */       ☃.addProperty("max", this.b);
/*     */     }
/* 122 */     return (JsonElement)☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cm$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */