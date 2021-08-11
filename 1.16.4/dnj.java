/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.stb.STBTTFontinfo;
/*     */ import org.lwjgl.stb.STBTruetype;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dnj
/*     */   implements dng
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*     */   private final vk b;
/*     */   private final float c;
/*     */   private final float d;
/*     */   private final float e;
/*     */   private final float f;
/*     */   private final String g;
/*     */   
/*     */   public dnj(vk ☃, float f1, float f2, float f3, float f4, String str) {
/*  34 */     this.b = ☃;
/*  35 */     this.c = f1;
/*  36 */     this.d = f2;
/*  37 */     this.e = f3;
/*  38 */     this.f = f4;
/*  39 */     this.g = str;
/*     */   }
/*     */   
/*     */   public static dng a(JsonObject ☃) {
/*  43 */     float f1 = 0.0F;
/*  44 */     float f2 = 0.0F;
/*  45 */     if (☃.has("shift")) {
/*  46 */       JsonArray jsonArray = ☃.getAsJsonArray("shift");
/*  47 */       if (jsonArray.size() != 2) {
/*  48 */         throw new JsonParseException("Expected 2 elements in 'shift', found " + jsonArray.size());
/*     */       }
/*     */       
/*  51 */       f1 = afd.e(jsonArray.get(0), "shift[0]");
/*  52 */       f2 = afd.e(jsonArray.get(1), "shift[1]");
/*     */     } 
/*     */     
/*  55 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/*  57 */     if (☃.has("skip")) {
/*  58 */       JsonElement jsonElement = ☃.get("skip");
/*  59 */       if (jsonElement.isJsonArray()) {
/*  60 */         JsonArray jsonArray = afd.n(jsonElement, "skip");
/*  61 */         for (int i = 0; i < jsonArray.size(); i++) {
/*  62 */           stringBuilder.append(afd.a(jsonArray.get(i), "skip[" + i + "]"));
/*     */         }
/*     */       } else {
/*  65 */         stringBuilder.append(afd.a(jsonElement, "skip"));
/*     */       } 
/*     */     } 
/*     */     
/*  69 */     return new dnj(new vk(
/*  70 */           afd.h(☃, "file")), 
/*  71 */         afd.a(☃, "size", 11.0F), 
/*  72 */         afd.a(☃, "oversample", 1.0F), f1, f2, stringBuilder
/*     */ 
/*     */         
/*  75 */         .toString());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public deb a(ach ☃) {
/*  82 */     STBTTFontinfo sTBTTFontinfo = null;
/*  83 */     ByteBuffer byteBuffer = null;
/*  84 */     try (acg ☃ = ☃.a(new vk(this.b.b(), "font/" + this.b.a()))) {
/*  85 */       a.debug("Loading font {}", this.b);
/*  86 */       sTBTTFontinfo = STBTTFontinfo.malloc();
/*  87 */       byteBuffer = dex.a(acg.b());
/*  88 */       byteBuffer.flip();
/*  89 */       a.debug("Reading font {}", this.b);
/*  90 */       if (!STBTruetype.stbtt_InitFont(sTBTTFontinfo, byteBuffer)) {
/*  91 */         throw new IOException("Invalid ttf");
/*     */       }
/*  93 */       return new ded(byteBuffer, sTBTTFontinfo, this.c, this.d, this.e, this.f, this.g);
/*  94 */     } catch (Exception exception) {
/*  95 */       a.error("Couldn't load truetype font {}", this.b, exception);
/*  96 */       if (sTBTTFontinfo != null) {
/*  97 */         sTBTTFontinfo.free();
/*     */       }
/*  99 */       MemoryUtil.memFree(byteBuffer);
/*     */       
/* 101 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */