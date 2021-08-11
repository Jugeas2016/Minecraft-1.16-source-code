/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebl
/*     */ {
/*  18 */   public static final ebl a = new ebl(new g(), new g(), new g(1.0F, 1.0F, 1.0F));
/*     */   
/*     */   public final g b;
/*     */   public final g c;
/*     */   public final g d;
/*     */   
/*     */   public ebl(g ☃, g g1, g g2) {
/*  25 */     this.b = ☃.e();
/*  26 */     this.c = g1.e();
/*  27 */     this.d = g2.e();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃, dfm dfm1) {
/*  31 */     if (this == a) {
/*     */       return;
/*     */     }
/*  34 */     float f1 = this.b.a();
/*  35 */     float f2 = this.b.b();
/*  36 */     float f3 = this.b.c();
/*     */     
/*  38 */     if (☃) {
/*  39 */       f2 = -f2;
/*  40 */       f3 = -f3;
/*     */     } 
/*     */     
/*  43 */     int i = ☃ ? -1 : 1;
/*  44 */     dfm1.a((i * this.c.a()), this.c.b(), this.c.c());
/*  45 */     dfm1.a(new d(f1, f2, f3, true));
/*  46 */     dfm1.a(this.d.a(), this.d.b(), this.d.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  51 */     if (this == ☃) {
/*  52 */       return true;
/*     */     }
/*     */     
/*  55 */     if (getClass() == ☃.getClass()) {
/*  56 */       ebl ebl1 = (ebl)☃;
/*     */       
/*  58 */       return (this.b.equals(ebl1.b) && this.d.equals(ebl1.d) && this.c.equals(ebl1.c));
/*     */     } 
/*     */     
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  66 */     int ☃ = this.b.hashCode();
/*  67 */     ☃ = 31 * ☃ + this.c.hashCode();
/*  68 */     ☃ = 31 * ☃ + this.d.hashCode();
/*  69 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a implements JsonDeserializer<ebl> {
/*  73 */     private static final g a = new g(0.0F, 0.0F, 0.0F);
/*  74 */     private static final g b = new g(0.0F, 0.0F, 0.0F);
/*  75 */     private static final g c = new g(1.0F, 1.0F, 1.0F);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ebl a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  81 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/*  83 */       g g1 = a(jsonObject, "rotation", a);
/*     */       
/*  85 */       g g2 = a(jsonObject, "translation", b);
/*  86 */       g2.b(0.0625F);
/*  87 */       g2.a(-5.0F, 5.0F);
/*     */       
/*  89 */       g g3 = a(jsonObject, "scale", c);
/*  90 */       g3.a(-4.0F, 4.0F);
/*     */       
/*  92 */       return new ebl(g1, g2, g3);
/*     */     }
/*     */     
/*     */     private g a(JsonObject ☃, String str, g g1) {
/*  96 */       if (!☃.has(str)) {
/*  97 */         return g1;
/*     */       }
/*  99 */       JsonArray jsonArray = afd.u(☃, str);
/* 100 */       if (jsonArray.size() != 3) {
/* 101 */         throw new JsonParseException("Expected 3 " + str + " values, found: " + jsonArray.size());
/*     */       }
/*     */       
/* 104 */       float[] arrayOfFloat = new float[3];
/* 105 */       for (int i = 0; i < arrayOfFloat.length; i++) {
/* 106 */         arrayOfFloat[i] = afd.e(jsonArray.get(i), str + "[" + i + "]");
/*     */       }
/* 108 */       return new g(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */