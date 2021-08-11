/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebo
/*     */   implements elv
/*     */ {
/*     */   private final vk a;
/*     */   private final f b;
/*     */   private final boolean c;
/*     */   private final int d;
/*     */   
/*     */   public ebo(vk ☃, f f1, boolean bool, int i) {
/*  25 */     this.a = ☃;
/*  26 */     this.b = f1;
/*  27 */     this.c = bool;
/*  28 */     this.d = i;
/*     */   }
/*     */   
/*     */   public vk a() {
/*  32 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public f b() {
/*  37 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  42 */     return this.c;
/*     */   }
/*     */   
/*     */   public int d() {
/*  46 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  51 */     return "Variant{modelLocation=" + this.a + ", rotation=" + this.b + ", uvLock=" + this.c + ", weight=" + this.d + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  61 */     if (this == ☃) {
/*  62 */       return true;
/*     */     }
/*  64 */     if (☃ instanceof ebo) {
/*  65 */       ebo ebo1 = (ebo)☃;
/*  66 */       return (this.a.equals(ebo1.a) && Objects.equals(this.b, ebo1.b) && this.c == ebo1.c && this.d == ebo1.d);
/*     */     } 
/*  68 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  73 */     int ☃ = this.a.hashCode();
/*  74 */     ☃ = 31 * ☃ + this.b.hashCode();
/*  75 */     ☃ = 31 * ☃ + Boolean.valueOf(this.c).hashCode();
/*  76 */     ☃ = 31 * ☃ + this.d;
/*  77 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ebo>
/*     */   {
/*     */     public ebo a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  92 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/*  94 */       vk vk = b(jsonObject);
/*  95 */       elp elp = a(jsonObject);
/*  96 */       boolean bool = d(jsonObject);
/*  97 */       int i = c(jsonObject);
/*     */       
/*  99 */       return new ebo(vk, elp.b(), bool, i);
/*     */     }
/*     */     
/*     */     private boolean d(JsonObject ☃) {
/* 103 */       return afd.a(☃, "uvlock", false);
/*     */     }
/*     */     
/*     */     protected elp a(JsonObject ☃) {
/* 107 */       int i = afd.a(☃, "x", 0);
/* 108 */       int j = afd.a(☃, "y", 0);
/*     */       
/* 110 */       elp elp = elp.a(i, j);
/* 111 */       if (elp == null) {
/* 112 */         throw new JsonParseException("Invalid BlockModelRotation x: " + i + ", y: " + j);
/*     */       }
/* 114 */       return elp;
/*     */     }
/*     */     
/*     */     protected vk b(JsonObject ☃) {
/* 118 */       return new vk(afd.h(☃, "model"));
/*     */     }
/*     */     
/*     */     protected int c(JsonObject ☃) {
/* 122 */       int i = afd.a(☃, "weight", 1);
/*     */       
/* 124 */       if (i < 1) {
/* 125 */         throw new JsonParseException("Invalid weight " + i + " found, expected integer >= 1");
/*     */       }
/* 127 */       return i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */